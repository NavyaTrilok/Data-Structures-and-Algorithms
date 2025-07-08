class MyQueue {
    Stack<Integer> mainS;
    Stack<Integer> helperS;

    public MyQueue() {
        mainS = new Stack<>();
        helperS = new Stack<>();
    }
    
    public void push(int x) {
        while(mainS.size()!=0){
            int rv = mainS.pop();
            helperS.add(rv);
        }
        mainS.push(x);
        while(helperS.size()!=0){
            int rv = helperS.pop();
            mainS.push(rv);
        }
        
    }
    
    public int pop() {
        if(mainS.size()==0){
            return -1;
        }else{
            return mainS.pop();
        }
    }
    
    public int peek() {
         if(mainS.size()==0){
            return -1;
        }else{
            return mainS.peek();
        }
        
    }
    
    public boolean empty() {
        if(mainS.size()==0){
            return true;
        }else{
            return false;
        }

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