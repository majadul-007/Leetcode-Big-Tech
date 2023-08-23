class Solution {
  public int[] productExceptSelf(int[] nums) {


//left array for storing left product multiplication
//right array for storing right product multiplication

    int[] left = new int[nums.length];

    int[] right = new int[nums.length];


    left[0] = 1;

//skip the first index as it has no left value
    for (int i = 1; i < nums.length; i++) {

      left[i] = left[i - 1] * nums[i - 1];

    }


    right[nums.length - 1] = 1;

// skip the last index
    for (int i = nums.length - 2; i >= 0; i--) {

      right[i] = right[i + 1] * nums[i + 1];

    }

    int[] result = new int[nums.length];

    for (int i = 0; i < nums.length; i++) {

      result[i] = left[i] * right[i];
    }

    return result;

  }
}