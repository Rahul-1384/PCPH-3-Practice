import java.util.Scanner;
import java.util.Stack;

public class PallindromeLL {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;


    public static int isPallindrome(Node head,int n){
        Stack<Integer> st=new Stack<>();
        Node right=head;
        Node left=head;
        if(n%2==0){
            for(int i=0;i<n/2;i++){
                right=right.next;
            }
            Node rightStore=right;
            while(left.data!=rightStore.data){
                st.push(left.data);
                left=left.next;
                st.push(right.data);
                right=right.next;
            }
        }else{
            for(int i=0;i<n/2;i++){
                right=right.next;
            }
            while(left.data!=right.data){
                st.push(left.data);
                left=left.next;
                st.push(right.data);
                right=right.next;
            }
        }
        return st.peek();
       
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node head=new Node(-1);
        Node curr=head;
        for(int i=0;i<n;i++){
            Node a=new Node(sc.nextInt());
            curr.next=a;
            curr=curr.next;
        }
        head=head.next;
        System.out.println(isPallindrome(head, n));
    }
}
