class Solution(object):
    def reversePrefix(self, word, ch):
        if ch not in word:
            return word
        res = word.index(ch)
        ans = word[:res+1][::-1]+word[res+1:]
        return ans
        #stringname[stringlength::-1] 
        #word[idx+1:]