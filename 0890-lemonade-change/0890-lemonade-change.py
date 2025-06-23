class Solution(object):
    def lemonadeChange(self, bills):
        """
        :type bills: List[int]
        :rtype: bool
        """
        fivedollarbills = 0
        tendollarbills = 0

        for b in bills:
            if b == 5:
                fivedollarbills += 1
            elif b == 10:
                if fivedollarbills > 0:
                    fivedollarbills -= 1
                    tendollarbills += 1
                else:
                    return False
            else:
                if fivedollarbills > 0 and tendollarbills > 0:
                    fivedollarbills -= 1
                    tendollarbills -= 1
                elif fivedollarbills >= 3:
                    fivedollarbills -= 3
                else:
                    return False
        
        return True
                    
        