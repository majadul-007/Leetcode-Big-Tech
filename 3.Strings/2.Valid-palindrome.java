class Solution {
    public boolean isPalindrome(String s) {

        //two pointers for traverse

        int l = 0;
        int r = s.length() - 1;


        while (l < r) {

            Character left = s.charAt(l);
            Character right = s.charAt(r);


            if (!Character.isLetterOrDigit(left)) {
                l++;
                continue;
            }

            if (!Character.isLetterOrDigit(right)) {
                r--;
                continue;
            }

            if (Character.toLowerCase(left) != Character.toLowerCase(right)) {

                return false;
            }

            //shift the both pointers

            l++;
            r--;



        }

        return true;

    }
}