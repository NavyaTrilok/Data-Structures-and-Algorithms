class Solution:
    def lengthOfLongestSubstring(self,s):
        str1 = [False] * 256
        i = 0
        j = -1
        max_len = 0
        for i in range(len(s)):
            char_to_acquire = ord(s[i])
            while str1[char_to_acquire] == True:
                j += 1
                char_to_release = ord(s[j])
                str1[char_to_release] = False
            str1[char_to_acquire] = True
            ans_len = abs(i-j)
            max_len = max(ans_len,max_len)
            i = i + 1
        return max_len