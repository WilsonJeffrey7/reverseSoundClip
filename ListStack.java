// Jeffrey Wilson

import java.util.EmptyStackException;

public class ListStack implements BKStack{

    //Node that holds an element in the linked list
        // that corresponds to the stack
    private static class Node {
        double element;
        Node next;
    }
    //Points to the node at the top of the stack,
    //then checks if the stack is empty if it
    //is null
    private Node top;

    //Push Num to the top of the stack
    public void push(double Num) {
        //Node holds the new top element
        Node newTop;
        newTop = new Node();
        //Num is stored in the new node
        newTop.element = Num;
        //The new node points to where the old top was
        newTop.next = top;
        //New element now points to the top of the stack
        top = newTop;
    }

    //Checks the top element of the stack and returns it
    //Exception is thrown if the stack is empty
    public double pop() {
        if (top == null)
            throw new EmptyStackException();
        //The topElem is being popped from the stack
        double topElem = top.element;
        //The previous element is now placed at the top
        top = top.next;
        return topElem;
    }

    //Boolean statement to determine if the stack
    //is empty or not and returns null based on it
    public boolean isEmpty() {
        return (top == null);
    }

    //Fetch the first element from the stack
    @Override
    public double peek() {
        if ( top == null )
            throw new EmptyStackException();
        //Pops out the top elem if not null
        double topElem = top.element;
        return topElem;
    }

}