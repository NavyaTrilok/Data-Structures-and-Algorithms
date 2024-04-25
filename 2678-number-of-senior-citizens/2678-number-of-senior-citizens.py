class Solution(object):
    def countSeniors(self, details):
        count = 0
        for detail in details:
            s = detail[11:13]
            print(s)
            if int(s) > 60:
                count += 1
        return count
        