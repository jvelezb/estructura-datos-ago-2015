/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackqueue;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayStackofString implements Iterable<String> {
    private String[] a;  // holds the items
    private int N;       // number of items in stack

    public ArrayStackofString(int max) {
        a = new String[max];
    }

    public boolean isEmpty()            {  return N == 0;             }
    public void push(String item)       {  a[N++] = item;             }
    public String pop()                 {  return a[--N];             }
    public Iterator<String> iterator()  { return new ArrayIterator(); }


    public class ArrayIterator implements Iterator<String> {
        private int i = N-1;

        public boolean hasNext() {
            return i >= 0;
        }
        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            return a[i--];
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }


    public static void main(String[] args) {
        int max = Integer.parseInt(args[0]);
        ArrayStackofString stack = new ArrayStackofString(max);
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) stack.push(item); 
            else if (stack.isEmpty())  StdOut.println("BAD INPUT"); 
            else                       StdOut.print(stack.pop() + " ");
        }
        StdOut.println();

        // print what's left on the stack
        StdOut.print("Left on stack: ");
        for (String s : stack) {
            StdOut.print(s + " ");
        }
        StdOut.println();
    } 
} 
