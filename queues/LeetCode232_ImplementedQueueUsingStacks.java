package queues;

import java.util.Stack;

public class LeetCode232_ImplementedQueueUsingStacks {

    public static void main(String[] args) {

    }

    static class MyQueue {
        Stack<Integer> fifoQueue;

        public MyQueue() {
            fifoQueue = new Stack<>();
        }

        public void push(int x) {
            // fifoQueue.add(0, x);
            // Or I could added another queue, for example:
            Stack<Integer> tmpQueue = new Stack<>();
            while (!fifoQueue.isEmpty()) {
                tmpQueue.add(fifoQueue.pop());
            }
            tmpQueue.add(x);

            while(!tmpQueue.isEmpty()) {
                fifoQueue.add(tmpQueue.pop());
            }
        }

        public int pop() {
            return fifoQueue.pop();
        }

        public int peek() {
            return fifoQueue.peek();
        }

        public boolean empty() {
            return fifoQueue.isEmpty();
        }
    }
}
