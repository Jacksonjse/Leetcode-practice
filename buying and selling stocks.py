class Solution(object):
    def maxProfit(self, prices):
        l = 0
        r = 1
        profit = 0
        while r != len(prices):
            if prices[l] > prices[r]:
                l = r
                r += 1
            else:
                if (prices[r] - prices[l]) > profit:
                    profit = prices[r] - prices[l]
                r += 1
        return profit