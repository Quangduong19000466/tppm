package lab2;

public class ArrayReverse {
    public static void test() {
        int[] array = {1, 2, 3, 4, 5};
        reverse(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void reverse(int array[]) {
        int item;
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            if (i <= array.length / 2) {//chi duyet 1 nua phan tu cua mang;
                item = array[i];
                array[i] = array[j];
                array[j] = item;
            }
        }
    }
}

