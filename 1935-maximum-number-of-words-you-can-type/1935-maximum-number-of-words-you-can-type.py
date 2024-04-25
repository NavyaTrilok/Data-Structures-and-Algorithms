class Solution(object):
    def canBeTypedWords(self, text, brokenLetters):
        words = text.split(" ")
        length_of_words = len(words)
        
        for word in words:
            for char in word:
                if char in brokenLetters:
                    length_of_words -= 1
                    break
        
        return length_of_words
            
        
        
        