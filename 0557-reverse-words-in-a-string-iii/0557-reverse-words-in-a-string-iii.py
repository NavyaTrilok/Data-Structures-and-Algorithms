class Solution(object):
    def reverseWords(self, s):
        words = s.split()
        words = [word[::-1] for word in words]
        words = ' '.join(words)
        return words
       
    

        