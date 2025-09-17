class Solution(object):
    def isValid(self, s):
        stack = []
        para = { "}":"{", "]":"[", ")":"("}
        for i in s:
            if i in para:
                if stack and stack[-1] == para[i]:
                    stack.pop()
                else:
                    return False
            else:
                stack.append(i)
        if(len(stack)==0):
            return True
        else:
            return False
                
        