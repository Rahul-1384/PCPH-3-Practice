import java.util.Scanner;

public class LinkList {
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

    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // Taking input from user
        Node head=new Node(-1);
        Node curr=head;
        for(int i=0;i<n;i++){
            Node a=new Node(sc.nextInt());
            curr.next=a;
            curr=curr.next;
        }
        head=head.next;
        display(head);
    }
}
