class MinStack(object):

    def __init__(self):
        self.stack = []
        self.minStack = []

    def is_empty(self, stack):
        if len(self.stack == 0):
            return True
        else:
            return False

    def push(self, val):
        self.stack.append(val)
        if self.minStack:
            self.minStack.append(min(self.minStack[-1], val))
        else:
            self.minStack.append(val)

    def pop(self):
        self.stack.pop()
        self.minStack.pop()
        

    def top(self):
        return self.stack[-1]
        

    def getMin(self):
        return self.minStack[-1]
        


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(val)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()