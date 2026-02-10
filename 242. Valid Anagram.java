class Solution(object):
    def isAnagram(self, s, t):
        if len(s) != len(t):
            return False
        
        countS_T = {}

        for i in range(len(s)):
            countS_T[s[i]] = 1 + countS_T.get(s[i], 0)
            countS_T[t[i]] = countS_T.get(t[i], 0) - 1

        for c in countS_T:
            if countS_T[c] != 0:
                return False
        return True