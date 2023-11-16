class Solution {
    public String longestCommonPrefix(String[] strs) {

        StringBuilder res = new StringBuilder();

        Arrays.sort(strs);

        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length-1].toCharArray();


        for(int i=0; i<first.length; i++){

            if(first[i]==last[i]){
                
                res.append(first[i]);
            }else{
                res.append("");
                return res.toString();
            }
        }

        return res.toString();
        
    }
}