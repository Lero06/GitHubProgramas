/**
 * Classe Grup: representa els alumnes d'un grup.
 * 
 * @author PRG 
 * @version Curs 2019/20
 */
public class Grup {
    /** Nombre maxim d'alumnes per grup */
    public static final int NUM_ALUMNES = 50; 
    private Alumne[] grup;
    private int numAl; // nombre real d'alumnes del grup      

    /** Crea un Grup amb 0 alumnes. */
    public Grup() {
        grup = new Alumne[NUM_ALUMNES];
        numAl = 0;
    }

    /** Donat un alumne, si cap, l'afegeix al grup.
     *  @param a Alumne a afegir.
     */
    public void afegir(Alumne a) {
        if (numAl < NUM_ALUMNES) { grup[numAl++] = a; }
    }
    
    /** Donat un alumne, si existeix, l'elimina del grup.
     *  @param a Alumne a eliminar.
     *  @return boolean.
     */
    public boolean eliminar(Alumne a) {
        int i = 0;
        while (i < numAl && !grup[i].equals(a)) { i++; }
        if (i < numAl) {
            for (int j = i + 1; j < numAl; j++) {
                grup[j - 1] = grup[j];
            }
            numAl--;
            return true;
        }
        else { return false; }
    }

    /** Mostra per pantalla la informacio de tots els alumnes. */  
    public void mostrarAlumnes() { mostrarAlumnes(0); } 
    
    /** Recorregut recursiu ascendent
     *  PRECONDICIO: 0 <= pos <= numAl */
    private void mostrarAlumnes(int pos) {
        /* COMPLETAR */
    }      

    /** Torna la nota minima.
     *  @return double.  
     */
    public double notaMinima() { return notaMinima(0); }
    
    /** Recorregut recursiu ascendent
     *  PRECONDICIO: 0 < numAl i 0 <= pos < numAl */
    private double notaMinima(int pos) {
        /* COMPLETAR */
        return 0;
    }

    /** Compta el nombre de MH. 
     *  @return int. 
     */
    public int comptarMH() { return comptarMH(numAl - 1); }
    
    /** Recorregut recursiu descendent
     *  PRECONDICIO: -1 <= pos < numAl */
    private int comptarMH(int pos) {
        /* COMPLETAR */
        return 0;
    }       

    /** Torna la posicio del primer alumne amb MH o -1 si no hi ha cap MH.
     *  @return int.  
     */
    public int primeraMH() { 
        // recorregut descendent primera versio
        return primeraMH(numAl - 1);  
        // recorregut descendent segona versio
        // return primeraMH(numAl - 1, -1); 
        // cerca ascendent
        // return primeraMHC(0); 
    }
    
    /** Recorregut recursiu descendent - Primera versio
     *  PRECONDICIO: -1 <= pos < numAl */
    private int primeraMH(int pos) {
        /* COMPLETAR */
        return pos;
    }

    /** Recorregut recursiu descendent - Segona versio
     *  PRECONDICIO: -1 <= pos < numAl i -1 <= primMH < numAl */
    private int primeraMH(int pos, int primMH) {
        /* COMPLETAR */
        return pos;
    }

    /** Cerca recursiva ascendent
     *  PRECONDICIO: 0 <= pos <= numAl */
    private int primeraMHC(int pos) {
        /* COMPLETAR */
        return pos;
    }
    
    /** Torna la posicio del darrer alumne amb MH o -1 si no hi ha cap MH.
     *  @return int.  
     */
    public int darreraMH() { return darreraMH(numAl - 1); } 
    
    /** Cerca recursiva descendent
     *  PRECONDICIO: -1 <= pos < numAl */
    private int darreraMH(int pos) {
        /* COMPLETAR */
        return pos;
    } 

    /** Comprova si els alumnes estan ordenats ascendentment 
     *  per nota (de menor a major).
     *  @return boolean.
     */
    public boolean ordreAsc() { return ordreAsc(0); } 
    
    /** Cerca recursiva ascendent
     *  PRECONDICIO: 0 <= pos < numAl */
    private boolean ordreAsc(int pos) {
        /* COMPLETAR */
        return true;
    }     

    /** Torna la posicio d'un alumne de nom donat, sabent que els alumnes 
     *  estan ordenats per nom (lexicograficament), o -1 si no el troba.
     *  @param nom String.
     *  @return int.
     */  
    public int encNom(String nom) { return encNom(nom, 0, numAl - 1); }
    
    /** Cerca binaria recursiva
     *  PRECONDICIO: 0 <= ini <= numAl i -1 <= fi < numAl */
    private int encNom(String nom, int ini, int fi) {
        /* COMPLETAR */
        return ini;
    }
}