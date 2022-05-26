public class insertionShort2 {
    static int[] arr = {5, 2, 6, 1, 8, 4, 0, 7};

    public static void insertionShort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > a) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = a;
        }
    }

    public static void main(String[] args) {
        insertionShort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
