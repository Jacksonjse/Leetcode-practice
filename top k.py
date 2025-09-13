from collections import defaultdict

class Solution(object):
    def topKFrequent(self, nums, k):
        hashmap = defaultdict(int)
        for i in nums:
            hashmap[i] +=1
        
        return heapq.nlargest(k, hashmap.keys(), key = hashmap.get)    
        