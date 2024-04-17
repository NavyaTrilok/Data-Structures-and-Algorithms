class Solution(object):
    def countConsistentStrings(self, allowed, words):
        count = 0
        flag = 0
        for word in words:
            for char in word:
                if char not in allowed:
                    flag = 1
                    break
            if flag == 0:
                count+=1
            if flag == 1:
                flag = 0
        
        return count
        