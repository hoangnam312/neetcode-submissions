class MyStack {
    Queue<Integer> queue = new LinkedList<>();

    public void push(int x) {
        queue.offer(x);
        if (queue.size() <= 1) return;

        for (int i = 0; i < queue.size() - 1; i++) {
            queue.offer(queue.poll());
        }
    }

    public int pop() {
        if (queue.isEmpty()) return -1;
        return queue.poll();
    }

    public int top() {
        if (queue.isEmpty()) return -1;
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}