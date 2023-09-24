class Solution {
    
    public String restoreString(String s, int[] indices) {


        char[] res = new char[indices.length];


        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);


            res[indices[i]] = c;


        }

        // StringBuilder sb = new StringBuilder();

        // for(char c: res){
        //     sb.append(c);
        // }

        return String.valueOf(res);

    }
}