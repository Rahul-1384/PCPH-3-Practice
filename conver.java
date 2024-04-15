import java.util.*;

public class conver {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int lastDigit=0;
        int newNumber=0;
        while(n!=0){
            lastDigit=n%10;
            if(lastDigit>=5){
                lastDigit=9-5;
                newNumber=newNumber*10+lastDigit;
            }
            else{
                newNumber=newNumber*10+lastDigit;
            }
            n/=10;
        }
        System.out.println(newNumber);
    }
}
