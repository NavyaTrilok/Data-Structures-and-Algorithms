class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        s = ''
        for i in range(len(digits)):
            s = s + str(digits[i])
            
        num = int(s)
        
        num = num + 1
        
       
        #convert int to string        
        st = str(num)
        
        #convert string to integer array
        ans = []
        for i in st:
            int_value = int(i)
            ans.append(int_value)
    
        return ans
    
     
    
        
            
    
    
        
        