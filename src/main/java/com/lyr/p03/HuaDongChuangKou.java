package com.lyr.p03;

import java.util.HashSet;

// @author zj
public class HuaDongChuangKou {
    public static void main(String[] args) {
        String s = "pwwkew";
        int i = lengthOfLongestSubstring(s);
        System.out.println(i);
    }

    /**
     * 滑动窗口和hash表求字符串中不重复的最长子串
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {
        //存储不重复的字符串
        HashSet<Character> hashSet = new HashSet<>();

        //记录从左侧最开始的索引位置
        int begin = 0;
        //返回的所有最长子串
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if(i != 0){
                //向hash表中移除第i - 1个元素
                hashSet.remove(s.charAt(i - 1));
            }
            while (begin < s.length() && !hashSet.contains(s.charAt(begin))){
                //向hash表中添加第i个元素
                hashSet.add(s.charAt(begin));
                begin++;
            }
            ans = Math.max(ans, begin - i);
        } 
        return ans;
    }
}
