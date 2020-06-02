package com.baxixiaomi.study.leetcode.arrays.Repeatingelement;

import java.util.HashSet;
import java.util.Set;

/**
 * 存在重复元素
 * 给定一个整数数组，判断是否存在重复元素。
 * <p>
 * 如果任意一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,3,1]
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: [1,2,3,4]
 * 输出: false
 * 示例 3:
 * <p>
 * 输入: [1,1,1,3,3,4,3,2,4,2]
 * 输出: true
 */
public class RepeatingElement {
    public static void main(String[] args) {
        int[] bytes = new int[]{1, 2, 3, 1};
        repeatingElement(bytes);
        System.out.println(repeatingElement(bytes));
    }

    private static boolean repeatingElement(int[] nums) {
        if (null == nums && nums.length == 0) {
            return false;
        }
        // 不建议将set的长度和nums的大小直接进行比较，比较耗时，且占内存
        Set<Integer> hashset = new HashSet<Integer>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (!hashset.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}
