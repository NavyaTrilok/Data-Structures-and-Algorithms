class Solution(object):
    def areNumbersAscending(self, s):
        last = -1
        words = s.split(" ")
        
        for i in s.split(" "):
            if i.isdigit():
                num = int(i)
                if num <= last:
                    return False
                last = num
        return True
        