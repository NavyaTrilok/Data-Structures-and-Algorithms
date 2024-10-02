class Solution(object):
    def findRestaurant(self, list1, list2):
        """
        :type list1: List[str]
        :type list2: List[str]
        :rtype: List[str]
        """
        map = {}
        
        for i in range(len(list1)):
            for j in range(len(list2)):
                if list1[i] == list2[j]:
                    if i+j not in map:
                        map[i+j] = []
                    map[i+j].append(list1[i])
                    
                    
        min_index_sum = float('inf')
        for key in map.keys():
            min_index_sum = min(min_index_sum,key)
            
        res = []
        
        res.extend(map[min_index_sum])
        
        return res
    
    