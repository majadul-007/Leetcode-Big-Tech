class Solution {
    public boolean isIsomorphic(String s, String t) {


        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Character> charMap = new HashMap<>();


//loop through s length

        for(int i=0; i<s.length(); i++){

//get the character from s and t

            char mainC = s.charAt(i);
            char replaceC = t.charAt(i);

            if(!charMap.containsKey(mainC)){

                if(!charMap.containsValue(replaceC)){

                    charMap.put(mainC, replaceC);
                }
                else{
                    return false;
                }
            }else{

                char mappedChar = charMap.get(mainC);

                if(mappedChar != replaceC){
                    return false;
                }
            }
        }

        return true;


        
    }
}