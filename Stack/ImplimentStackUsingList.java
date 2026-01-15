package Stack;

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
        if(head == null)
            return -1;
        
        int poped = head.data;
        head = head.next;
        return poped;
    }
    
    //peek
    int peek()
    {
        if(head == null)
            return -1;

        return head.data;
    }



    public static void main(String[] args) {
        ImplimentStackUsingList stack = new ImplimentStackUsingList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Peek: " + stack.peek());

        int poppedData = stack.pop();
        System.out.println("Popped: " + poppedData);

        //Printing the stack
        while(stack.head != null)
        {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
