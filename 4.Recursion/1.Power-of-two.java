class Solution {
    public boolean isPowerOfTwo(int n) {


//check if n is zero
        if(n==0){
            return false; 
        }

//check if number number is one
        if(n==1){
            return true;
        }

//check if the number is odd

        if(n%2 != 0){
            return false;
        }

//recursive approach
    
        return isPowerOfTwo(n/2);




        
    }
}