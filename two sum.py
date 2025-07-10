class Solution(object):
    def twoSum(self, nums, target):
        hashmap = {}
        for i, n in enumerate(nums):
            req = target - n
            if req in hashmap:
                return [hashmap[req],i]
            else:
                hashmap[n] = i
        
        