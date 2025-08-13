class Solution(object):
    def isPalindrome(self, s):
        l = 0
        r = 1
        st=""
        while r != len(s):
            if s[l].isalnum() and s[r].isalnum():
                st +=(s[l].lower()+s[r].lower())
                r+=1
            elif not s[r].isalnum():
                r+=1
            else:
                l+=1
        if st.lower() == st[::-1].lower():
            return True
        else:
            return False
        