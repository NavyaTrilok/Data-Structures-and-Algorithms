class Solution(object):
    def splitWordsBySeparator(self, words, separator):
        ans=[]
        for word in words:
            for w in word.split(separator):
                if w:
                    ans.append(w)
        return ans 
    
        