class Solution {
    public int firstUniqChar(String s) {

//initilize array

        int[] track = new int[26];


//loop through s input
        for (char c : s.toCharArray()) {


//track the frequency of each character

            track[c - 'a'] += 1;
        }


//loop through each character
        for (int i = 0; i < s.length(); i++) {

//check if any character freqency is 1 then return the index
            if (track[s.charAt(i) - 'a'] == 1) {
                return i;
            }



        }
        return -1;


    }
}