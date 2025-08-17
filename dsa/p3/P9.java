package dsa.p3;

//Reverse a linked list
class Node{
    int val;
    Node next;

    Node(int val){
        this.val=val;
    }
}
class LinkedList{
    Node head;

    void insertNode(int val){
        Node newNode=new Node(val);
        if (head==null){
            head=newNode;
        }
        else{
            Node temp=head;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }

    void printElements(){
        Node temp=head;

        while (temp!=null){
            System.out.print(temp.val);
            temp=temp.next;
        }
    }

    void reverseList(){
        Node i=null;
        Node j=head;
        Node k=j.next;

        while(true){
            j.next=i;
            i=j;
            j=k;
            if(j==null){
                break;
            }
            k=k.next;
            head=j;
        }
    }

}
public class P9 {

    public static void main(String[] args){
        LinkedList linkedList=new LinkedList();

        linkedList.insertNode(2);
        linkedList.insertNode(3);
        linkedList.insertNode(4);


        linkedList.reverseList();
        linkedList.printElements();


    }


}
