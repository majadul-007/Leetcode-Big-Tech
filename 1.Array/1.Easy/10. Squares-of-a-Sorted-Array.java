class Solution {
    public int[] sortedSquares(int[] nums) {


// *********O(N log n) time complexity */

        int[] res = new int[nums.length];


        for (int i = 0; i < nums.length; i++) {

            int n = Math.abs(nums[i]);

            nums[i] = n * n;


        }
        Arrays.sort(nums);

        return nums;






        //********/O(N) time complexity

        

        for (int i = 0; i < nums.length; i++) {

            int n = nums[i];

            nums[i] = n * n;
        }


        int head = 0;
        int tail = nums.length - 1;
        int[] res = new int[nums.length];


        for (int pos = nums.length - 1; pos >= 0; pos--) {

            if (nums[head] > nums[tail]) {

                res[pos] = nums[head];
                head++;

            } else {

                res[pos] = nums[tail];

                tail--;

            }

        }

        return res;




    }
}