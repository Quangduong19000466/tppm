package lab2;

public class bai2_8 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        copyOf(array);
        System.out.println();
        copyOf(array, 5);

    }

    public static int[] copyOf(int[] array) {
        int copyOf[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copyOf[i] = array[i];
            System.out.print(copyOf[i] + " ");
        }
        return copyOf;
    }

    public static int[] copyOf(int[] array, int newlength) {
        int copyOf[] = new int[newlength];
        for (int i = 0; i < copyOf.length; i++) {
            if (i < array.length) {
                copyOf[i] = array[i];
                System.out.print(copyOf[i] + " ");
            }else{
                copyOf[i]=0;
                System.out.println(copyOf[i]+" ");
            }
        }
        return copyOf;
    }

}
