class Solution(object):
    def mostWordsFound(self, sentences):
        old_length=0
        for sentence in sentences:
            split_sentence = sentence.split()
            if old_length < len(split_sentence):
                old_length = len(split_sentence)
        
        return old_length
            
        
        