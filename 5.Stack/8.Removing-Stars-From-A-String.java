class Solution {

    public String removeStars(String s) {

        //stack for character

        Stack<Character> st = new Stack<>();


        for (int i = 0; i < s.length(); i++) {
            

            char val = s.charAt(i);

//check val not equal * so we can push the value

            if (val != '*') {
                st.push(val);
            } else {
                st.pop(); // if val equal star then we need to pop out last value
            }
        }


        StringBuilder res = new StringBuilder();

        while (!st.isEmpty()) {

            res.append(st.pop());


        }

        return res.reverse().toString();

    }
}