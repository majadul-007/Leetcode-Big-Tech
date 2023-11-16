class Solution {
    public String removeDuplicates(String s) {



//defining character type stack
        Stack<Character> stack = new Stack<>();



//loop through each string in given s
        for (char c : s.toCharArray()) {


//check if stack is empty and top of stack is same as c then pop it out

            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            }

            else {
                stack.push(c);
            }


        }


//using stringbuilder for efficient memory usage

        StringBuilder result = new StringBuilder();


//loop through each character in stack and then add to result
        for (char c : stack) {

            result.append(c);
        }

        return result.toString();
    }
}