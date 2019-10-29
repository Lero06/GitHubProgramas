package pract3;

import java.util.Scanner;
/**
 * Write a description of class Test4 here.
 *
 * @author Albert
 * @version beta
 */
public class Test4 {
    public static void main (String[] args){
        //Creacio variables String y scanner + h y m com valors de retorn
        String mm, hh;
        Scanner kbd=new Scanner(System.in);
        System.out.println("Lectura de teclado de una hora.");
        System.out.print("   -> Introduzca las horas (entre 0 y 23): ");
        int h = kbd.nextInt();
        System.out.print("   -> Introduzca los minutos (entre 0 y 59): ");
        int m = kbd.nextInt(); 
        //Afegeix +0 a la variable h i m
        hh="0"+ h;
        mm="0"+ m;
        hh=hh.substring(hh.length()-2);
        mm=mm.substring(mm.length()-2);  
        System.out.println("Hora introducida: "+hh + ":" + mm);
        
        //Part 2 - Calcular hora (ERROR)
        long minTotals = System.currentTimeMillis()/(60*1000);
        int minActuals = (int) (minTotals % (24*60)); 
        int hC, mC;
        //hC calcula hores dividint entre 60
        hC = minActuals /60;
        //mC calcula minuts amb el reste de la multiplicacio
        mC = minActuals %60; 
        hh="0"+ hC;
        mm="0"+ mC;
        hh=hh.substring(hh.length()-2); //longitud de la cadena (3-4)-2 (primer miembro o 0)
        mm=mm.substring(mm.length()-2); //same 
        System.out.println("Hora UTC: "+hh+ ":"+mm);
        
        //Part per a calcular la diferencia entre hores anteriors 
        // Nova variable per a transformar en segons els valors introduits pel usuari
        int unioNumEscan=h*60+m;
        int diferencia = minActuals-unioNumEscan; 
        //com pot donar negatiu: fem modul
        int difPos = Math.abs(diferencia);
        //Creacio de nous ints per a afegirli's els 0 (estetica)
        int hD,mD;
        hD = difPos /60;
        mD = difPos %60;
        hh="0"+ hD;
        mm="0"+ mD;
        hh=hh.substring(hh.length()-2); 
        mm=mm.substring(mm.length()-2); 
        System.out.println("Diferencia entre Hora Introducida y Hora Actual = "+hh+":"+mm);
    }
}
