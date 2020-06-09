package com.baxixiaomi.study.leetcode.arrays.Appearonce;

import java.util.*;

/**
 * 只出现一次
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * <p>
 * 说明：
 * <p>
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * <p>
 * 示例 1:
 * <p>
 * 输入: [2,2,1]
 * 输出: 1
 * 示例 2:
 * <p>
 * 输入: [4,1,2,1,2]
 * 输出: 4
 *
 * 异或运算
 * 每个数和0进行异或，结果都是本身
 * 每个数和自身异或，结果都是0
 * 异或运算是支持交换律和结合律的
 */
public class AppearOnce {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,1,2,4};
        singleNumber(arr);
        System.out.println(singleNumber(arr));

    }

    private static int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }

}
