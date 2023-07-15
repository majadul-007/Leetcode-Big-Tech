class Solution {
    public boolean isHappy(int n) {



//initialize hashset
        Set<Integer> usedIntegers = new HashSet<>();



//infinity loop
        while (true) {

            int sum = 0;

//check untill n!= 0
            while (n != 0) {

//square of last digit
                sum += Math.pow(n % 10, 2.0);
                n = n / 10;
            }

//check if sum=1 then it's happy number
            if (sum == 1) {
                return true;
            }

//if not then sum is the new number
            n = sum;

//check if it already present in hashset
            if (usedIntegers.contains(n)) {
                return false;
            }

//if not then put it in hashset
            usedIntegers.add(n);
        }



    }
}
