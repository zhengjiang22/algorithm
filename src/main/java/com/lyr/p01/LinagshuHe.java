package com.lyr.p01;

// @author zj

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * 给定一个整数数组 nums 和一个整数目标值 target，
 * 请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 * 
 * 你可以假设每种输入只会对应一个答案，并且你不能使用两次相同的元素。
 * 
 * 示例 1：
 *
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 * 示例 2：
 *
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 * 示例 3：
 *
 * 输入：nums = [3,3], target = 6
 * 输出：[0,1]
 */
public class LinagshuHe {

    public static void main(String[] args) {
        int[] nums = new int[]{3,3};
        int[] ints = twoSum(nums, 5);
        System.out.println(Arrays.toString(ints));
    }
    
    public static int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> hashTable = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(hashTable.containsKey(target - nums[i])){
                return new int[]{hashTable.get(target - nums[i]),i};
            }
            hashTable.put(nums[i], i);
        }
        return new int[0];
    }
}
