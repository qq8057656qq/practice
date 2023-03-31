package com.leo.practice.practice.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 罗马数字包含以下七种字符:I，V，X，L，C，D和M。
 * <p>
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 例如， 罗马数字 2 写做II，即为两个并列的 1 。12 写做XII，即为X+II。 27 写做XXVII, 即为XX+V+II。
 * <p>
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，
 * 例如 4 不写做IIII，而是IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。
 * 同样地，数字 9 表示为IX。这个特殊的规则只适用于以下六种情况：
 * <p>
 * I可以放在V(5) 和X(10) 的左边，来表示 4 和 9。
 * X可以放在L(50) 和C(100) 的左边，来表示 40 和90。
 * C可以放在D(500) 和M(1000) 的左边，来表示400 和900。
 * 给定一个罗马数字，将其转换成整数。
 * <p>
 * <p>
 * <p>
 * 示例1:
 * <p>
 * 输入:s = "III"
 * 输出: 3
 * 示例2:
 * <p>
 * 输入:s = "IV"
 * 输出: 4
 * 示例3:
 * <p>
 * 输入:s = "IX"
 * 输出: 9
 * 示例4:
 * <p>
 * 输入:s = "LVIII"
 * 输出: 58
 * 解释: L = 50, V= 5, III = 3.
 * 示例5:
 * <p>
 * 输入:s = "MCMXCIV"
 * 输出: 1994
 * 解释: M = 1000, CM = 900, XC = 90, IV = 4.
 * 提示：
 * <p>
 * 1 <= s.length <= 15
 * s 仅含字符 ('I', 'V', 'X', 'L', 'C', 'D', 'M')
 * 题目数据保证 s 是一个有效的罗马数字，且表示整数在范围 [1, 3999] 内
 * 题目所给测试用例皆符合罗马数字书写规则，不会出现跨位等情况。
 * IL 和 IM 这样的例子并不符合题目要求，49 应该写作 XLIX，999 应该写作 CMXCIX 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/roman-to-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class RomaToIntTest {

// *
// * 示例1:
// *
// * 输入:s = "III"
// * 输出: 3
    @Test
    void test_example_1() {
        RomaToInt romaToInt = new RomaToInt();
        assertEquals(3, romaToInt.romanToInt("III"));
    }
// * 示例2:
// *
// * 输入:s = "IV"
// * 输出: 4

    @Test
    void test_example_2() {
        RomaToInt romaToInt = new RomaToInt();
        assertEquals(4, romaToInt.romanToInt("IV"));
    }


// * 示例3:
// *
// * 输入:s = "IX"
// * 输出: 9

    @Test
    void test_example_3() {
        RomaToInt romaToInt = new RomaToInt();
        assertEquals(9, romaToInt.romanToInt("IX"));
    }


    // * 示例4:
// *
// * 输入:s = "LVIII"
// * 输出: 58
// * 解释: L = 50, V= 5, III = 3.
    @Test
    @DisplayName("输入 \"LVIII\" 输出: 58")
    void test_example_4() {
        RomaToInt romaToInt = new RomaToInt();
        assertEquals(58, romaToInt.romanToInt("LVIII"));
    }
// * 示例5:
// *
// * 输入:s = "MCMXCIV"
// * 输出: 1994
// * 解释: M = 1000, CM = 900, XC = 90, IV = 4.
        @Test
        void test_example_5() {
            RomaToInt romaToInt = new RomaToInt();
            assertEquals(1994, romaToInt.romanToInt("MCMXCIV"));
        }

}
