class Solution {
    public void rotate(int[] nums, int k) {


        k = k % nums.length; // Normalize k to handle cases where k > nums.length

        int left =0;
        int right = nums.length-1;

        while(left < right){

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--; 
        }


        left=0;
        right = k-1;

        while(left < right){

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }


        left = k;
        right = nums.length-1;

        while(left < right){

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }


        

//******** Using function for maintainable and optimized */


            k = k% nums.length;

            reverseArr(nums, 0, nums.length-1);
            reverseArr(nums, 0, k-1);
            reverseArr(nums, k, nums.length-1);

    }

    public void reverseArr(int[] nums, int left, int right){

         while(left < right){

             int temp = nums[left];
             nums[left] = nums[right];
             nums[right] = temp;
             left++;
             right--;
         }
    }
       

        
        
    
}