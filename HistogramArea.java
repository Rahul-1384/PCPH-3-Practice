import java.util.*;
public class HistogramArea {
    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};
        int n=arr.length;
        int nsl[]=new int[arr.length];
        int nsr[]=new int[arr.length];
        Arrays.fill(nsr,n);
        Arrays.fill(nsl,-1);
        Stack<Integer> st=new Stack<>();
        // next smaller right
        for(int i=0;i<arr.length;i++){
            while(!st.empty() && arr[i]<=arr[st.peek()]){
                nsr[st.pop()]=i;
            }
            st.push(i);
        }
        while(!st.empty()){
            st.pop();
        }
        // next smaller left
        for(int i=arr.length-1;i>=0;i--){
            while(!st.empty() && arr[i]<=arr[st.peek()]){
                nsl[st.pop()]=i;
            }
            st.push(i);
        }
        System.out.print("nsl");
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(nsl[i]+" ");
        }
        System.out.println();
        System.out.println("nsr");
        for(int i=0;i<arr.length;i++){
            System.out.print(nsr[i]+" ");
        }
        System.out.println();
       int maxArea=0;
        for(int i=0;i<arr.length;i++){
            int height=arr[i];
            int width= nsr[i] - nsl[i] - 1;
            int area=height*width;
            if(maxArea<area){
                maxArea=area;
            }
        }
        System.out.println("maximum area is "+maxArea);
        
    }
}
