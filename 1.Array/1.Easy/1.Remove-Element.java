class Solution {
    public int removeElement(int[] nums, int val) {

        //ArrayList<Integer> result = new ArrayList<>();


        int newIndex = 0;


//loop through till nums
        for(int i=0; i<nums.length ; i++){

            if(nums[i] != val){ //put values which is not equal to val

                nums[newIndex] = nums[i];
                newIndex++;

            }
        }
        return newIndex;
    }
}