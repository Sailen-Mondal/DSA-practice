package LinkedList;

public class InsertAtHead 
{
    class Node{
        int data;
        Node next;
    }
    Node head;

    void insertAtHead(int data)
    {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }
    void printList()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        InsertAtHead List = new InsertAtHead();
        List.insertAtHead(10);
        List.insertAtHead(20);
        List.insertAtHead(30);
        
        List.printList();

    }
}
