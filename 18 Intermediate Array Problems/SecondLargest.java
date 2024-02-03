public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 17, 1, 2, 3, 14, 5, 6 };
        System.out.println("Max value = " + findMax(arr));
        System.out.println("Second Max value = " + findSecondMax(arr));

    }

    static int findMax(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    static int findSecondMax(int arr[]) {
        int max = findMax(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondmax = findMax(arr);

        return secondmax;

    }

}
