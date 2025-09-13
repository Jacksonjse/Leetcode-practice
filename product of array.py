
def productExceptSelf(self, nums):
    ans = [0] * len(nums)
    for i in range(len(nums)):
    s = 1
    j = (i + 1)% len(nums)
    while(j != i):
        print(j)
        s *= nums[j]
        j = (j+1)%len(nums)
        print(s)
        print("---------")
    ans[i] = s
    print(ans)
    print("---------")
    print(nums)
    return ans
        