class Solution {

  public int[] shuffle(int[] nums, int n) {

    //initialize res array

    int[] res = new int[nums.length];

    // loop through k to the n

    for (int k = 0; k < n; k++) {
      
      // assign the value of nums[k] to res[2*k] (even index)
      // and assign the value of nums[n+k] to res[2*k+1] (odd index)

      res[2 * k] = nums[k];
      res[2 * k + 1] = nums[n + k];
    }

    return res;
  }
}
