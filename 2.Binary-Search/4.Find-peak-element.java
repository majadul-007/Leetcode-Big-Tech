class Solution {
    public int findPeakElement(int[] nums) {

        int left = 0;
        int right = nums.length - 1;
        int mid = 0;


        while (left <= right) {

            mid = (left + right) / 2;

            //left neigbour is greater

            if (mid > 0 && nums[mid] < nums[mid - 1]) {

                right = mid - 1;
            }

            //right neighbour is greater
            else if (mid < nums.length - 1 && nums[mid] < nums[mid + 1]) {

                left = mid + 1;
            } else {
                return mid;
            }
        }

        return mid;

    }
}