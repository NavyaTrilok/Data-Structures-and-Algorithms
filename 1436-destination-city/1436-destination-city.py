class Solution(object):
    def destCity(self, paths):
        #collecting the departure cities
        departure = set()
        for cities in paths:
            departure.add(cities[0])
         
        # if we encounter city that is not in the departure list, then it should be the desitnation
        for cities in paths:
            if cities[1] in departure:
                continue 
            else:
                return cities[1]
        
        