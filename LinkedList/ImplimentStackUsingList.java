package LinkedList;

public class ImplimentStackUsingList
{
    class Node{
        int data;
        Node next;
    }
    Node head;

    //Implimenting Push 
    void push(int value)
    {
        Node newNode = new Node();
        newNode.next = head;
        newNode.data = value;
        head = newNode;
    }

    //Implimenting pop
    int pop()
    {
        int poped = head.data;
        head = head.next;
        return poped;
    }
    
    //peek
    void peek()
    {
        System.out.println("Stack top: " + head.data);
    }



    public static void main(String[] args) {
        ImplimentStackUsingList stack = new ImplimentStackUsingList();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.peek();

        int poppedData = stack.pop();
        System.out.println("Popped: " + poppedData);
    }
}
