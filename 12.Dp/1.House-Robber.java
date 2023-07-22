class Solution {
  
  public int rob(int[] nums) {

    if (nums.length < 2) {

      return nums[0];
    }

    //array for storing  the maximum loot at each index

    int[] dp = new int[nums.length];

    //Memorize maximum loot at first two index

    dp[0] = nums[0];
    dp[1] = Math.max(nums[0], nums[1]);

    for (int i = 2; i < nums.length; i++) {

      //Main Logic

      dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
    }

    return dp[nums.length - 1];

  }
}