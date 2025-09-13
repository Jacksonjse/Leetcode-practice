class Solution(object):
    def containsDuplicate(self, nums):
        hashmap = {}
        for i, n in enumerate(nums):
            if n in hashmap:
                return True
            hashmap[n] = i
        return False