class Solution(object):
    def countMatches(self, items, ruleKey, ruleValue):
        res = 0
        dct = {"type":0, "color":1, "name":2}
        value = dct[ruleKey]
        for item in items:
            if item[value] == ruleValue:
                res+=1
        return res
            
        
    
        