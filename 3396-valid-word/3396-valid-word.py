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
                lower_c = c.lower()
                if lower_c in vowels:
                    has_vowel = True
                else:
                    has_consonant = True
            elif c.isdigit():
                # digits are allowed, but they do not affect vowel/consonant flags
                continue
            else:
                # character is neither letter nor digit -> invalid word
                return False

        # Final check: must have at least one vowel AND at least one consonant
        return has_vowel and has_consonant
