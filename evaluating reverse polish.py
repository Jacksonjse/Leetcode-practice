class Solution(object):
    def evalRPN(self, tokens):
        stack = []
        op = {
    '+': operator.add,
    '-': operator.sub,
    '*': operator.mul,
    '/': operator.truediv
}
        for i in tokens:
            if i not in op:
                stack.append(int(i))
            else:
                if stack:
                    v1 = stack.pop()
                    v2 = stack.pop()
                    temp = int((op[i](v2, v1)))
                    stack.append(temp)
        return stack[0]