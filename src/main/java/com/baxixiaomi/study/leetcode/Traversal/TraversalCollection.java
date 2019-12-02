package com.baxixiaomi.study.leetcode.Traversal;

import com.baxixiaomi.study.leetcode.arrayToList.ArrayToList;

import java.util.List;

/**
 * 遍历集合方法
 *
 * @author 吧嘻小米
 * @since 1.0-SNAPSHOT
 */
public class TraversalCollection {

    public static void traversalCollection(List list) {
        if (null == list) {
            System.out.println("list is null");
        } else {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }
    }

    public static void traversalArrays(int[] arr) {
        if (null == arr) {
            System.out.println("object is null");
        } else {
            List list = ArrayToList.arraysToList(arr);
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }

    }
}
