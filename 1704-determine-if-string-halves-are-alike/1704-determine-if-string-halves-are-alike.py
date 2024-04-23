class Solution(object):
    def halvesAreAlike(self, s):
        vowels = set('aeiouAEIOU')
        a = b = 0
        i, j = 0, len(s) - 1
        while i < j:
            if s[i] in vowels:
                a += 1
            if s[j] in vowels:
                b += 1
                
            i += 1
            j -= 1
            
        return a == b
        
        