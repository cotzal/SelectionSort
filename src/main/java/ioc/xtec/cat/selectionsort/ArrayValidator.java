package ioc.xtec.cat.selectionsort;

/**
 * Classe de validació d'un array
 * 
 * @author Domingo Urgell Vandellós
 * @version 1.0
 */
public class ArrayValidator {

     /**
     * Mètode que valida un array
     *
     * @param arr Array que es valida
     */
    public void validateArray(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("L'array no pot ser nul.");
        }
        if (arr.length == 0) {
            throw new IllegalArgumentException("L'array no pot estar buit.");
        }
    }
    
}
