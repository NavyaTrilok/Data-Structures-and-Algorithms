class Solution(object):
    def countMatches(self, items, ruleKey, ruleValue):
        res = 0
        dict = {"type": 0, "color": 1, "name":2}
        value = dict[ruleKey]
        for item in items:
            if item[value] == ruleValue:
                res+=1
        return res
        