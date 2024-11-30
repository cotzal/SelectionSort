package ioc.xtec.cat.selectionsort;

import java.util.Scanner;


/**
 * Classe principal que executa l'algorisme de Selection Sort.
 * 
 * @author Domingo Urgell Vandellós
 * @version 1.0
 */

public class Main {

      /**
     * Punt d'entrada del programa.
     *
     * @param args Arguments de línia de comandes.
     */
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdueix la mida de l'array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Introdueix els elements de l'array:");
        for (int i = 0; i < size; i++) {
            System.out.println("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        SelectionSort sorter = new SelectionSort();
        ArrayValidator validator = new ArrayValidator();

        try {
            validator.validateArray(array);

            System.out.print("Array original:");
            printArray(array);

            System.out.println("Introdueix un valor a buscar a l'array: ");
            int valueToSearch = scanner.nextInt();

            boolean contains = sorter.contains(array, valueToSearch);
            if (contains) {
                System.out.println("El valor " + valueToSearch + " existeix a l'array.");
            } else {
                System.out.println("El valor " + valueToSearch + " no existeix a l'array.");
            }

            sorter.sort(array);

            System.out.print("Array ordenat:");
            printArray(array);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
    
    /**
     * Clase que ensenya a pantalla el contingut d'un array
     *
     * @param arr array que es mostrara per pantalla
     */
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
