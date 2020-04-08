//package pract3; 

import java.util.Locale;
/** Clase MeasuringSortingAlgorithms: Estudio empirico de costes de 
 *  los metodos de ordenacion.
 *  @author PRG - ETSInf
 *  @version Curso 2019-2020
 */
public class MeasuringSortingAlgorithms {
    // Constantes que definen los parametros de medida
    public static final int MAXTALLA = 10000, INITALLA = 1000; 
    public static final int INCRTALLA = 1000;
    public static final int REPETICIONESQ = 200, REPETICIONESL = 20000;
    public static final double NMS = 1e3;  // relacion micro - nanosegons
    
    /** No hay objetos de esta clase. */
    private MeasuringSortingAlgorithms() { }
    
    /** Crea un array de int de talla t con valores a 0.
     *  @param t int, la talla.
     *  @result int[], el array generado.
     */
    private static int[] createArray(int t) { 
        int[] a = new int[t];
        return a;
    }

    /** Rellena los elementos de un array a de int 
     *  con valores aleatorios entre 0 y a.length-1.
     *  @param a int[], el array.
     */
    private static void fillArrayRandom(int[] a) {
        for(int i = 0; i<= a.length-1; i++){
            a[i]= (int) Math.floor(Math.random()*a.length*1000);
        }
    }
  
    /** Rellena los elementos de un array a de forma creciente,
     *  con valores desde 0 hasta a.length-1.
     *  @param a int[], el array.
     */
    private static void fillArraySortedInAscendingOrder(int[] a) { 
        for(int i = 0; i<= a.length-1; i++){
            a[i]= i;
        }
    }

    /** Rellena los elementos de un array a de forma decreciente,
     *  con valores desde a.length-1 hasta 0.
     *  @param a int[], el array.
     */
    private static void fillArraySortedInDescendingOrder(int[] a) { 
        for(int i = a.length-1; i >= 0; i--){
            a[i]= a.length - 1 - i;
        }
    }
  
    public static void measuringSelectionSort() {
        long ti = 0, tf = 0, tt = 0; // Tiempos inicial, final y total 
        // Imprimir cabecera
        System.out.println("# Seleccion. Tiempos en microsegundos");
        System.out.print("# Talla    Promedio \n");
        System.out.print("#------------------\n");
        
        for(int i = INITALLA; i <= MAXTALLA; i += INCRTALLA){
            int[] a = createArray(i);
            tt = 0;
            for(int r = 0; r < REPETICIONESQ; r++){
            fillArrayRandom(a);
            ti = System.nanoTime();
            MeasurableAlgorithms.selectionSort(a);
            tf = System.nanoTime();
            tt += (tf - ti);
                } 
                double talla = (double) tt / REPETICIONESQ;
                
                System.out.printf("%8d %10.3f\n",
                        i,talla / NMS);
             }
    }

    public static void measuringInsertionSort() {
        long ti = 0, tf = 0, tt = 0; // Temps inicial, final i total   
        long tt2 = 0, tt3 = 0;
        // Imprimir cabecera de resultados
        System.out.println("# Insercion. Tiempos en microsegundos.");
        System.out.print("# Talla    Mejor       Peor     Promedio \n");
        System.out.print("#----------------------------------------\n");

         for(int i = INITALLA; i <= MAXTALLA; i += INCRTALLA){
            int[] a = createArray(i);
            int[] m = createArray(i);
            int[] p = createArray(i);
            tt = 0;
            for(int r = 0; r < REPETICIONESQ; r++){
            fillArrayRandom(a);
            ti = System.nanoTime();
            MeasurableAlgorithms.insertionSort(a);
            MeasurableAlgorithms.insertionSort(p);
            tf = System.nanoTime();
            tt += (tf - ti);
                } 
                for(int k = 0; k < REPETICIONESQ; k++){
            fillArraySortedInDescendingOrder(p);
            ti = System.nanoTime();
            MeasurableAlgorithms.insertionSort(p);
            tf = System.nanoTime();
            tt2 += (tf - ti);
                } 
                for(int s = 0; s < REPETICIONESL; s++){
            fillArraySortedInAscendingOrder(m);
            ti = System.nanoTime();
            MeasurableAlgorithms.insertionSort(m);
            tf = System.nanoTime();
            tt3 += (tf - ti);
                } 
                double talla = (double) tt / REPETICIONESQ;
                double talla2 = (double) tt2 / REPETICIONESQ;
                double talla3 = (double) tt3 / REPETICIONESL;
                
                System.out.printf("%8d %10.3f %10.3f %10.3f \n", i, talla3 / NMS,talla2 / NMS,talla / NMS);
             }
    }
  
    public static void measuringMergeSort() {        
        long ti = 0, tf = 0, tt = 0; // Tiempos inicial, final y total 
        // Imprimir cabecera
        System.out.println("# Ord. por mezcla. Tiempos en microsegundos");
        System.out.print("# Talla    Promedio \n");
        System.out.print("#-------------------\n");
        
        for(int i = INITALLA; i <= MAXTALLA; i += INCRTALLA){
            int[] b = createArray(i);
            tt = 0;
            for(int r = 0; r < REPETICIONESQ; r++){
            fillArrayRandom(b);
            ti = System.nanoTime();
            MeasurableAlgorithms.mergeSort(b, 0, b.length - 1);
            tf = System.nanoTime();
            tt += (tf - ti);
                } 
                double talla = (double) tt / REPETICIONESQ;
                
                System.out.printf("%8d %10.3f\n",
                        i,talla / NMS);
             }
    }

    private static void help() {
        String msg = "Uso: java MeasurigSortingAlgorithms num_algoritmo";
        System.out.println(msg);
        System.out.println("   donde num_algoritmo es: ");
        System.out.println("   1 -> Insercion");
        System.out.println("   2 -> Seleccion");
        System.out.println("   3 -> MergeSort");
    }

    public static void main(String[] args) {
        if (args.length != 1) { help(); } 
        else {
            try {
                int a = Integer.parseInt(args[0]);
                switch (a) {
                    case 1: 
                        measuringInsertionSort(); 
                        break;
                    case 2: 
                        measuringSelectionSort(); 
                        break;
                    case 3: 
                        measuringMergeSort(); 
                        break;
                    default: 
                        help();
                }
            } catch (Exception e) {
                help(); 
            }
        }
    }
}

