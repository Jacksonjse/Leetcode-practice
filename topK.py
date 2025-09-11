from collections import defaultdict
import heapq

hashmap = defaultdict(int)
def topK(n, k):
    for i in n:
        hashmap[i] += 1
    return heapq.nlargest(k, hashmap.keys(), key = hashmap.get)
topK([1,1,1,2,2,3], 2)