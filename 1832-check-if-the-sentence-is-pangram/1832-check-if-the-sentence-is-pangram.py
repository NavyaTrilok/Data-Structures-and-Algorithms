class Solution(object):
    def checkIfPangram(self, sentence):
        a = set()
        for char in sentence:
            if char in a:
                pass
            else:
                a.add(char)
        
        return len(a) == 26
            
        
            
       
        