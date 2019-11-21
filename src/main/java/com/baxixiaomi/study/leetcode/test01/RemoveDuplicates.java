package com.baxixiaomi.study.leetcode.test01;


import java.util.*;

/**
 * 给定一个数组，需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的长度
 * 例如：nums = [1,2,2] --> 返回新的长度为2,修改后的数组为[1,2]
 *
 * @author 吧嘻小米
 * @since 1.0-SNAPSHOT
 */
public class RemoveDuplicates {

    public static int removeDuplicates(int[] num) {
        ArrayList<Integer> arrayList = new ArrayList(num.length);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = num.length; i > 0; i--) {
            map.put(i, num[i]);
            if (num[num.length - 1] == num[i]) {
                arrayList.add(i);
            }
        }
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<Integer, Integer>> iterator = entries.iterator();
        for (int i = 0; i < arrayList.size(); i++) {
            while (iterator.hasNext()) {
                if (iterator.next().getKey() == arrayList.get(i)) {
                    iterator.remove();
                }
            }

        }
        return map.size();
    }

    public static void main(String[] args) {
        int[] num = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(num));

    }
}
