/**
 * Problemes recursius amb String.
 * 
 * @author PRG
 * @version Curs 2019/20
 */
public class RecursioString {
    private RecursioString() { }

    /**
     * Torna el nombre de 'a' en la String que rep.
     * @param s String en la qual es volen comptar les 'a's.
     * @return int, nombre de 'a' en s.
     * Recorregut recursiu ascendent - Versio 1.
     * PRECONDICIO: s.length() >= 0
     */
    public static int comptaAs(String s) {
        // Cas base: String buida
        if (s.length() == 0) { return 0; }
        // Cas general: String no buida. Tractar la substring posterior.
        else if (s.charAt(0) == 'a') { return 1 + comptaAs(s.substring(1)); }
        else { return comptaAs(s.substring(1)); }
    }

    /**
     * Torna el nombre de 'a' en la String que rep.
     * @param s String en la qual es volen comptar les 'a's.
     * @param pos posicio en s on comença la substring.
     * @return int, nombre de 'a' en s.
     * Recorregut recursiu ascendent - Versio 2.
     * PRECONDICIO: s.length() >= 0 i 0 <= pos <= s.length()
     * CRIDA INICIAL amb pos = 0
     */
    public static int comptaAs(String s, int pos) {
        // Cas base: String buida
        if (pos == s.length()) { return 0; }
        // Cas general: String no buida. Tractar la substring posterior.
        else if (s.charAt(pos) == 'a') { return 1 + comptaAs(s, pos + 1); }
        else { return comptaAs(s, pos + 1); }
    }
    
    /**
     * Torna el nombre de 'a' en la String que rep.
     * @param s String en la qual es volen comptar les 'a's.
     * @return int, nombre de 'a' en s.
     * Recorregut recursiu descendent - Versio 1.
     * PRECONDICIO: s.length() >= 0
     */
    public static int comptaAs2(String s) {
        // Cas base: String buida
        if (s.length() == 0) { return 0; }
        // Cas general: String no buida. Tractar la substring anterior.
        else if (s.charAt(s.length() - 1) == 'a') {
            return 1 + comptaAs2(s.substring(0, s.length() - 1));
        }
        else { return comptaAs2(s.substring(0, s.length() - 1)); }
    }
    
    /**
     * Torna el nombre de 'a' en la String que rep.
     * @param s String en la qual es volen comptar les 'a's.
     * @param pos posicio en s on acaba la substring.
     * @return int, nombre de 'a' en s.
     * Recorregut recursiu descendent - Versio 2.
     * PRECONDICIO: s.length() >= 0 i -1 <= pos < s.length()
     * CRIDA INICIAL amb pos = s.length() - 1
     */
    public static int comptaAs2(String s, int pos) {
        // Cas base: String buida
        if (pos == -1) { return 0; }
        // Cas general: String no buida. Tractar la substring anterior.
        else if (s.charAt(pos) == 'a') { return 1 + comptaAs2(s, pos - 1); }
        else { return comptaAs2(s, pos - 1); }
    }
    
    /** 
     * Comprova si a es sufixe de b: es diu que a es sufixe de b
     * quan tots els caracters de a estan consecutius, en el mateix 
     * ordre original, al final de b.
     * La cadena buida es sufixe de qualsevol altra, fins i tot si 
     * aquesta altra tambe es buida. A mes, una cadena a no pot ser  
     * sufixe d'una altra b si a es de longitud mes gran que b.
     * @param a String.
     * @param b String.
     * @return boolean, true si a es sufixe de b, o false en cas contrari.
     * Cerca recursiva descendent.
     * PRECONDICIO: a.length() >= 0 i b.length() >= 0 
     */
    public static boolean esSufixe(String a, String b) {
        /* COMPLETAR */
        return true;        
    }
    
    /**
     * Comprova si a es o no subcadena de b. Es diu que a es subcadena 
     * de b quan tots els caracters de a estan consecutius, en el mateix 
     * ordre original, en algun lloc de b. O, el que es el mateix, quan 
     * aes sufixe de b o d'alguna de les possibles subcadenes de b.
     * La cadena buida es subcadena de qualsevol altra, encara que aquella 
     * altra tambe estigues buida. A mes, una cadena no pot ser subcadena 
     * d'una altra si la primera es de longitud mes gran que la segona.
     * @param a String.
     * @param b String.
     * @return boolean, true si a es subcadena de b, o false en cas contrari.
     * Cerca recursiva descendent.
     * PRECONDICIO: a.length() >= 0 i b.length() >= 0 
     */
    public static boolean esSubcadena(String a, String b) {
        /* COMPLETAR */
        return true;  
    }
    
    /** 
     * Mostra en ordre invers els caracters de s.
     * @param s String que es vol mostrar en ordre invers.
     * Recorregut recursiu descendent.
     * PRECONDICIO: s.length() >= 0 
     */
    public static void invers(String s) {
        /* COMPLETAR */
    }
    
    /** 
     * Determina si una cadena de caracters es un palindrom: paraula o
     * frase que es llig igual d'esquerra a dreta que de dreta a esquerra. 
     * Esta solucio nomes serveix per a paraules (no per a frases).
     * @param s String que es vol comprovar si es un palindrom.
     * @return boolean, true si s es un palindrom o false en cas contrari.
     * Versio 1
     * PRECONDICIO: s.length() >= 0
     */
    public static boolean palindrom(String s) {
        /* COMPLETAR */
        return true;        
    } 
    
    /** 
     * Determina si una cadena de caracters es un palindrom: paraula o 
     * frase que es llig igual d'esquerra a dreta que de dreta a esquerra. 
     * Esta solucio nomes serveix per a paraules (no per a frases).
     * @param s String que es vol comprovar si es un palindrom.
     * @param i int que indica la posicio inicial de la substring a comprovar.
     * @param j int que indica la posicio final de la substring a comprovar.
     * @return boolean, true si s es un palindrom o false en cas contrari.
     * Versio 2
     * PRECONDICIO: s.length() >= 0, 0 <= i < s.length(), 0 <= j < s.length()
     * CRIDA INICIAL amb i = 0 i j = s.length() - 1
     */
    public static boolean palindrom(String s, int i, int j) {
        /* COMPLETAR */
        return true;        
    } 
}