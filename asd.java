
/**
 * Write a description of class asd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class asd
{
    public static void fillArraySortedInDescendingOrder(int[] a) { 
        for(int i = a.length-1; i >= 0; i--){
            a[i]= a.length - 1 - i;
        }
    }
}
