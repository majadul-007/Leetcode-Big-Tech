class Solution {
    public void moveZeroes(int[] nums) {

        //declared two pointers
        int left = 0;
        int right = 0;

        // for(int right=0; right<nums.length; right++){


        while (right < nums.length) {

// If a non-zero element is found, swap it with the left-most zero element
            if (nums[right] != 0) {
                if (nums[right] != 0) {
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                    left += 1;
                }

// Move the right pointer to the next element in the array
                right++;
            }

        }
    }
