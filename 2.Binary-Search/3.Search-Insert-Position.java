class Solution {
    public int searchInsert(int[] nums, int target) {


        int high = nums.length - 1; //index of last element in the array
        int low = 0; //index of first element of the array


//loop untill low less than equal high

        while (low <= high) {

            int mid = (low + high) / 2; //get the mid value

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {

                high = mid - 1; //if mid is greater then shift high to previous of mid value
            } else {

                low = mid + 1; // if target is greater then point low to next of mid
            }

        }

        return low;



    }
}