from collections import defaultdict

def group_anagrams(str):
    hashmap = defaultdict(list)
    for i in str:
        char = [0] * 26
        for j in i:
            list_place = ord(j) - ord('a')
            char[list_place] += 1
        hashmap[tuple(char)].append(i)
    print(hashmap.values())
group_anagrams(["eat","tea","tan","ate","nat","bat"])