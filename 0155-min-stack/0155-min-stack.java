class MinStack {
    
    Stack<Integer> minData;
    Stack<Integer> AllData;

    public MinStack() {
         minData = new Stack<>();
         AllData = new Stack<>();
    }
    
    public void push(int val) {
        
        if(AllData.size()==0){
            minData.push(val);
            AllData.push(val);
        }
        else if(val <= minData.peek()){
            minData.push(val);
            AllData.push(val);
        }else{
            AllData.push(val);
        }
        
    }
    
    public void pop() {
        if(AllData.size()==0){
            System.out.print("Stack underflow");
        }
        int rv = AllData.pop();
        if(rv==minData.peek()){
            minData.pop();
        }
        
        //return rv;
    }
    
    public int top() {
        if(AllData.size()==0){
            return -1;
        }
        return AllData.peek();
    }
    
    public int getMin() {
        
        if(minData.size()==0){
            return -1;
        }
        return minData.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */