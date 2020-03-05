
/**
 * Problemes recursius de cerca amb arrays.
 * 
 * @author PRG 
 * @version Curs 2019/20
 */
public class RecursioArraysCerca {
    private RecursioArraysCerca() { }
    
    /** Torna la posicio del primer element distint 
     *  de zero de a[pos..a.length-1].
     *  Precondicio: 0 <= pos <= a.length 
     *  Cerca recursiva ascendent 
     *  Crida inicial per a tot l'array: 
     *  int noZero = trobarRecAsc(a, 0);
     */
    public static int trobarRecAsc(int[] a, int pos) {
        if (pos == a.length) { return -1; }
        else if (a[pos] != 0) { return pos; }
        else { return trobarRecAsc(a, pos + 1); } 
    }

    /** Torna la posicio del primer element distint
     *  de zero de a[0..pos].
     *  Precondicio: -1 <= pos < a.length
     *  Cerca recursiva descendent  
     *  Crida inicial per a tot l'array: 
     *  int noZero = trobarRecDesc(a, a.length - 1);
     */
    public static int trobarRecDesc(int[] a, int pos) {
        if (pos == -1) { return -1; }
        else if (a[pos] != 0) { return pos; }
        else { return trobarRecDesc(a, pos - 1); }  
    }

    /** Torna la posicio d'un enter x en a[ini..fi] 
     *  ordenat ascendentment.
     *  Precondicio: 0 <= ini <= a.length i -1 <= fi < a.length,
     *             i a ordenat ascendentment
     *  Cerca binaria iterativa             
     *  Crida inicial per a tot l'array: 
     *  int pos = cercaBinIter(a, x, 0, a.length - 1);
     */
    public static int cercaBinIter(int[] a, int x, int ini, int fi) {
        int meitat = 0; 
        boolean trobat = false;
        while (ini <= fi && !trobat) {
            meitat = (ini + fi) / 2;
            if (x == a[meitat]) { trobat = true; }
            else if (x < a[meitat]) { fi = meitat - 1; }
            else { ini = meitat + 1; }
        }         
        if (trobat) { return meitat; }
        else { return -1; }
    }
    
    // Fica un punt de ruptura en la línia del while i observa 
    // l’estat de les variables al llarg de l’execució del codi 
    // per a l’array a = {0, 3, 4, 6, 7, 8, 10, 17}, ini = 0, 
    // fi = 7 i x = 20. Quantes iteracions es fan?
    
    /** Torna la posicio d'un enter x en a[ini..fi] 
     *  ordenat ascendentment.
     *  Precondicio: 0 <= ini <= a.length i -1 <= fi < a.length,
     *             i a ordenat ascendentment
     *  Cerca binaria recursiva           
     *  Crida inicial per a tot l'array: 
     *  int pos = encBinRec(a, x, 0, a.length - 1);
     */
    public static int cercaBinRec(int[] a, int x, int ini, int fi) {
        if (ini > fi) { return -1; }
        else {  
            int meitat = (ini + fi) / 2;
            if (a[meitat] == x) { return meitat; }
            else if (a[meitat] > x) { 
                return cercaBinRec(a, x, ini, meitat - 1); 
            }
            else { return cercaBinRec(a, x, meitat + 1, fi); } 
        }
    }
    
    // Fica un punt de ruptura en la línia del cas base i en la primera 
    // línia del cas general i observa l’estat de les variables al llarg 
    // de l’execució del codi per a l’array a = {0, 3, 4, 6, 7, 8, 10, 17}, 
    // ini = 0, fi = 7 i x = 20. Quantes crides es fan en total?
    
    /** Comprova si a[pos..a.length-1] esta ordenat ascendentment.
     *  Precondicio: a.length > 0 i 0 <= pos < a.length 
     *  Cerca recursiva ascendent
     *  Crida inicial per a tot l'array: 
     *  boolean ordenat = ordreAsc(a, 0);
     */
    public static boolean ordreAsc(int[] a, int pos) {
        if(pos == a.length - 1){return true;}
        else{
            if(a[pos] < a[pos + 1]){return ordreAsc(a, pos + 1);}
            else{return false;}
        }
    }

    /** Comprova si a[ini..fi] es capicua.
     *  Precondicio: a.length > 0 i 0 <= ini <= fi <= a.length - 1
     *  Cerca recursiva combinada
     *  Crida inicial per a tot l'array: 
     *  boolean capicua = esCapicua(a, 0, a.length - 1);
     */
    public static boolean esCapicua(int[] a, int ini, int fi) {
        
    }
    
    /** Comprova si en a[pos..a.length-1] hi ha una subsequencia de
     *  tres enters consecutius en tres posicions consecutives 
     *  de l'array. Torna la posicio inicial de la subsequencia 
     *  o -1 si no la troba.
     *  Precondicio: a.length >= 3 i 0 <= pos <= a.length - 2 
     *  Cerca recursiva ascendent 
     *  Crida inicial per a tot l'array: 
     *  int posTresC = tresConsecRec(a, 0);
     */
    public static int tresConsecRec(int[] a, int pos) { 
        /* COMPLETAR */
        return pos; 
    }

    /** Donat un array a[ini..fi], torna true sii a[j + 1] = 2 * a[j] 
     *  per a tot j tal que ini <= j < fi.
     *  Precondicio: a.length > 0 i 0 <= ini <= fi < a.length
     *  Versio 1: cerca recursiva ascendent 
     *  Crida inicial per a tot l'array: 
     *  boolean doble = dobleDe(a, 0, a.length - 1);
     */ 
    public static boolean dobleDe(int[] a, int ini, int fi) {
        /* COMPLETAR */
        return true;
    } 
    
    /** Donat un array a[ini..fi], torna true sii a[j + 1] = 2 * a[j] 
     *  per a tot j tal que ini <= j < fi.
     *  Precondicio: a.length > 0 i 0 <= ini <= fi < a.length
     *  Versio 2: Estrategia: dividir l'array en dues parts, comprovar 
     *  que cadascuna d'elles ho compleix i que el primer element de la
     *  segona part es el doble de l'ultim element de la primera part.
     *  Crida inicial per a tot l'array: 
     *  boolean doble = dobleDe2(a, 0, a.length - 1);
     */  
    public static boolean dobleDe2(int[] a, int ini, int fi) {
        /* COMPLETAR */
        return true;
    }
    
    // Quantes crides recursives es fan per a l'array a = {2, 4, 8, 16, 32, 64}
    // en la versio 1 dobleDe(a, 0, 5) i en la versio 2 dobleDe2(a, 0, 5)?
}
