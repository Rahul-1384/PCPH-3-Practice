import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        Stack<Integer> ans=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        while(!st.empty()){
            ans.push(st.pop());
        }
        while(!ans.empty()){
            System.out.println(ans.pop());
        }
    }
}

