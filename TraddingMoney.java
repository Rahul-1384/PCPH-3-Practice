import java.util.*;

public class TraddingMoney {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=1;
        for(int i=0;i<n;i++){
            for(int j=i;j>=0;j--){
                while(!st.empty() && arr[i]<arr[st.peek()]){
                    count++;
                }
            }
            st.push(i);
        }
    }
}
