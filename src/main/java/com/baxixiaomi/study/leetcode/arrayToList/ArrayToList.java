package com.baxixiaomi.study.leetcode.arrayToList;


import java.util.ArrayList;
import java.util.List;

/**
 * 数组转换为集合
 *
 * @author 吧嘻小米
 * @since 1.0-SNAPSHOT
 */
public class ArrayToList {
    /**
     * 将数组转换为集合
     *
     * @param arrays 需要处理的数组
     * @return 返回转换后的集合
     */
    public static List arraysToList(int[] arrays) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < arrays.length; i++) {
            arrayList.add(arrays[i]);
        }
        return arrayList;
    }
}
