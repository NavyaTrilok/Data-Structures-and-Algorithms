class Solution(object):
    def canPlaceFlowers(self, flowerbed, n):
        """
        :type flowerbed: List[int]
        :type n: int
        :rtype: bool
        """
        count = 0
        
        for i in range(len(flowerbed)):
                if flowerbed[i] == 0:
                    empty_left_plot = (i==0) or flowerbed[i-1] == 0
                    emplty_right_plt = (i == len(flowerbed)-1) or flowerbed[i+1] == 0
                    
                    if empty_left_plot and emplty_right_plt:
                        flowerbed[i] = 1
                        count += 1
        
        return count >= n
                    
                
            
            