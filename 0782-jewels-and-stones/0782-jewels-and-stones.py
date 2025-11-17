class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        set_of_jewels = set(jewels)
        count = 0
        for stone in stones:
            if stone in set_of_jewels:
                count += 1
        
        return count

        