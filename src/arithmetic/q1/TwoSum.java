package arithmetic.q1;

import java.util.Arrays;

/**
 * 两数之和:
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * 示例:
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * <p>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * @author LinYan
 * @date 2020/7/27 14:23
 */
public class TwoSum {

    public static void main(String[] args) {
        Arrays.stream(twoSum(new int[]{2, 7, 11, 15}, 9))
                .forEach(number -> System.out.print(number + " "));
    }

    /**
     * Step1：遍历nums，使nums中元素两两相加求和
     *
     * Step2：判断和是否与target相等，如果相等退出循环，输出两数下标
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] arrayIndex = new int[2];

        y:
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arrayIndex[0] = i;
                    arrayIndex[1] = j;
                    break y;
                }

            }
        }

        return arrayIndex;
    }
}
