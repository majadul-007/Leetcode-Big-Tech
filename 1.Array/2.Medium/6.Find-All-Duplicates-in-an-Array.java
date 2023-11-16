class Solution {
    public List<Integer> findDuplicates(int[] nums) {


///******** Using Hashset, O(n) and O(n) for both time and space


        Set<Integer> mySet = new HashSet<>();

        List<Integer> result = new ArrayList<>();

        for (int num : nums) {

            if (!mySet.contains(num)) {

                mySet.add(num);
            } else {

                result.add(num);
            }
        }



        return result;


//using  only arraylist, with O(1)space complexity

        List<Integer> duplicates = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {

            int n = Math.abs(nums[i]);


            if (nums[n - 1] < 0) {

                duplicates.add(n);
            } else {
                nums[n - 1] *= -1;
            }



        }

        return duplicates;



    }

}
