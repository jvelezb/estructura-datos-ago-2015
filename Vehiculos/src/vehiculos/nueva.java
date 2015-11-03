/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author juanvelezballesteros
 */
public class nueva {
    public static void main(String []args){
        List<List<List <Integer>>> listaGeneral = new ArrayList();
        
        
       ArrayList<String> list = new ArrayList<String>(10) ;
       System.out.println(list.size());
        
list.add( "Ann" );
list.add( "Bob" );
list.add( "Eve" );
list.add( "Ann" );
list.add( "Bob" );
list.add( "Eve" );
list.add( "Ann" );
list.add( "Bob" );
list.add( "Eve" );
list.add( "Ann" );
list.add( "Bob" );
list.add( "Eve" );
System.out.println(list.size());


ArrayList<String> list2 = new ArrayList<String>(10) ;

list2.add( "Andy" );
list2.add( "Bart" );
list2.add( "Carl" );
list2.add( 0, "Eve" );
System.out.println(list2);
        
    }
    
}
