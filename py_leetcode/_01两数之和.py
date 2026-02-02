def twoSum(nums, target):
    # 定义一个哈希表，用于存储「元素值: 元素下标」
    num_map = {}
    # 遍历数组，同时获取元素下标和值
    for index, num in enumerate(nums):
        # 计算需要匹配的另一个值（目标值 - 当前值）
        complement = target - num
        # 检查哈希表中是否存在这个匹配值
        if complement in num_map:
            # 存在则返回：匹配值的下标 + 当前元素的下标
            return [num_map[complement], index]
        # 不存在则将当前元素和下标存入哈希表，供后续元素匹配
        num_map[num] = index
    # 题目假设必有答案，这里仅作为容错返回
    return []


# def twoSum(nums, target):
#     # 获取数组长度
#     n = len(nums)
#     # 第一层循环：遍历每个元素作为第一个候选值
#     for i in range(n):
#         # 第二层循环：遍历第一个元素之后的所有元素（避免重复检查和重复使用元素）
#         for j in range(i + 1, n):
#             # 检查两数之和是否等于目标值
#             if nums[i] + nums[j] == target:
#                 # 返回两个元素的下标
#                 return [i, j]
#     # 题目假设必有答案，这里仅作为容错返回
#     return []

# 测试
nums = [2, 7, 11, 15]
target = 9
print(twoSum(nums, target))  # 输出：[0, 1]

print("kuaidianhao")