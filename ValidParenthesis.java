import java.util.Stack;

public class ValidParenthesis {
    public static boolean validParenthesis(String str){
        Stack<Character> st=new Stack<>();
        
        boolean flag=true;
        for(int i=0;i<str.length();i++){
            if(str.charAt(0)==')' || str.charAt(0)=='}' || str.charAt(0)==']'){
                return false;
            }
            else if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='['){
                st.push(str.charAt(i));
            }
            else if((str.charAt(i)==')' && !st.isEmpty() && st.peek()=='(') ||
                    (str.charAt(i)=='}' && !st.isEmpty() && st.peek()=='{') ||
                    (str.charAt(i)==']' && !st.isEmpty() && st.peek()=='[')){
                st.pop();
            }
            else{
                st.push(str.charAt(i));
            }
        }
        if(st.isEmpty() && flag==true){
            return true;
        }
        // else if(!st.isEmpty() && flag!=true){
        //     System.out.println(false);
        // }
        return false;
    }
    public static void main(String[] args) {
        String str="(){}[]";
        System.out.println(validParenthesis(str));
    }
}
