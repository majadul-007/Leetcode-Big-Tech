class Solution {
  public int rob(int[] nums) {


    if (nums.length < 2) {
      return nums[0];
    }

//skip last and first house
    int[] skipLastHouse = new int[nums.length - 1];
    int[] skipFirstHouse = new int[nums.length - 1];


    for (int i = 0; i < nums.length - 1; i++) {

      skipLastHouse[i] = nums[i]; //last house will keep track from fast to second last
      skipFirstHouse[i] = nums[i + 1]; //will skip first value


    }

    //loot from both side using helper function

    int lootSkippingLast = lootHelper(skipLastHouse);
    int lootSkippingFirst = lootHelper(skipFirstHouse);


    return Math.max(lootSkippingLast, lootSkippingFirst);


  }




  private int lootHelper(int[] nums) {

    if (nums.length < 2) {
      return nums[0];
    }

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