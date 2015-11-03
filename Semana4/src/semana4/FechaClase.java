

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
public class FechaClase {
    
    public static void main(String []args){
        System.out.println(new Date());
        Date fecha1 = new Date();
        System.out.println(fecha1);
        
        Calendar cal = Calendar.getInstance();//metodo estatico
        cal.setTime(fecha1);
        int month = cal.get(Calendar.MONTH );
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int hour1 = cal.get(Calendar.HOUR);
        int year = cal.get(Calendar.YEAR);
        System.out.println(""+month);
        System.out.println("Constante"+ Calendar.JANUARY);
        System.out.println( "  "+hour + "  " +hour1 );
        System.out.println(""+year);
        
        ///
        
        try{
            String string = "200/502015";
            DateFormat format = new SimpleDateFormat("MM/dd/yyyy", 
                    Locale.ENGLISH);
           
            Date date = format.parse(string);
            System.out.println(date);
        }catch(Exception shalala){
            System.out.println(shalala);
        }
    }
    
    
}
