/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listexample;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;
import java.util.LinkedList;
import java.util.Iterator;

/**
 *
 * @author juanvelezballesteros
 */
public class ListExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List lista = new ArrayList();
        lista.add("UNO");
        lista.add("DOS");
        lista.add("TRES");
        lista.add(new Double(1.2));
        lista.add(new Double("0.02"));
        lista.add(new Integer(12));
        lista.add(new Integer("12"));
        System.out.println(lista);
        List lista2 = new Stack();
        lista2.add("UNO");
        lista2.add("DOS");
        System.out.println(lista2);
        for(Object it: lista){
            System.out.println("Elemento:"+it);
        }
        Iterator it = lista.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        
    }
    
}
