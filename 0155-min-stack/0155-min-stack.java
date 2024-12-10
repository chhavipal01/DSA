import java.util.Stack;

class MinStack {
    Stack<Integer> st1, st2;

    public MinStack() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }

    public void push(int val) {
        st1.push(val);
        if (st2.isEmpty() || val <= st2.peek()) {
            st2.push(val);
        }
    }

    public void pop() {
        if (st1.peek().equals(st2.peek())) {
            st2.pop();
        }
        st1.pop();
    }

    public int top() {
        return st1.peek();
    }

    public int getMin() {
        return st2.peek();
    }
}
