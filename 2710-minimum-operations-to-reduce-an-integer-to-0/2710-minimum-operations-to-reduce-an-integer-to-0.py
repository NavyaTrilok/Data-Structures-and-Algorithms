import math

class Solution(object):
    def minOperations(self, n):
        if n <= 0:
            # handle zero or negative if needed, or raise an error
            raise ValueError("Input must be a positive integer")
        
        log_val = math.log(n) / math.log(2)  # compute log base 2 safely
        
        if n == 2 ** int(log_val):
            return 1
        
        low = 2 ** int(log_val)
        high = 2 ** (int(log_val) + 1)
        
        d1 = n - low
        d2 = high - n
        
        return 1 + min(self.minOperations(d1), self.minOperations(d2))
