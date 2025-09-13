class Solution(object):
    def containsDuplicate(self, nums):
        self.seen = set()
        for i in nums:
            if i in self.seen:
                return True
            else:
                self.seen.add(i)
        return False