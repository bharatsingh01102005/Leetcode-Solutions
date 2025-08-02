// Last updated: 8/2/2025, 10:46:01 PM
class MyStack {
    Queue<Integer> q= new LinkedList<>();
    public MyStack() {  
    }
    
    public void push(int x) {
        q.offer(x);
        for(int i=0 ; i<q.size()-1 ; i++){
            int t=q.poll();
            q.offer(t);
        }
    }
    
    public int pop() {
        return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}