/**
 * Traza: exemples de traces.
 * Exercicis 14 i 15 - Capitol 10 del llibre de l'assignatura. 
 * @author PRG
 * @version Curs 2019/20
 */
public class Traza {
    private Traza() { }
    
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println("Suma total: " + sumav(a, 4, 2));
        System.out.println();
        int[] v = {0, 11, 2, 13, 4, 5, 6, 17, 8};
        f(v, 0);
    }
    
    public static int sumav(int[] v, int i, int x) {
        int suma = 0;
        if (i < 0) { return suma; }
        if (v[i] == x) { return suma; }
        for (int j = 0; j <= i; j++) {
            suma = suma + v[j];
        }
        System.out.println("Suma parcial: " + suma);
        return suma + sumav(v, i - 1, x);
    }

    public static void f(int[] v, int i) {   
        if (i >= v.length) {
            System.out.println("-------------");
        }
        else if (i == v[i]) {
            System.out.printf("v[%d]==%d\n", i, v[i]);
            f(v, i + 1);
        }
        else {
            f(v, i + 1);
            System.out.printf("v[%d]!=%d\n", i, i);
        }
    }
}