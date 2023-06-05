/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {

        long high = n;
        long low = 0;
        long mid;
        long res = n;

//loop until low less then equal to high

        while (low <= high) {

//get the mid value

            mid = (low + high) / 2;

//update the res to new mid if it is bad version
//if mid val is bad version then move the high pointer mid-1 to check if previous val is bad or not

            if (isBadVersion((int)mid)) {

                res = (int)mid;
                high = mid - 1;

            }
//if mid is not bad then move the low pointer to next of mid value
            else {
                low = mid + 1;
            }



        }

        return (int)res;


    }
}