class MinStack {

    //defining 2 stacks

    private Stack<Integer> stack;
    private Stack<Integer> minStack;


//initialize 2 stacks

    public MinStack() {

        stack = new Stack<>();
        minStack = new Stack<>();

    }

    public void push(int val) {

        stack.push(val);

//comparing given value with minStack top value then push it to minStack

        val = Math.min(val, minStack.isEmpty() ? val : minStack.peek());

        minStack.push(val);

    }

    public void pop() {

        stack.pop();
        minStack.pop();
    }

    public int top() {

//return the stack top value
        return stack.peek();
    }

    public int getMin() {

//as minimum element stored in minStack so can just peek the top element

        return minStack.peek();


    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */