public class LL1 {
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;   

    public static void oddEven(Node head){
        if(head==null || head.next==null){
            return;
        }
        Node dummyOdd=new Node(0);
        Node dummyEven=new Node(0);
        Node temp=head;
        while(temp!=null){
            if(temp.data%2!=0){
                dummyOdd=
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
