/**
 * Problemes recursius numerics.
 * 
 * @author PRG
 * @version Curs 2019/20
 */
public class RecursioNumeros {
    private RecursioNumeros() { }

    /** Torna el factorial de n,
     *  aplicant una estrategia iterativa.
     *  PRECONDICIO: n >= 0 */
    public static int factorialIt(int n) {
        int r = 1;
        while (n > 0) {
            r = r * n;
            n--;
        }
        return r;
    }
    
    /** Torna el factorial de n,
     *  aplicant una estrategia recursiva.
     *  PRECONDICIO: n >= 0 */
    public static int factorial(int n) {
        int r;
        if (n == 0) { r = 1; }
        else { r = n * factorial(n - 1); }
        return r;
    }
    
    public static void main(String[] args) {
        int fIt = factorialIt(3);
        int fRec = factorial(3);
    }
    
    /** Torna el número de blocs que forma una piramide 
     *  escalonada d'altura n, n >= 1.
     *  Una piramide escalonada d'altura n, n >= 1, es una 
     *  construccio de n nivells de costats decreixents 
     *  n, n – 1, …, 2, 1. En la piramide, el nivell i esta 
     *  format per una plataforma quadrada de i * i blocs.
     *  PRECONDICIO: n >= 1 */
    public static int blocs(int n) {
        if (n == 1) { return 1; }
        else { return n * n + blocs(n - 1); }
    }
    
    /** Que fa aquest metode?
     *  PRECONDICIO: n >= 0 */
    public static void escriuRaro(int n) {
        if (n > 0) {
            System.out.print(n);
            escriuRaro(n - 1);
            System.out.print(n);
        }
        else { System.out.print(0); }
    }
    
    /** Torna a^n, aplicant: 
     *  Si n=0, aleshores a^n = 1.
     *  Si n>0, aleshores a^n = a^(n-1) * a.
     *  PRECONDICIO: a != 0 i n >= 0
     */
    public static double potencia(double a, int n) {
        if (n == 0) { return 1; }
        else { return potencia(a, n - 1) * a; }
    }
    
    /** Torna el residu del quocient entre a i b.
     *  Si a < b, aleshores el residu de a/b es a.
     *  En un altre cas, el residu de a/b es el residu de (a-b)/b.
     *  PRECONDICIO: a >= 0 i b > 0
     */
    public static int residu(int a, int b) {
        if (a < b) { return a; }
        else { return residu(a - b, b); }
    }
    
    /** Torna el terme n-esim de la successio de Fibonacci
     *  (assumint que el terme 0-esim es el primer de la successio). 
     *  Si n<=1, el valor del terme n-esim es n.
     *  En un altre cas, es la suma dels termes (n-1)-esim i (n-2)-esim.
     *  PRECONDICIO: n >= 0
     */
    public static int fibonacci(int n) {
        if (n <= 1) { return n; }
        else { return fibonacci(n - 1) + fibonacci(n - 2); }
    }
    
    /** Torna el mcd d'a i b, aplicant l'algorisme d'Euclides:
     *  Si a=b, el mcd es b.
     *  Si a>b, el mcd es el mcd de a-b i b.
     *  Si a<b, el mcd es el mcd de a i b-a.
     *  PRECONDICIO: a > 0 i b > 0
     */
    public static int mcd(int a, int b) {
        if (a == b) { return b; }
        else if (a > b) { return mcd(a - b, b); }
        else { return mcd(a, b - a); }
    }
    
    /** Torna el mcd d'a i b, aplicant la versio millorada 
     *  de l'algorisme d'Euclides.
     *  Si el residu de a/b es 0, el mcd es b.
     *  En un altre cas, el mcd es el mcd de b i el residu de a/b.
     *  PRECONDICIO: a > 0 i b > 0
     */
    public static int euclides(int a, int b) {
        if (a % b == 0) { return b; }
        else { return euclides(b, a % b); }
    }
    
    /** Torna el quocient de la divisio entera d'a entre b. 
     *  Si a<b, a/b = 0.
     *  Si a>=b, a/b = (a-b)/b + 1.
     *  PRECONDICIO: a >= 0 i b > 0
     */
    public static int quocient(int a, int b) {   
        if(a < b){return 0;}
        else{return quocient(a-b,b) + 1;}
    }
    
    /** Torna a^b, aplicant:
     *  Si b=0, a^b = 1.
     *  Si b=1, a^b = a.
     *  Si b>1 i b es parell, a^b = a^(b/2) * a^(b/2).
     *  Si b>1 i b es senar, a^b = a^(b/2) * a^(b/2) * a.
     *  PRECONDICIO: a != 0 i b >= 0
     */
    public static double potenciaM(double a, int b) { 
        if(b == 0){return 1;}
        else if(b == 1){return a;}
        else if(b > 1 && b%2 == 0){return potenciaM(a,(b/2)) * potenciaM(a,(b/2));}
        else{return potenciaM(a,(b/2)) * potenciaM(a,(b/2)) * a;}
    }
    
    /** Torna la suma dels digits de n.
     *  PRECONDICIO: n >= 0 */
    public static int sumaDigits(int n) {
        if(n/10 != 0){
        return n%10 + sumaDigits(n/10);
        }
        else{return n;}
    }
    
    /** Torna el nombre de digits de n.
     *  PRECONDICIO: n >= 0 */
    public static int nombreDigits(int n) {
        if(n / 10 == 0){return 1;}
        else{return nombreDigits(n / 10) + 1;}
    }
    
    /** Mostra per pantalla l'invers de n.
     *  PRECONDICIO: n >= 0 */
    public static void mostraInvers(int n) {
        if(n / 10 == 0){System.out.print(n);}
        else{
            System.out.print(n%10);
            mostraInvers(n/10);
        }
    }
    
    /** Torna el producte d'a per b.
     *  Si b=0, a*b = 0.
     *  Si b>0, a*b = a*(b-1) + a.
     *  PRECONDICIO: b >= 0
     */
    public static int producte(int a, int b) {
        if(b == 0){return 0;}
        else{return producte (a, b-1) + a;}
    }
    
    /** Torna el producte de a per b, aplicant
     *  la multiplicacio a la russa:
     *  Si b=0, a*b = 0.
     *  Si b>0 i b es parell, a*b = (a*2) * (b/2).
     *  Si b>0 i b es senar, a*b = (a*2) * (b/2) + a.
     *  PRECONDICIO: b >= 0
     */
    public static int alaRussa(int a, int b) {
        if(b == 0){return 0;}
        else if(b > 0 && b % 2 == 0){return alaRussa(a*2,b/2);}
        else{return alaRussa(a*2,b/2) + a;}
    }
    
    /** Mostra per pantalla els enters de l'1 al n.
     *  PRECONDICIO: n > 0 */
    public static void del1Aln(int n) {
        if(n == 1){System.out.print(1);}
        else{
            del1Aln(n-1);
            System.out.print(n);
        }
    }
    
    /** Mostra per pantalla els enters del n a l'1.
     *  PRECONDICIO: n > 0 */
    public static void delnAl1(int n) {
        if(n == 1){System.out.print(1);}
        else{
            System.out.print(n);
            delnAl1(n-1);
        }
    }
}
