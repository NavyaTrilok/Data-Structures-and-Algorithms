class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        start = 0
        end = len(height)-1
        length = 0
        width = 0
        max_area = 0
        while start < end:
            length = min(height[start],height[end])
            width = abs(end-start)
            area = length * width
            max_area = max(area,max_area)
            if height[start] < height[end]:
                start = start+1
            else:
                end = end-1
        return max_area
