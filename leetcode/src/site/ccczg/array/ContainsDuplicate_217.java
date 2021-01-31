package site.ccczg.array;

import java.util.Arrays;

/**
 * 217. 存在重复元素
 * 给定一个整数数组，判断是否存在重复元素。
 *
 * 如果存在一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: [1,2,3,1]
 * 输出: true
 * 示例 2:
 *
 * 输入: [1,2,3,4]
 * 输出: false
 * 示例 3:
 *
 * 输入: [1,1,1,3,3,4,3,2,4,2]
 * 输出: true
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/contains-duplicate
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ContainsDuplicate_217 {
    /**
     * 思路：
     * 首先对数组进行排序，如果数组中有重复元素，
     * 经过排序之后重复元素必定相邻，由此就可以根据这个来判断是否存在重复元素。
     * @param nums 
     * @return
     */
    public static boolean containsDuplicate(int[] nums) {
        if(null == nums || nums.length <= 1) {
            return false;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] nums = {3,1};
        System.out.println(containsDuplicate(nums));
    }
}
