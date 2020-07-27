package arithmetic.q258;

/**
 * 各位相加：
 * 给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。
 * <p>
 * 示例:
 * <p>
 * 输入: 38
 * 输出: 2
 * 解释: 各位相加的过程为：3 + 8 = 11, 1 + 1 = 2。 由于 2 是一位数，所以返回 2。
 *
 * @author LinYan
 * @date 2020/7/27 14:50
 */
public class AddDigits {

    public static void main(String[] args) {
        System.out.println(addDigits(2998));
    }

    /**
     * 转为求树根，
     * n的树根：(n - 1) mod 9 +1
     */
    public static int addDigits(int num) {
        return (num - 1) % 9 + 1;
    }
}
