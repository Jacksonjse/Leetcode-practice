class Solution(object):
    def isAnagram(self, s, t):
        if len(s)==len(t):
            s_list = list(s)
            t_list = list(t)
            s_list.sort()
            t_list.sort()
            if s_list == t_list:
                return True
            else:
                return False
        else:
            return False
        