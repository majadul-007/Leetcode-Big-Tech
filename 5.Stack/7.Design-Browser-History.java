class BrowserHistory {

//two stack for keep tracking current history and forward history

    Stack<String> currHistory = new Stack<>();
    Stack<String> fwdHistory = new Stack<>();

    public BrowserHistory(String homepage) {

        currHistory.push(homepage);

    }


    public void visit(String url) {

// Clear forward history as we are visiting a new URL

        while (!fwdHistory.isEmpty()) {
            fwdHistory.pop();
        }

        currHistory.push(url);



    }

    public String back(int steps) {

        while (steps > 0  && currHistory.size() > 1) {

// Move the current URL to the forward history stack

            fwdHistory.push(currHistory.pop());
            steps--; //decrease the steps

        }

        return currHistory.peek();

    }


    public String forward(int steps) {

        while (steps > 0 && fwdHistory.size() > 0) {

// Move the current URL to the current history stack
            currHistory.push(fwdHistory.pop());
            steps--;

        }



        return currHistory.peek();
    }
}

   