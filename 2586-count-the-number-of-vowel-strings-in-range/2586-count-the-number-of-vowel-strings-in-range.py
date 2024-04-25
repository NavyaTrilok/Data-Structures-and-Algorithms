class Solution(object):
    def vowelStrings(self, words, left, right):
        vowels = set("aeiou")
        count = 0
        for i in range(left,right+1):
            if words[i][0:1] in vowels and words[i][len(words[i])-1:] in vowels:
                count+=1
                
        return count
        