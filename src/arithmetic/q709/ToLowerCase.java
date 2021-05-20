package arithmetic.q709;

/**
 * @author by LinYan
 * @classname ToLowerCase
 * @description 实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
 * <p>
 * 示例 1：
 * <p>
 * 输入: "Hello"
 * 输出: "hello"
 * <p>
 * 示例 2：
 * <p>
 * 输入: "here"
 * 输出: "here"
 * <p>
 * 示例 3：
 * <p>
 * 输入: "LOVELY"
 * 输出: "lovely"
 * <p>
 * Related Topics 字符串
 * @date 2021/5/20 15:18
 */
public class ToLowerCase {

    public static void main(String[] args) {
        String str = "LOVELY";
        char[] array = str.toCharArray();
        for (int index = 0; index < array.length; index++) {
            array[index] |= 32;
        }

        System.out.println(String.valueOf(array));
    }

}
