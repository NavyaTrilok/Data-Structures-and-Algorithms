class Solution(object):
    def summaryRanges(self, nums):
        """
        :type nums: List[int]
        :rtype: List[str]
        """
        """"
        ranges = []
        
        for n in nums:
            if ranges and ranges[-1][1] == n - 1:
                ranges[-1][1] = n
            else:
                ranges.append([n,n])
        
        #return  [f'{x}->{y}'  if x ! = y else f'{x}' for x, y in ranges]
        return  [f'{x}->{y}'  if x !=  y else f'{x}' for x, y in ranges]
        
        """
        
        ranges = [] # [start, end] or [x, y]
        for n in nums:
            if ranges and ranges[-1][1] == n-1:
                ranges[-1][1] = n
            else:
                ranges.append([n, n])

        #return [f'{x}->{y}' if x != y else f'{x}' for x, y in ranges]
        return ['{}->{}'.format(x, y) if x != y else '{}'.format(x) for x, y in ranges]
        