package arithmetic.q14;

/**
 * @author LinYan
 * @date 2020/7/29 17:58
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{}));
    }

    public static String longestCommonPrefix(String[] strs) {
        String result = "";
        String prefix = "";

        if (strs == null || strs.length == 0) {
            return "";
        }

        w:
        for (char c : strs[0].toCharArray()) {
            prefix += c;
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].startsWith(prefix)) {
                    continue;
                } else {
                    break w;
                }
            }
            result += c;
        }

        return result;
    }
}
