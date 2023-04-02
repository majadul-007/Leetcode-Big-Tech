class Solution {

  public int maximumWealth(int[][] accounts) {
    
    //keep track of richest customer
    int rich = 0;

    //go through all the customer accounts
    for (int[] customer : accounts) {
      //keep track of sum
      int sum = 0;

      //go through each account and add it to sum
      for (int accnt : customer) {
        sum += accnt;
      }

      //compare previous customer rich or not

      rich = Math.max(rich, sum);
    }

    return rich;
  }
}