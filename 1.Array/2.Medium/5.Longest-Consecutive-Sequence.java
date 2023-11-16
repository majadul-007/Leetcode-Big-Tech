class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestSeq =0;
        
        for(int num: numSet){
            
        int currentSeq = 1;

            //start of a sequence
            if(!numSet.contains(num-1)){
                
                while(numSet.contains(num+1)){
                    num++;
                    currentSeq++;
                    
                }

                longestSeq = Math.max(longestSeq, currentSeq);

            }
        }

        return longestSeq;

        
    }
}
