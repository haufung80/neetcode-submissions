class MinStack {
    private Deque<Integer> minStack = new ArrayDeque<>();
    private Deque<Integer> stack = new ArrayDeque<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        stack.addLast(val);
        if (minStack.size() > 0) {
            minStack.addLast(Math.min(minStack.peekLast(), val));
        } else minStack.addLast(val);
    }
    
    public void pop() {
        stack.removeLast();
        minStack.removeLast();
    }
    
    public int top() {
        return stack.peekLast();
    }
    
    public int getMin() {
        return minStack.peekLast();
    }
}
