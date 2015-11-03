/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackqueue;

/**
 *
 * @author juanvelezballesteros
 */
public class LinkedStackOfStrings {
    
    private int N;          // size of the stack
    private Node first;     // top of stack

    // helper Node class
    private class Node {
        private String item;
        private Node next;
    }

    // is the stack empty?
    public boolean isEmpty() { return first == null; }

    // number of elements on the stack
    public int size() { return N; }


    // add an element to the stack
    public void push(String item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        N++;
    }

    // delete and return the most recently added element
    public String pop() {
        if (isEmpty()) throw new RuntimeException("Stack underflow");
        String item = first.item;      // save item to return
        first = first.next;            // delete first node
        N--;
        return item;                   // return the saved item
    }


    // test client
    public static void main(String[] args) {
        LinkedStackOfStrings s = new LinkedStackOfStrings();
        while (!System.in.read().isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) s.push(item); 
            else if (s.isEmpty())  StdOut.println("BAD INPUT"); 
            else                   StdOut.print(s.pop());
        } 
    } 

    
}
