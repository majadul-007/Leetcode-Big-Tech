class Solution {
    
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        String concatword1 = String.join("", word1);
        String concatword2 = String.join("", word2);


        return concatword1.equals(concatword2);
        
    }
}