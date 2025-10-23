class Solution(object):
    def numberOfSpecialChars(self, word):
        """
        :type word: str
        :rtype: int
        """
        count = 0
        s = set()
        for i in range(len(word)):
            if word[i].lower() in word and word[i].upper() in word:
                s.add(word[i].lower())
                

        return len(s)
        