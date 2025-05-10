import java.util.Stack;

class Queue_Using_Stack {
private Stack<Integer> stack1;
private Stack<Integer> stack2;


    public Queue_Using_Stack() {
    stack1 = new Stack<>();
    stack2 = new Stack<>();
    }

    public void push(int x) {

        stack1.push(x);


    }

    public void pop() {
        stack2.push(stack1.pop());

    }

    public int peek() {
return stack2.peek();
    }

    public boolean empty() {
return stack1.empty() && stack2.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */









