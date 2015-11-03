/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author juanvelezballesteros
 */
public class NewClass {
    
    private Date fecha1;
    private Date fecha2;
    
    public NewClass(String fecha1, String fecha2){
        try{
            
            DateFormat format = new SimpleDateFormat("dd/MM/yyyy", 
                    Locale.ENGLISH);
           
             this.fecha1 = format.parse(fecha1);
             this.fecha2 = format.parse(fecha2);
           
        }catch(Exception shalala){
            System.out.println(shalala);
        }
    }
    
    
    public int diferenciaHoras(){
        long diff = fecha2.getTime() - fecha1.getTime();
       int horas =  (int) TimeUnit.HOURS.convert(diff, TimeUnit.MILLISECONDS);
        return horas;
    }
    public int diferenciaMinutos(){
        long diff = fecha2.getTime() - fecha1.getTime();
       int minutos =  (int) TimeUnit.MINUTES.convert(diff, TimeUnit.MILLISECONDS);
        return minutos;
    }
    
    
    public int diferenciaDias(){
        long diff = fecha2.getTime() - fecha1.getTime();
       int horas =  (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        return horas;
    }
    
     public int diferenciaAnios(){
        long diff = fecha2.getTime() - fecha1.getTime();
       
        int dias = (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        return dias/365;
    }
     
        public int diferenciaMeses(){
        long diff = fecha2.getTime() - fecha1.getTime();
       
        int dias = (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        return dias/30;
    }
    
    
    public static void main(String []args){
        NewClass diferencia1 = new NewClass("05/07/1993","13/10/2015");
        System.out.println("diferencia de horas: "+ diferencia1.diferenciaHoras());
        System.out.println("diferencia de dias: "+ diferencia1.diferenciaDias());
        System.out.println("diferencia de anios: "+ diferencia1.diferenciaAnios());
         System.out.println("diferencia de meses: "+ diferencia1.diferenciaMeses());
    }
    
}
