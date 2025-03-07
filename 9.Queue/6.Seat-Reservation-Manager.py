class SeatManager:

    def __init__(self, n: int):
        # unres heap
        self.unres = [i for i in range(1, n+1)] 
        

    def reserve(self) -> int:
        # pop the minimum number from unres heap
        return heapq.heappop(self.unres)
        

    def unreserve(self, seatNumber: int) -> None:
        heapq.heappush(self.unres, seatNumber)
        




# Your SeatManager object will be instantiated and called as such:
# obj = SeatManager(n)
# param_1 = obj.reserve()
# obj.unreserve(seatNumber)