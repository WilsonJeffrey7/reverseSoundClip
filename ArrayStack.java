// Jeffrey Wilson

import java.util.EmptyStackException;

public class ArrayStack implements BKStack {

    //Contains the necessary stack elements
    private double[] elements = new double[10];

    //Displays the current stack amount
    private int stackCurrent = 0;

    //This function pushes Num to the top of the stock
    public void push(double Num) {
        if (stackCurrent == elements.length) {
        //Checks if the array is full, and if it is, copy and
            //paste the content into a bigger array
            double[] bigNum = new double[2 * elements.length];

            for(int i=0; i < elements.length; i++)
            {
                bigNum[i] = elements[i];
            }
            elements = bigNum;
        }
        //Move num to the next open are in stackCurrent
        elements[stackCurrent] = Num;
        //Increment the number of elements by 1
        stackCurrent++;
    }

    //This function removes the top element and returns it
    //It will then check if the stack is empty, and throws an
    //exception if it is empty upon call
    public double pop() {
        if (stackCurrent == 0)
            throw new EmptyStackException();
        //Identifies the top element in the stack
        double topElem = elements[stackCurrent - 1];
        //Decrement the num of elements on the stack
        stackCurrent--;
        return topElem;
    }

    //Check whether the stack is empty and return true or false
    //based on the stackCurrent
    public boolean isEmpty() {
        return (stackCurrent == 0);
    }

    //Fetch the first element from the stack
    @Override
    public double peek() {
        if ( stackCurrent == 0 )
            throw new EmptyStackException();
        //Checks the top element in the stack
        double topElem = elements[stackCurrent - 1];
        return topElem;
    }

}