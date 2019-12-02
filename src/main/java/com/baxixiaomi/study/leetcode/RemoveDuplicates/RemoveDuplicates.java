package com.baxixiaomi.study.leetcode.RemoveDuplicates;


import com.baxixiaomi.study.leetcode.Traversal.TraversalCollection;
import com.baxixiaomi.study.leetcode.Traversal.TraversalMap;
import com.baxixiaomi.study.leetcode.arrayToList.ArrayToList;

import java.util.*;

/**
 * 给定一个数组，需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的长度
 * 例如：nums = [1,2,2] --> 返回新的长度为2,修改后的数组为[1,2]
 *
 * @author 吧嘻小米
 * @since 1.0-SNAPSHOT
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 4, 5, 5, 6};
        //setImplementation(arr);
        listImplementation(arr);
    }

    /**
     * 通过set集合的特征，不重复，无序，没有索引,实现数组的原地删除
     *
     * @param arr 需要处理的数组
     */
    private static void setImplementation(int[] arr) {
        List list = arraysToList(arr);
        HashSet hashset = new HashSet<>();
        hashset.addAll(list);
        TraversalMap.traversalSet(hashset);
    }

    /**
     * 通过集合实现原地删除
     *
     * @param arr 需要处理的数组
     */
    private static void listImplementation(int[] arr) {
        ArrayList arrayList = new ArrayList();
        for (int k = 0; k < arr.length; k++) {
            if (!arrayList.contains(arr[k])) {
                arrayList.add(arr[k]);
            }
        }
        TraversalCollection.traversalCollection(arrayList);

    }


    /**
     * 将数组转换为集合
     *
     * @param arrays 需要处理的数组
     * @return 返回转换后的集合
     */
    private static List arraysToList(int[] arrays) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < arrays.length; i++) {
            arrayList.add(arrays[i]);
        }
        return arrayList;
    }

}
