class Solution {
        public int arrangeCoins(int n) {


//******* *Brute force O(n) time**********

                int res = 0;

//initialize staircase for first step
                int stairStep = 1;

//loop untill coins is greater then equal to stairstep


                while (n >= stairStep) {

                        n -= stairStep; // Decrease the number of coins by the current step size
                        res++; // Increment the number of complete staircases
                        stairStep++; 
                
                }

                return res;







        }
}