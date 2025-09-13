class Solution(object):
    #using a hashmap(defaultdict(list) -- stores the values in a list)
    #each character in a string is counted and its character count is listed out as an list with 26 elements
    #each of the alphabet
    #teh counts are used as key to store the strings that have the same number of those characters as values in the defaultdict
    
    def groupAnagrams(self, strs):
        res = defaultdict(list)
        for loop in strs:
            count = [0] * 26
            for i in loop:
                char = ord(i) - ord("a")
                count[char] +=1
            res[tuple(count)].append(loop)
        return res.values()

