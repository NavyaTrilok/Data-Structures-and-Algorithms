class Solution(object):
    def mostWordsFound(self, sentences):
        length = 0
        
        for sentence in sentences:
            split_sentence = sentence.split()
            
            if length < len(split_sentence):
                length = len(split_sentence)
        
        return length
        