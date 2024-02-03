public class Arrays {
    public static void main(String[] args) {
        // int[] arr = new int[5];
        // System.out.println(arr);
        // int[] arr = { 3, 5, 7, 9, 12, 45, 7, 8, 78 };
        int arr[] = { 3, 5, 7, 9, 12, 45, 7, 8, 78 };
        // System.out.println(arr);

        // for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // for each loop
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        // while loop
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }

    }
}
