class Solution:
    def maxFreqSum(self, s):
        from collections import Counter
        vowels = ('a','e','i','o','u')
        vowel_set = ""
        consonent_set = ""
        for x in s:
            if x in vowels:
                vowel_set += x
            else:
                consonent_set += x
        vowel_max = max(Counter(vowel_set).values()) if Counter(vowel_set) else 0
        consonent_max = max(Counter(consonent_set).values()) if Counter(consonent_set) else 0
        return vowel_max+consonent_max