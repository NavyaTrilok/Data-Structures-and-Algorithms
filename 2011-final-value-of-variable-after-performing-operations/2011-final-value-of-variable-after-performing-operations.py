class Solution(object):
    def finalValueAfterOperations(self, operations):
        X = 0
        for operation in operations:
            if '+' in operation:
                X = X+1
            else:
                X = X-1
            
        
        return X
        