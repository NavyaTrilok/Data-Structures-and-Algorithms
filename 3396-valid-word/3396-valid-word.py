class Solution(object):
    def isValid(self, word):
        """
        :type word: str
        :rtype: bool
        """
        vowels = set("aeiou")

        if len(word) < 3:
            return False

        has_vowel = False
        has_consonant = False
        
        for c in word:
            if c.isalpha():
                if c.lower() in vowels:
                    has_vowel = True
                else:
                    has_consonant = True
            elif c.isdigit():
                    continue
            else:
                return False
        
        return has_vowel & has_consonant

            