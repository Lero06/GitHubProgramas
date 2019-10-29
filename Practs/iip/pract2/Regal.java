package pract2;
/**
 *author Albert Esteve Carbonell 
 *Programa que crea un regalo
 *Version beta
 */
public class Regal {

    public static void main(String[] args) {        
        // Crea area de dibujo
        Blackboard miPizarra = new Blackboard("Pizarra", 500, 500);
        //Inicializa 1 rectangulo (fondo blanco)
        Rectangle rf = new Rectangle(1000, 1000, "white", 0, 0);
        // ponerlo en el espacio de dibujo:
        miPizarra.add(rf);
   
        // Inicializa 3 rectangulos:
        Rectangle r = new Rectangle(200, 200, "red", 250, 250);
        //Rectangulos lazos
        Rectangle r2 = new Rectangle(200, 30, "blue", 250, 250);
        Rectangle r3 = new Rectangle(30, 200, "blue", 250, 250);
        // ponerlos en el espacio de dibujo:
        miPizarra.add(r); 
        miPizarra.add(r2);
        miPizarra.add(r3); 
        
        // Inicializa dos circulos (lazos)
        Circle c2 = new Circle(20, "blue", 270, 130);
        Circle c3 = new Circle(20, "blue", 230, 130);
        // ponerlo en el espacio de dibujo:
        miPizarra.add(c2); 
        miPizarra.add(c3); 
        // Inicializa dos circulos (agujeros lazos)
        Circle c4 = new Circle(12, "white", 270, 130);
        Circle c5 = new Circle(12, "white", 230, 130);
        // ponerlo en el espacio de dibujo:
        miPizarra.add(c4); 
        miPizarra.add(c5); 
        
        // Inicializa 1 rectangulo (suelo):
        Rectangle r4 = new Rectangle(1000, 100, "black", 0, 400);
        // ponerlo en el espacio de dibujo:
        miPizarra.add(r4);
    }
}

