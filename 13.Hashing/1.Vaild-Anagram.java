class Solution {
    public boolean isAnagram(String s, String t) {


        if (s.length() != t.length()) {

            return false;
        }


        Map<Character, Integer> freqMap1 = new HashMap<>();
        Map<Character, Integer> freqMap2 = new HashMap<>();


        for (char c : s.toCharArray()) {

            freqMap1.put(c, freqMap1.getOrDefault(c, 0) + 1);


        }


        for (char c : t.toCharArray()) {
            freqMap2.put(c, freqMap2.getOrDefault(c, 0) + 1);
        }

        return freqMap1.equals(freqMap2);

//** using 1 hashMap
        

        // if(s.length() != t.length()){
        //     return false;
        // }


        // Map<Character, Integer> freqMap = new HashMap<>();


        // for(char c: s.toCharArray()){

        //     freqMap.put(c, freqMap.getOrDefault(c, 0) +1);
        // }


        // for(char c:t.toCharArray()){

        //     if(!freqMap.containsKey(c)){
        //         return false;
        //     }

        //     freqMap.put(c, freqMap.get(c) -1);
        // }

        // for(int count: freqMap.values()){

        //     if(count!= 0){
        //         return false;
        //     }
        // }

        // return true;
    }
}