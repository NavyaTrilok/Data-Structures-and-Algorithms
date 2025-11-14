class Solution:
    def countKeyChanges(self, s: str) -> int:
        count = 0
        for i in range(0,len(s)-1):
            if ord(s[i+1]) == ord(s[i])+32 or ord(s[i+1]) == ord(s[i]) - 32 or ord(s[i+1]) == ord(s[i]):
                print(count)
                count+=0
            else:
                count+=1
        return count
        