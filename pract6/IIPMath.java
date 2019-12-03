package pract6;
import java.lang.Math; 
/**
 * Clase IIPMath: clase de utilidades que implementa algunas operaciones 
 * matematicas: IIPMath.sqrt(double) y IIPMath.log(double).
 *
 * @author IIP
 * @version Curso 2019-2019
 */
public class IIPMath {
    /** Valor aproximado de log(2). */
    public static final double VALORLOG2 = Math.log(2.0);
    
    /** No se pueden crear objetos de esta clase. */
    private IIPMath() { }    
    
    /**
     * Devuelve la raíz cuadrada de x >= 0, con error epsilon > 0. 
     */
    public static double sqrt(double x, double epsilon) {
        //Parametros para calcular la raiz
        //Anterior no tiene resultado hasta que no entra al bucle, y su primer resultado es el de la formula de ultima
        double anterior;
        //Ultima tiene la formula del primer valor que tomara anterior
        double ultima = (1 + x)/2;
        //Para entrar en el bucle, desde un principio, epsilon debe ser mayor que el errror 
        double error = epsilon + 1;
        while (error >= epsilon){
        // Inicializa o cambia el valor del primero por el ultimo    
        // Al haber puesto la form. del primero en el segundo arriba, aqui la cambiaria
        anterior = ultima;
        // Ya cambiada anterior, procedemos a la formula de ultima
        ultima = (anterior+(x/anterior))/2;
        error = anterior - ultima; 
    }
        return ultima;
    }            

    /**
     * Devuelve la raíz cuadrada de x >= 0, con error 1e-15. 
     * // COMPLETAR COMENTARIOS 
     */
    public static double sqrt(double x) {    
        //Parametros para calcular la raiz
        // El metodo es el mismo, solo cambia epsilon por el valor
        double anterior;
        double ultima = (1 + x)/2;
        double error = 1e-15 + 1;
        while (error >= 1e-15){
        anterior = ultima;
        ultima = (anterior+(x/anterior))/2;
        error = anterior - ultima; 
    }
        return ultima;
    }               
                   
    /**
     * Devuelve log(z), 1/2 <= z < 1, con error epsilon > 0.
     * @param z. El valor que debe ser mayor o igual a 1/2 y menor que 1.
     */
    public static double logBase(double z, double epsilon) {
        //Declaracion de variables
        double y = (1.0 - z) / (1.0 + z);
        //Formula:
        double anterior;
        double siguiente = y;
        //
        double k = 1;
        double suma = y;
        while(siguiente >= epsilon){
        anterior = siguiente;
        siguiente = y*y*((2*k-1)/(2*k+1))*anterior;
        k++;
        suma += siguiente;
        }
        return -2*suma;
    }
            
    /**
     * Devuelve log(x), x > 0, con error epsilon > 0.
     * // COMPLETAR COMENTARIOS
     */
    public static double log(double x, double epsilon) {      
        double m;
        double z;
        
        z = x;
        m = 0;
        x = Math.pow(2, m)*z;
        
        if(z == 1){
            return 0;
        }else if(z >= 0.5 && z > 1){
        logBase(z, epsilon);
        }else if (z < 0.5){
            while(z < 0.5){
                z = z * 2.0;
                m--;
            }
        }else{
            // z = [1 , Infinito]
            while (z >= 1){
                z = z / 2.0;
                m++;
            }
        }
        return m*VALORLOG2 + logBase(z, epsilon);
    }

    /**
     * Devuelve log(x), x > 0, con error 1e-15.
     * // COMPLETAR COMENTARIOS
     */
    public static double log(double x) {    
        return log(x, 1e-15);
        
    }
}
