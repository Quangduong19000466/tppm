package Homework2;

public class SelectionSort {
    public static void main(String[] args) {
        int array[] = {1, 4, 2, 3, 5};
        printArray(array);
        bubbleSort(array);
        System.out.println("mang sau khi sap xep");
        printArray(array);
    }

    public static void swap(int array[], int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static void bubbleSort(int[] array) {
       for(int i=0;i<array.length;i++){
           for(int j =i+1;j<array.length;j++){
               if(array[i]>array[j]) {
                   swap(array, i, j);
               }
           }
       }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
