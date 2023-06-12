class MyStack {


//Initialize queue
    private Queue<Integer> queue;

    public MyStack() {

        queue = new LinkedList<>();



    }

    public void push(int x) {

        //push the element to the queue
        queue.add(x);

        //get the size
        int size = queue.size();

//loop through less than size
        for (int i = 0; i < size - 1; i++) {

//remove the top element from front and add it top to queue

            queue.add(queue.remove());
        }

    }

    public int pop() {

        return queue.remove();

    }

    public int top() {

        return queue.peek();

    }

    public boolean empty() {

        return queue.isEmpty();

    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */