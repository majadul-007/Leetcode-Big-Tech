class Solution {
    public int[] dailyTemperatures(int[] temperatures) {


//declaring array and stack

        int[] answer = new int[temperatures.length];
        Stack<Integer> warmstack = new Stack<>();

        int n = temperatures.length;


//loop start from last index of temperatures

        for (int i = n - 1; i >= 0; i--) {

//check if warmstack is empty and if current day temp is greater than top stack temp or similar like top of stack temp is smaller than current index temp

            while (!warmstack.isEmpty() && temperatures[i] >= temperatures[warmstack.peek()]) {


//if true than remove the top of stack value which is smaller than current day
                warmstack.pop();
            }



            if (!warmstack.isEmpty()) {

//if top of stack is greater than current day temp than subtract the top index from current
                answer[i] = warmstack.peek() - i;
            }


//push the current index in stack
            warmstack.push(i);


        }

        return answer;




    }
}
