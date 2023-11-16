class Solution {
    public int missingNumber(int[] nums) {

        Set<Integer> myHashSet = new HashSet<>();


        for(int i=0; i<nums.length; i++){

            myHashSet.add(nums[i]);
            

        }


        for(int i=0; i<=myHashSet.size(); i++){

            if(!myHashSet.contains(i)){
                return i;
            }
        }
        return -1;
        
    }
}