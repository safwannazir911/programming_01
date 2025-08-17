package dsa.p2;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class MyLinkedList {
    Node head;

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    void deleteByValue(int value) {
        if (head == null) return;
        if (head.data == value) {
            head = head.next;
            return;
        }
        Node temp = head.next;
        while (temp != null && temp.data != value) {
            temp = temp.next;
        }

        Node delTemp = head;

        while (delTemp.next != temp) {
            delTemp = delTemp.next;
        }

        delTemp.next = temp.next;
    }

    void printList() {
       Node temp=head;
       while(temp !=null){
           System.out.print(temp.data+"->");
           temp=temp.next;
       }
        System.out.print("null");
    }
}


public class LinkedList {


    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.insertAtEnd(22);
        list.insertAtEnd(23);
        list.insertAtEnd(24);
        list.insertAtEnd(25);
        list.insertAtEnd(27);

        list.deleteByValue(27);
        list.printList();

    }
}
