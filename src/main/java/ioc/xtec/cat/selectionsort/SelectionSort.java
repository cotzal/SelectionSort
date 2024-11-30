package ioc.xtec.cat.selectionsort;

/**
 * Classe de tractament d'un array
 * 
 * @author Domingo Urgell Vandellós
 * @version 1.0
 */
public class SelectionSort {

   /**
  * Mètode que ordena un array de tipus int
  *
  * @param arr Array a ordenar
  */
   public void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    /**
     * Mètode que donat un array y un valor numeric valida si existeix el valor dins del array
     *
     * @param arr array on buscar
     * @param value valor a buscar dins l'array
     */   
    public boolean contains(int[] arr, int value) {
        if (arr == null) {
            throw new IllegalArgumentException("L'array no pot ser nul.");
        }

        for (int num : arr) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }
    
}
