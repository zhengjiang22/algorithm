package com.lyr.p03;

import java.util.HashSet;
import java.util.Set;

// @author zj
public class HuaDongChuangKou {
    public static void main(String[] args) {
        String s = "pwwkew";
        int i = lengthOfLongestSubstring(s);
        System.out.println(i);
    }

    /**
     * leetcode第三题
     * 滑动窗口和hash表求字符串中不重复的最长子串
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> hashSet = new HashSet<>(); 

        //开始位置
        int beginPosition = -1;
        //标记最大
        int markMax = 0;
        //字符串的长度
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if(i != 0){
                //需要移除上一个字符
                hashSet.remove(s.charAt(i - 1));
            }
            while (beginPosition + 1 < n && !hashSet.contains(s.charAt(beginPosition + 1))){
                hashSet.add(s.charAt(beginPosition + 1));
                ++beginPosition;
            }
            markMax = Math.max(markMax,beginPosition - i + 1);
        }
        return markMax;
    }
}
