package com.itgongzi.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target的那两个整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案，并且你不能使用两次相同的元素。
 * 你可以按任意顺序返回答案。
 *
 * @author GongziYu
 * @Description :
 * @date 2025/10/29 23:40:21
 */

public class _01两数之和 {

    public static int[] twoSum(int[] nums, int target) {
        //两数之和哈希表最优解实现。
        //定义HasMap，键：数组元素值，值，元素对应的下标
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        //遍历数组，同时获取小标和元素值
        for (int i = 0; i < n; i++) {
            int currentNum = nums[i];
            //计算补数：目标值 - 当前元素值
            int complement = target - currentNum;

            // 检查补数是否已经在HashMap中（即是否已经遍历过该补数）
            if (numMap.containsKey(complement)) {
                // 存在则返回：补数的下标 + 当前元素的下标
                return new int[]{numMap.get(complement), i};
            }

            // 不存在则将当前元素值和下标存入HashMap，供后续遍历查询
            numMap.put(currentNum, i);
        }
        return new int[]{};
    }

        /*        //两数之和暴力枚举
        //获取数组长度
        int n = nums.length;
        //外层循环；遍历每个元素的小标
        for (int i = 0; i < n; i++) {
            //内层循环：遍历i之后的元素下标j，避免重复检查和使用同一元素
            for (int j = i+1; j < n; j++) {
                //判断两数之和是否等于目标值
                if (nums[i] + nums[j] == target){
                    //返回找到的两个下标（Java中直接返回int数组即可）
                    return new int[]{i,j};
                }
            }
        }

        return new int[0];

    }

         */

    //测试方法
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
