package arithmetic.q125;

import java.util.LinkedList;

/**
 * 验证回文串：
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * <p>
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * <p>
 * <p>
 * 示例 2:
 * <p>
 * 输入: "race a car"
 * 输出: false
 *
 * @author LinYan
 * @date 2020/7/27 17:26
 */
public class IsPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {
        LinkedList<Character> list = new LinkedList();

        for (char c : s.toLowerCase().toCharArray()) {
            if ((97 <= c && c <= 122) || (65 <= c && c <= 90) || (48 <= c && c <= 57)) {
                list.add(c);
            }
        }

        while (list.size() > 1) {
            if (!list.pollFirst().equals(list.pollLast())) {
                return false;
            }
        }

        return true;
    }
}
