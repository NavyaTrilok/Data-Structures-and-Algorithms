class Solution(object):
    def shuffle(self, nums, n):
        ans = [None]*len(nums)
        i = 0
        j = len(nums)/2
        k = 0
        for k in range(0,len(nums),2):
            ans[k] = nums[i]
            ans[k+1] = nums[j]
            i+=1
            j+=1
        return ans