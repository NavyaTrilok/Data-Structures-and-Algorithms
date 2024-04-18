class Solution(object):
    def sortPeople(self, names, heights):
        res = []
        for i in range(len(names)):
            res.append([heights[i],names[i]])
        res = sorted(res,reverse=True)
        return [name for height,name in res]
        