class Solution {
    public String removeKdigits(String num, int k) {


        if (k == num.length() || k > num.length()) {
            return "0";
        }

        Stack<Character> mySt = new Stack<>();


        for (int i = 0; i < num.length(); i++) {

            char ch = num.charAt(i);

            while (!mySt.isEmpty() && k > 0 && mySt.peek() > ch) {

                mySt.pop();
                k--;
            }

            mySt.push(ch);
        }

        while (!mySt.isEmpty() && k > 0) {
            mySt.pop();
            k--;

        }

        StringBuilder sb = new StringBuilder();
        while (!mySt.isEmpty()) {

            sb.append(mySt.pop());
        }

        sb.reverse();


        while (sb.length() > 1 && sb.charAt(0) == '0') {

            sb.deleteCharAt(0);
        }


        return sb.toString();



    }
}