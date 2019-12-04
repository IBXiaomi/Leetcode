package com.baxixiaomi.study.leetcode.Traversal;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 遍历map集合方法
 *
 * @author 吧嘻小米
 * @since 1.0-SNAPSHOT
 */
public class TraversalMap {

    public static void traversalMap(Map map) {
        if (null == map) {
            System.out.println("map is null");
        } else {
            Set set = map.entrySet();
            Iterator iterator = set.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }

    public static void traversalSet(Set hashSet) {
        if (null == hashSet) {
            System.out.println("hashSet is null");
        } else {
            Iterator iterator = hashSet.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }
}
