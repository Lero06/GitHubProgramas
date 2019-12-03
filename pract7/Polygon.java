package pract7;

import java.awt.Color;
import pract5.Point;
/**
 * Clase Polygon. Poligonos solidos (de un determinado color) en el plano,
 * dados por la secuencia de sus vertices.
 * 
 * @author IIP - Practica 7
 * @version Curso 2019/20
 */
public class Polygon {    
    /* COMPLETAR la definicion de atributos de instancia privados */
    //La array point debe ser de n espacios
    private Point[] v;
    private Color color;
    /**
     * Construye un poligono a partir de un array x con las
     * abcsisas x0, x1, x2, ..., xn-1 de sus vertices, y un array y
     * con las ordenadas y0, y1, y2, ... yn-1 de sus vertices, n > 0.
     * Los vertices definen un poligono cuyos lados se extienden de 
     * un vertice al siguiente, y cerrandose en (x0,y0).
     * Por defecto, el poligono es de color azul (Color.BLUE).
     * @param x double[], las abscisas.
     * @param y double[], las ordenadas.
     */
    public Polygon(double[] x, double[] y) {
        /* COMPLETAR */
        int n = x.length - 1; 
        v = new Point[n];
        for(int i = 0; i < n; i++){
        v[i] = new Point(x[i], y[i]);
        }
    }

    /** Devuelve las abcisas de los vertices del poligono. 
     *  @return double[], las abscisas de los vertices.
     */
    public double[] verticesX() {
        /* COMPLETAR */
        double[] cX = new double[v.length]; 
        for(int i = 0; i < v.length; i++){
        cX[i] = v[i].getX();
        }
        return cX;
    }
    
    /** Devuelve las ordenadas de los vertices del poligono.
     *  @return double[], las ordenadas de los vertices. 
     */
    public double[] verticesY() {
        /* COMPLETAR */  
        double[] cY = new double[v.length]; 
        for(int i = 0; i < v.length; i++){
        cY[i] = v[i].getY();
        }
        return cY;
    }
    
    /** Devuelve el color del poligono.
     *  @return Color, el color. 
     */
    public Color getColor() { return color;}
    
    /** Actualiza el color del poligono a un color dado.
     *  @param nC Color, el nuevo color.
     */
    public void setColor(Color nC) { nC = this.color;}
        
    /** Devuelve el perimetro del poligono.
     *  @return double, el perimetro.
     */
    public double perimeter() {
        /* COMPLETAR */
        double suma = this.;
        
    }   
    
    /** Traslada los vertices del poligono: 
     *  incX en el eje X e incY en el eje Y.
     *  @param incX double, el incremento o decremento en X.
     *  @param incY double, el incremento o decremento en Y.
     */
    public void translate(double incX, double incY) {
        /* COMPLETAR */  
    }
          
    /** Comprueba si el Point p es interior al poligono.
     *  PRECONDICION: p no esta sobre los lados del poligono.
     *  Si el punto es interior al poligono devuelve true; 
     *  en caso contrario, devuelve false.
     *  @param p Point, el punto.
     *  @return boolean, true si el punto es interior o false
     *  si es exterior.
     */
    public boolean inside(Point p) {
        /* COMPLETAR */
    } 
}
