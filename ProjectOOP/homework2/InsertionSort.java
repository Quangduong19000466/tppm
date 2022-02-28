package homework2;

//sap xep chen
public class InsertionSort {
    public static void test() {
        int array[] = {1, 4, 2, 3, 5};
        insertinonSort(array);
        printArray(array);
    }

    public static void insertinonSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int temp = array[i];
            int j = i - 1;
            // Di chuyển các phần tử của arr [0 ... i - 1], lớn hơn key
            // đến một vị trí trước vị trí hiện tại của chúng
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = temp;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
