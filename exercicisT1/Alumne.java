/**
 * Classe Alumne: representa la informacio d'un alumne.
 * 
 * @author PRG 
 * @version Curs 2019/20
 */
public class Alumne {
    private long dni;
    private double nota;
    private String nom;
    
    /** Crea un Alumne amb dni i nom donats.
     *  @param d long que indica el dni.
     *  @param n String que indica el nom.
     */
    public Alumne(long d, String n) {
        dni = d;
        nom = n;
        nota = 0;
    }
    
    /** 
     * Torna el dni de l'alumne.
     * @return long, el dni.
     */
    public long getDni() { return dni; }
    
    /** 
     * Torna la nota de l'alumne.
     * @return double, la nota.
     */
    public double getNota() { return nota; }
    
    /** 
     * Torna el nom de l'alumne.
     * @return String, el nom.
     */
    public String getNom() { return nom; }
    
    /** 
     * Actualitza a d el dni de l'alumne.
     * @param d long.
     */
    public void setDni(long d) { dni = d; } 
    
    /** 
     * Actualitza a n la nota de l'alumne.
     * @param n double.
     */
    public void setNota(double n) { nota = n; }
    
    /** 
     * Actualitza a n el nom de l'alumne.
     * @param n String.
     */
    public void setNom(String n) { nom = n; }
    
    /** Comprova si dos alumnes son iguals, aço es, 
     *  si tenen el mateix dni i el mateix nom.
     *  @param o Object.
     *  @return boolean.
     */
    public boolean equals(Object o) {
        return o instanceof Alumne  
            && dni == ((Alumne) o).dni 
            && nom.equals(((Alumne) o).nom);
    }
    
    /** Torna un String amb les dades de l'alumne.
     *  @return String.   
     */
    public String toString() {
        return dni + "\t" + nom + "\t" + nota;
    }
}