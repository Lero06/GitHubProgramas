package pract3;

import java.util.Scanner;

/**
 *  Clase Test3.
 *  Una primera clase con lectura de datos desde teclado, 
 *  y uso de operaciones con int, long, Math y String.
 *  Contiene tres errores de compilacion.
 *  @author IIP 
 *  @version Curso 2019-20
 */
 
public class Test3 {

    public static void main(String[] args){
        String mm, hh;
        Scanner kbd=new Scanner(System.in);
        System.out.println("Lectura de teclado de una hora.");
        System.out.print("   -> Introduzca las horas (entre 0 y 23): ");
        int h = kbd.nextInt();
        System.out.print("   -> Introduzca los minutos (entre 0 y 59): ");
        int m = kbd.nextInt();
        hh="0"+ h;
        mm="0"+ m;
        hh=hh.substring(hh.length()-2);
        mm=mm.substring(mm.length()-2);  
        System.out.println("Hora introducida: "+hh + ":" + mm);
    }    
}
