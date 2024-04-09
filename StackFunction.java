public class StackFunction{
    int st[];
    int tos=-1;
    int size=0;

    public StackFunction(){
        st=new int[5];
    }

    public StackFunction(int size){
        st=new int[size];
    }

    public boolean isEmpty(){
        if(tos==-1){
            System.out.println("Stack is Empty");
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if(tos==st.length-1){
            System.out.println("Stack is Full");
            return true;
        }
        return false;
    }
    public void push(int data) throws Exception{
        if(isFull()){
            throw new Exception("Overflow");
        }
        tos=tos+1;
        st[tos]=data;
        size++;
    }
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Underflow");
        }
        int data=st[tos];
        tos=tos-1;
        size--;
        return data;
    }
    public int peek()throws Exception{
        if(isEmpty()){
            throw new Exception("underflow");
        }
        int data=st[tos];
        return data;
    }
}