package homework2;

public class LinearSearch {
    public static void test() {
        int[] array = {1, 2, 3, 4, 5};
        int key = 5;
        if (linearSearch(array, key) == true) {
            System.out.println("key tim thayo vi tri : " + linearSearchIndex(array, key));
        } else {
            System.out.println("khong ton tai key");
        }
    }

    public static boolean linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static int linearSearchIndex(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return 0;
    }
}
