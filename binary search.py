class Solution(object):
    def search(self, nums, target):
        start = 0
        stop = len(nums)
        #learning binary tree in the 3rd sem well really helped me here
        while not stop <= start: 
            middle_element = (start+stop)//2 #was stuck here for a bit, but once i figured this out it was a piece of cake
            if nums[middle_element] == target:
                return middle_element
            elif nums[middle_element] > target:
                stop = middle_element
            elif nums[middle_element] < target:
                start = middle_element + 1
        else:
            return -1
        