public class SecondSmallest {
    public static void main(String[] args) {
        int arr[] = { 21, 4, 5, 1, 3, 5, 7, 8 };
        System.out.println("Smallest = " + smallest(arr));
        System.out.println("Second Smallest = " + secondSmall(arr));
    }

    static int smallest(int arr[]) {
        int small = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < small) {
                small = arr[i];
            }
        }
        return small;
    }

    static int secondSmall(int arr[]) {
        int min = smallest(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                arr[i] = Integer.MAX_VALUE;
            }
        }
        int small = smallest(arr);
        return small;
    }

}
