class Solution(object):
    def maximumNumberOfStringPairs(self, words):
        count = 0
        
        strings = set()
        
        for word in words:
            if word in strings:
                count += 1
            else:
                strings.add(word[::-1])
        
        return count
        