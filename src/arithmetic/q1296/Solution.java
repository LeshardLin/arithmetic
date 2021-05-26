package arithmetic.q1296;

import java.util.*;

/**
 * @author by LinYan
 * @classname Solution
 * @description 给你一个整数数组 nums 和一个正整数 k，请你判断是否可以把这个数组划分成一些由 k 个连续数字组成的集合。
 * 如果可以，请返回 True；否则，返回 False。
 * <p>
 * <p>
 * <p>
 * 注意：此题目与 846 重复：https://leetcode-cn.com/problems/hand-of-straights/
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：nums = [1,2,3,3,4,4,5,6], k = 4
 * 输出：true
 * 解释：数组可以分成 [1,2,3,4] 和 [3,4,5,6]。
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：nums = [3,2,1,2,3,4,3,4,5,9,10,11], k = 3
 * 输出：true
 * 解释：数组可以分成 [1,2,3] , [2,3,4] , [3,4,5] 和 [9,10,11]。
 * <p>
 * <p>
 * 示例 3：
 * <p>
 * <p>
 * 输入：nums = [3,3,2,2,1,1], k = 3
 * 输出：true
 * <p>
 * <p>
 * 示例 4：
 * <p>
 * <p>
 * 输入：nums = [1,2,3,4], k = 3
 * 输出：false
 * 解释：数组不能分成几个大小为 3 的子数组。
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 1 <= nums.length <= 10^5
 * 1 <= nums[i] <= 10^9
 * 1 <= k <= nums.length
 * @date 2021/5/25 11:12
 */
public class Solution {

    public static void main(String[] args) {
//        int[] nums = new int[]{3, 2, 1, 2, 3, 4, 3, 4, 5, 9, 10, 11};
        int[] nums = new int[]{10, 9, 8, 1, 2, 3, 2, 3, 4, 4, 5, 6, 10, 10, 12};
        int k = 3;
        System.out.println(isPossibleDivide(nums, k));
        nums = new int[]{10, 9, 8, 1, 2, 3, 2, 3, 4, 4, 5, 6, 10, 11, 12};
        k = 3;
        System.out.println(isPossibleDivide(nums, k));
    }

    public static boolean isPossibleDivide(int[] nums, int k) {
        if (k == 1) {
            return true;
        } else if (nums.length % k != 0) {
            return false;
        }

        // Step 1 数据排序
        int key = 0;
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(key, num);
            key++;
        }

        List<Integer> tempList = new ArrayList<>(k);
        List<Integer> cursors = new ArrayList<>(k);

        while (!map.isEmpty()) {
            // Step 2 找到一致的k个数字，并记住其下标
            for (int index : map.keySet()) {
                if (cursors.size() == k) {
                    break;
                }

                if (tempList.size() == 0) {
                    tempList.add(map.get(index));
                    cursors.add(index);
                } else {
                    // 如果临时列表中已有元素，需要判断当前元素与临时列表中元素是否是连续的
                    if (map.get(index) - tempList.get(tempList.size() - 1) == 1) {
                        tempList.add(map.get(index));
                        cursors.add(index);
                    } else if (map.get(index) - tempList.get(tempList.size() - 1) == 0) {
                        continue;
                    }
                }
            }

            if (tempList.size() != k) {
                return false;
            }

            // Step 3 移除下标
            for (int index = cursors.size() - 1; index >= 0; index--) {
                map.remove(cursors.get(index));
            }
            tempList.clear();
            cursors.clear();
        }

        return true;
    }
}
