package stacks;

public class LeetCode225_ImplementStackUsingQueues {

    public static void main(String[] args) {
        MyStack myStack1 = new MyStack();
        myStack1.push(1);
        myStack1.push(2);
        myStack1.top(); // return 2
        myStack1.pop(); // return 2
        myStack1.empty(); // return False

        System.out.println();
        MyStack myStack2 = new MyStack();
        myStack2.push(1);
        myStack2.pop(); // return 1
        myStack2.push(2);
        myStack2.top(); // return 2
    }

    static class MyStack {

        int[] stack;
        int count;

        public MyStack() {
            stack = new int[9];
            count = 0;
        }

        public void push(int x) {
            stack[count++] = x;
        }

        public int pop() {
            return stack[--count];
        }

        public int top() {
            return stack[count - 1];
        }

        public boolean empty() {
            return count == 0;
        }
    }

}
