class Solution:
    def leastBricks(self, wall: List[List[int]]) -> int:
        countGap = {0 : 0} # mapping pos : count gaps

        #  wall = [[1,2,2,1],[3,1,2],[1,3,2],[2,4],[3,1,2],[1,3,1,1]]
        

        for r in wall:
            total = 0

            for b in r[:-1]:
                total += b
                countGap[total] = 1 + countGap.get(total, 0);
        
        return len(wall) - max(countGap.values())



        