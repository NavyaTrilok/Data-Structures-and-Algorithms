class Solution(object):
    def heightChecker(self, heights):
        ans = 0
        expected = sorted(heights)
        print(expected)
        for i in range(len(heights)):
            if heights[i]!=expected[i]:
                ans+=1
        
        return ans
        