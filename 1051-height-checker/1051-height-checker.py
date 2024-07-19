class Solution(object):
    def heightChecker(self, heights):
        ans = 0
        expected = sorted(heights)
        print(expected)
        for i in range(len(heights)):
            if heights[i]!=expected[i]:
                ans+=1
        
        return ans
        
        
#Difference between sorted and sort

#sort() directly modifies the original list, while sorted() keeps the original list intact and #creates a new sorted list.

