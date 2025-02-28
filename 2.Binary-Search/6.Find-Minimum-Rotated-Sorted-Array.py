# Input: nums = [3,4,5,1,2]
# Output: 1
# Explanation: The original array was [1,2,3,4,5] rotated 3 times.

class Solution:
    def findMin(self, nums: List[int]) -> int:
        
        res = nums[0]
        left, right = 0, len(nums) -1

        while left <= right:
            if nums[l] < nums[r]:
                res = min(res, nums[l])
                break

            mid = (left + right) // 2
            res = min(res, nums[mid])

            if nums[mid] >= nums[left]:
                left = mid+1
            else:
                right = mid-1

        return res


        