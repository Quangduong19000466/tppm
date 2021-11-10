package lab2;

public class SwapArray {
    public static void main(String[] args) {
        int array1[] = {1, 2, 3, 4};
        int array2[] = {3, 4, 5, 6};
        if (array1.length == array2.length) {
            swap(array1, array2);
            for (int i = 0; i < array1.length; i++) {
                System.out.print(array1[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < array2.length; i++) {
                System.out.print(array2[i] + " ");
            }
        }
    }

    public static boolean swap(int[] array1, int[] array2) {
        int item;
        for (int i = 0; i < array1.length; i++) {
            item = array1[i];
            array1[i] = array2[i];
            array2[i] = item;
        }
        return true;
    }
}
