class MyStack {
    Queue<Integer>p = new LinkedList<>();
    //Queue<Integer>q = new LinkedList<>();
    //private int top;
    public MyStack() {
        
        
       // q = new Linkedlist<>();
    }
    
    public void push(int x) {
        p.offer(x);
        for(int i =1;i<p.size();i++){
            p.offer(p.poll());
        }
        //top = x;
    }
    
    public int pop() {
        return p.remove();
    }
    
    public int top() {
        
        return p.peek();
    }
    
    public boolean empty() {
        
        return p.isEmpty();
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