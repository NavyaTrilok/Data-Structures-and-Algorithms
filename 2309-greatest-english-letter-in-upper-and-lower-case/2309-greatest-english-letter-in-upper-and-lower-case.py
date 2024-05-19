class Solution(object):
    def greatestLetter(self, s):
        new = ""
        
        for i in s:
            if i.isupper() and i.lower() in s:
                if i>new:
                    new = i.upper()
                        
        return new
    
        