class Solution {
    public int singleNumber(int[] nums) {


        Map<Integer, Integer> myMap = new HashMap<>();

        int res = 0;


        for(int num: nums){

            myMap.put(num, myMap.getOrDefault(num, 0) + 1);

        }
q

        for(int k:nums){

             if(myMap.get(k) == 1){
                res = k;
        }
            }



            
        

        return res;



        
    }
}