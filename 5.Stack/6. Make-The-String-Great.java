class Solution {
    public String makeGood(String s) {

//initialize char type stack

        Stack<Character> st = new Stack<>();



//loop through the string

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

//if stack is empty then push the value

            if (st.isEmpty()) {
                st.push(c);
            }
//check if top of stack value equals to char value and handle logic for same letters for different cases

            else if (Character.toLowerCase(st.peek()) == Character.toLowerCase(c) && st.peek() != c) {
                st.pop();

            } else {
                st.push(c);
            }



        }


        StringBuilder res = new StringBuilder();

        for (int i = st.size() - 1; i >= 0; i--) {

            res.append(st.pop());
        }

        return res.reverse().toString();

    }
}