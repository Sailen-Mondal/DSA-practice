package LinkedList;

class BasicSyntaxDemo {

    // Node represents a single element of the linked list
    class Node {
        int data;      // value stored in this node
        Node next;     // reference to the next node in the list
    }

    // head stores the reference of the first node
    // if head == null → list is empty
    Node head;

    // Insert a new node at the beginning of the list
    void insertAtHead(int data) {
        Node newNode = new Node();   // create a new node
        newNode.data = data;         // store the value
        newNode.next = head;         // point to the existing list
        head = newNode;              // move head to the new node
    }

    // Insert a new node at the end of the list
    void insertAtLast(int data) {
        Node newNode = new Node();   // create a new node
        newNode.data = data;         // store the value

        // Case 1: list is empty
        if (head == null) {
            head = newNode;          // new node becomes the first node
            return;
        }

        // Case 2: list is not empty
        Node current = head;

        // Traverse until we reach the last node
        // (last node is the one whose next is null)
        while (current.next != null) {
            current = current.next;
        }

        // Link last node to the new node
        current.next = newNode;
    }

    // Delete the first node that contains the given value
    void delete(int data) {

        // Case 1: empty list → nothing to delete
        if (head == null)
            return;

        // Case 2: node to delete is the head
        if (head.data == data) {
            head = head.next;        // move head to next node
            return;
        }

        // Case 3: delete from middle or end
        Node prev = head;            // previous node
        Node current = head.next;    // current node

        while (current != null) {
            if (current.data == data) {
                // bypass the current node
                prev.next = current.next;
                return;
            }
            prev = current;          // move prev forward
            current = current.next;  // move current forward
        }
    }

    // Traverse and print the linked list
    void printList() {
        Node current = head;         // use temp pointer, never move head

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        BasicSyntaxDemo list = new BasicSyntaxDemo();

        // Insert at head
        list.insertAtHead(5);
        list.insertAtHead(10);
        list.insertAtHead(20);

        // Insert at tail
        list.insertAtLast(30);
        list.insertAtLast(40);
        list.insertAtLast(50);

        // Delete nodes
        list.delete(5);    // delete middle
        list.delete(50);   // delete tail

        // Print final list
        list.printList();  // expected: 20 -> 10 -> 30 -> 40 -> null
    }
}
