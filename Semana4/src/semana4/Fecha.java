/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author juanvelezballesteros
 */
public class Fecha {
    private Date fecha;
    
    public void convertiraString(){
        fecha= new Date();
       Calendar cal = Calendar.getInstance();
       cal.setTime(fecha);
       int month = cal.get(Calendar.MONTH);
        System.out.println(""+month);
    }
    public void stringAFecha(){
        try{
        String string = "10/20/2015";
        DateFormat format = new SimpleDateFormat("mm/dd/yyyy", Locale.ENGLISH);
        Date date = format.parse(string);
        System.out.println(date);
        
        }catch(Exception es){
         System.out.println(es);
        }
    }
    
    public static void main(String[]arg){
        Fecha fecha = new Fecha();
       
    }
    
    
    
}
