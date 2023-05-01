class Solution {
    public boolean isPerfectSquare(int num) {


        if (num == 1) {
            return true;
        }

//set low and high value

        int low = 0;
        int high = num / 2;



//loop through till high
        while (low <= high) {

            //set mid
            int mid = low + (high - low) / 2;


//if mid equal (num)^2 and divisble by 2 then return true
            if (mid == num / mid && num % mid == 0) {

                return true;

            }

            //if num is greater than mid then update low to mid value
            else if (mid < num / mid) {

                low = mid + 1;
//mid = (low+high)/2;

//if num is less than mid then set high value to mid-1

            } else {

                high = mid - 1;



            }

        }
        return false;

    }
}