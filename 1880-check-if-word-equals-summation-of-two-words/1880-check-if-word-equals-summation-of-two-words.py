class Solution(object):
    def isSumEqual(self, firstWord, secondWord, targetWord):
        alphabets = {'a': '0', 'b': '1', 'c': '2', 'd': '3', 'e': '4', 'f': '5', 'g': '6', 'h': '7', 'i': '8', 'j': '9'}

        target_val = 0

        temp = ""
        for i in targetWord:
            temp += alphabets[i]
        target_val = int(temp)

        temp = ""
        for i in firstWord:
            temp += alphabets[i]
        target_val -= int(temp)

        temp = ""
        for i in secondWord:
            temp += alphabets[i]
        target_val -= int(temp)

        if target_val:
            return False
        else:
            return True
        