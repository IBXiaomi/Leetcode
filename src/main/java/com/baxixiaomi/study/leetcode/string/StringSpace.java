package com.baxixiaomi.study.leetcode.string;

/**
 * 替换字符串中的空格
 *
 * @author 吧嘻小米
 * @date 2020/06/18
 */
public class StringSpace {

    private static final String str = "ba xi xiao mi";

    public static void main(String[] args) {
        replaceSpace(str);
    }

    private static void replaceSpace(String string) {
        int strLength = string.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strLength; i++) {
            char stringChar = string.charAt(i);
            if (String.valueOf(stringChar).equals(" ")) {
                sb.append("$$");
            } else {
                sb.append(stringChar);
            }
        }
        System.out.println(sb.toString());
    }
}
