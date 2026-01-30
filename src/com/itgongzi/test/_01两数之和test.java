package com.itgongzi.test;

import java.util.Arrays;
        import java.util.HashMap;
        import java.util.Map;

public class _01两数之和test {
    // 两数之和哈希表最优解实现
    public static int[] twoSum(int[] nums, int target) {
        // 定义HashMap，键：数组元素值，值：元素对应的下标
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        // 遍历数组，同时获取下标和元素值
        for (int i = 0; i < n; i++) {
            int currentNum = nums[i];
            // 计算补数：目标值 - 当前元素值
            int complement = target - currentNum;

            // 检查补数是否已经在HashMap中（即是否已经遍历过该补数）
            if (numMap.containsKey(complement)) {
                // 存在则返回：补数的下标 + 当前元素的下标
                return new int[]{numMap.get(complement), i};
            }

            // 不存在则将当前元素值和下标存入HashMap，供后续遍历查询
            numMap.put(currentNum, i);
        }

        // 题目说明每种输入对应一个答案，此处返回空数组仅为语法完整性
        return new int[]{};
    }

    // 测试方法
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        // 输出结果：[0, 1]
        System.out.println(Arrays.toString(result));
    }
}
