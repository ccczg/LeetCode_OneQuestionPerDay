package site.ccczg.string;

/**
 * @author Effort
 * @description
 * 给你一个字符串 s，由若干单词组成，单词之间用空格隔开。返回字符串中最后一个单词的长度。如果不存在最后一个单词，请返回 0 。
 *
 * 单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
 * 示例 1：
 *
 * 输入：s = "Hello World"
 * 输出：5
 * 示例 2：
 *
 * 输入：s = " "
 * 输出：0
 *  
 *
 * 提示：
 *
 * 1 <= s.length <= 104
 * s 仅有英文字母和空格 ' ' 组成
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/length-of-last-word
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021/2/1 1:31 下午
 */
public class LengthofLastWord_58 {
    public static int lengthOfLastWord(String s) {
        if(s.trim().length() == 0) {
            return 0;
        }
        String[] strings = s.split(" ");
        int length = strings.length;
        String string = strings[length - 1];
        return string.length();
    }
    public static void main(String[] args) {
        String s = " ";
        System.out.println(lengthOfLastWord(s));
    }
}
