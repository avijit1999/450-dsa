import java.util.Scanner;
class Node {
    int val;
    Node next;
    
    Node(int value) {
        this.val = value;
    }
    static void print(Node N)
    {
        if(N!=null)
        {
            System.out.print(N.val+"->");
            print(N.next);
        }
        else{
            System.out.print("null");
        }
    }
}

class Solution
{
    //Function to reverse a linked list.
    static Node reverseList(Node head)
    {
        Node p=null,q=head,r=head.next;
        while(r!=null)
        {
            q.next=p;
            p=q;
            q=r;
            r=r.next;
        }
        q.next=p;
        return(q);
    }
}

public class reverse{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node head=new Node(sc.nextInt());
        Node tail=head;
        n--;
        while(n-->0)
        {
            Node N=new Node(sc.nextInt());
            tail.next=N;
            tail=N;
        }
        Node.print(head);
        head=Solution.reverseList(head);
        System.out.println();
        Node.print(head);
     }
}
