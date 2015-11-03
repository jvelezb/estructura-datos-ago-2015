
package semana4;


import java.util.Iterator;
import java.util.NoSuchElementException;

public class Bag<Item> implements Iterable<Item> {
    private int N;               // number of elements in bag
    private Node<Item> first;    // beginning of bag

    // helper linked list class
    private static class Node<Item> {
        private Item item;
        private Node<Item> next;
    }

    /**
     * Initializes an empty bag.
     */
    public Bag() {
        first = null;
        N = 0;
    }

   
    public boolean isEmpty() {
        return first == null;
    }

    
    public int size() {
        return N;
    }

   
    public void add(Item item) {
        Node<Item> oldfirst = first;
        first = new Node<Item>();
        first.item = item;
        first.next = oldfirst;
        N++;
    }


   
    public Iterator<Item> iterator()  {
        return new ListIterator<Item>(first);  
    }

   
    private class ListIterator<Item> implements Iterator<Item> {
        private Node<Item> current;

        public ListIterator(Node<Item> first) {
            current = first;
        }

        public boolean hasNext()  { return current != null;                     }
        public void remove()      { throw new UnsupportedOperationException();  }

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next; 
            return item;
        }
    }

    /**
     * Unit tests the <tt>Bag</tt> data type.
     */
    
    
    public static void main(String[] args) {
        Bag<Cuentas> bag = new Bag<Cuentas>();
        Cuentas cuenta1 = new Cuentas();
        cuenta1.numero = "Cuenta1";
        bag.add(cuenta1);
        Cuentas cuenta2 = new Cuentas();
        cuenta2.numero = "Cuenta2";
        bag.add(cuenta2);
        Cuentas cuenta3 = new Cuentas();
        cuenta3.numero = "Cuenta3";
        bag.add(cuenta3);
        

        System.out.println("numero de cuenta del dia = " + bag.size());
        for (Cuentas s : bag) {
            System.out.println(s.numero);
        }
    }


}
