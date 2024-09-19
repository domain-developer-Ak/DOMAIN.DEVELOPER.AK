import java.util.*;
public class Rough {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.close();
    }
}


class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    Node head;

    LinkedList() {
        head = null;
    }

    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else {
            Node temp = head;
            while(temp.next != null){
                
            }
        }
    }
}