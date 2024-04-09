public class StackClient {
    public static void main(String[] args) throws Exception{
        StackFunction st=new StackFunction();
        System.out.println(st.isEmpty());
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st.isFull());
        System.out.println(st.pop());
        System.out.println(st.peek());
    }
}
