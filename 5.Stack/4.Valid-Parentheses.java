class Solution {
    public boolean isValid(String s) {

        //myStack for storing opeing parentheses

        Stack<Character> myStack = new Stack<>();


//loop through each string and put it as character c


        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);




//check if character is opening parentheses then push it to stack

            if (c == '(' || c == '{' || c == '[') {
                myStack.push(c);

            } else {
                if (myStack.isEmpty()) {
                    return false;
                }

//get the top of stack and check either it matches with closing parenthese if match then continue


                char top = myStack.pop();

                if ((top != '('  && c == ')') || (top != '{' && c == '}') || (top != '[' && c == ']')) {

                    return false;

                } else {
                    continue;
                }

            }
        }

        return myStack.isEmpty();

    }
}