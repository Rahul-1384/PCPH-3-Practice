import java.util.*;

public class conver {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int N=n;
        int arr[]=new int[n];
        if(n==0){
            System.out.print("0");
        }
        else{
            while(n!=0){
                n/=10;
                count++;
            }
            for(int i=count-1;i>=0;i--){
                arr[i]=N%10;
                N/=10;
            }
            for(int i=0;i<count;i++){
                if(arr[i]>=5){
                    arr[i]=9-arr[i];
                }
            }
        }
        for(int i=0;i<count;i++){
            System.out.print(arr[i]);
        }
    }
}
