class Solution(object):
    def reversePrefix(self, word, ch):
        if ch not in word:
            return word
        for x in word:
            if x == ch:
                res = word.index(ch)
        ans = word[:res+1][::-1]+word[res+1:]
        return ans
        