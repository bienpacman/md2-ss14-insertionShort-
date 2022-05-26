public class insertionShort {
    public static void printArr(int a , int[] arr){
        System.out.printf("%d: ", a);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i] );
        }
        System.out.println();
    }
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
          int  a = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > a) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = a;
            printArr(i, arr);
        }

    }

    public static void main(String[] args) {
       int[] arr= {5,2,6,1,8,4,0,7};
       insertionSort(arr);
    }
}