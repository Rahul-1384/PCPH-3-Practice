import java.util.Stack;

public class LeetcodeDailyTemp{
    public static void main(String[] args) {
        int arr[]={73,74,75,71,69,72,76,73};
        Stack<Integer> st=new Stack<>();
        int diff=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;i<arr.length;j++){
                if(arr[j]>arr[i]){
                    st.push(j-1);
                    break;
                }
                else{
                    st.push(0);
                    break;
                }
            }
        }
    }
}