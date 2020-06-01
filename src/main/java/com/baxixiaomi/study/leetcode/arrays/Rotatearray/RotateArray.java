package com.baxixiaomi.study.leetcode.arrays.Rotatearray;

/**
 * 旋转数组
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 * 示例 1:
 * <p>
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 * 示例 2:
 * <p>
 * 输入: [-1,-100,3,99] 和 k = 2
 * 输出: [3,99,-1,-100]
 * 解释:
 * 向右旋转 1 步: [99,-1,-100,3]
 * 向右旋转 2 步: [3,99,-1,-100]
 * 说明:
 * <p>
 * 尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
 * 要求使用空间复杂度为 O(1) 的 原地 算法。
 */
public class RotateArray {
    public static void main(String[] args) {
        int[] bytes = new int[]{1, 2,3};
        //rotateArray1(bytes, 3);
        rotateArray2(bytes, 1);
    }

    /**
     * 发现新的写法
     *
     * @param nums 数组
     * @param k 偏移
     */
    private static void rotateArray2(int[] nums, int k) {
        int temp, pre;
        for (int i = 0; i < k; i++) {
            pre = nums[nums.length - 1];
            for (int q = 0; q < nums.length; q++) {
                temp = nums[q];
                nums[q] = pre;
                pre = temp;
            }
        }
        for (int i = 0; i < nums.length; ++i) {
            System.out.println(nums[i]);
        }
    }


    /**
     * 吧嘻小米方法,暴力
     * 头秃写法
     *
     * @param nums 数组
     * @param k    偏移量
     */
    private static void rotateArray1(int[] nums, int k) {
        int[] resultBytes = new int[nums.length];
        if (nums.length == 0) {
            return;
        }
        if (nums.length == 1) {
            return;
        }
        if (k == 2 * (nums.length)) {
            System.arraycopy(nums, 0, resultBytes, 0, nums.length);
        }
        if (k > nums.length) {
            k = k - nums.length;
        }
        if (nums.length % 2 == 0 && k == nums.length / 2) {
            System.arraycopy(nums, k, resultBytes, 0, k);
            for (int i = 0; i < nums.length - k; i++) {
                resultBytes[k + i] = nums[i];
            }
        } else {
            System.arraycopy(nums, nums.length - k, resultBytes, 0, k);
            for (int i = 0; i < nums.length - k; i++) {
                resultBytes[k + i] = nums[i];
            }
        }
        System.arraycopy(resultBytes, 0, nums, 0, resultBytes.length);
    }
}
