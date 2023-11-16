class Solution {
    
    public List<List<String>> groupAnagrams(String[] strs) {


        Map<String, List<String>> myMap = new HashMap<>();


        for (String word : strs) {

//convert each string to char
            char[] eachChar = word.toCharArray();
            Arrays.sort(eachChar); ////sort each word

            String sortedWord = new String(eachChar); //convert the char to string


//put the sorted word when myMap doesn't contain it
            if (!myMap.containsKey(sortedWord)) {

                myMap.put(sortedWord, new ArrayList<>()); //create empty array for each unique sorted word


            }

            myMap.get(sortedWord).add(word); //put the original word to sorted word keys as a list
        }

        return new ArrayList<>(myMap.values());

    }
}