package LinkedList;

class BasicSyntaxDemo {

    // Node represents one element of the linked list
    class Node {
        int data;      // value stored in this node
        Node next;     // reference to the next node
    }

    Node head;         // start of the list (null means empty list)

    // Insert a new node at the beginning of the list
    void insertAtHead(int data) {
        Node newNode = new Node(); // create new node
        newNode.data = data;       // assign value
        newNode.next = head;       // link new node to existing list
        head = newNode;            // update head to new node
    }

    // Traverse and print the linked list
    void printList() {
        Node current = head;       // use temp reference, never move head

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        BasicSyntaxDemo list = new BasicSyntaxDemo();

        list.insertAtHead(5);
        list.insertAtHead(10);
        list.insertAtHead(20);

        list.printList();           // expected: 20 -> 10 -> 5 -> null
    }
}
