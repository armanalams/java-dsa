class MinStack {
    int stack[];
    int size;
    int top;
    int min[];


    public MinStack() {
        this.size=30000;
        this.stack=new int[size];
        this.top=-1;
        this.min=new int[size];;
        

    
        
    }
    
    public void push(int value) {
        if(top<size-1)
        {
            top++;
            stack[top]=value;   
        } 
        if(top==0)
        {
            min[top]=value;
        }else{
            min[top]=Math.min(value, min[top-1]);
        }
    }
    
    public void pop() {
        if(top>-1){
            top--;
        }
    }
    
    public int top() {
        if(top>-1){
            return stack[top];
        }
        return -1;
    }
    
    public int getMin() {
        return min[top];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
