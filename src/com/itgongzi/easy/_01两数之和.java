package com.itgongzi.easy;

import java.util.Arrays;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案，并且你不能使用两次相同的元素。
 * 你可以按任意顺序返回答案。
 *
 * @author GongziYu
 * @Description :
 * @date 2025/10/29 23:40:21
 */

public class _01两数之和 {

    public static int[] twoSum(int[] nums, int target){
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(nums,target);
        System.out.println(Arrays.toString(result));
    }

//    public static void main(String[] args){

//        System.out.println("我是你爹");
//        System.out.println("不用说谢谢哦");
//        System.out.println("nihaoa");
//    }
}
