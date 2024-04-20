import java.util.*;
public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,3};
        int ans[]=new int[arr.length];
        Arrays.fill(ans,-1);
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            while(!st.empty() && arr[i] > arr[st.peek()]){
                ans[st.pop()]=arr[i];
            }
            st.push(i);
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
