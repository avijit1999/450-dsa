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
    public static Node addOne(Node head) 
    { 
        //code here.
        head=reverse(head);
        Node q=head;
        while(true)
        {
            if(q.val+1<=9)
            {
                q.val=q.val+1;
                break;
            }
            else{
                q.val=0;
                if(q.next!=null)
                {
                    q=q.next;
                }
                else{
                    Node n=new Node(1);
                    q.next=n;
                    break;
                }
            }
        }
        head=reverse(head);
        return(head);
    }
    static Node reverse(Node head)
    {
        Node  p=null,q=head,r=head.next;
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

public class AddOne{

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
        head=Solution.addOne(head);
        System.out.println();
        Node.print(head);
     }
}
