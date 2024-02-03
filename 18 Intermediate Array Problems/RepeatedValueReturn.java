public class RepeatedValueReturn {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 3, 4, 6, 3, 4 };
        // int arr[] = { 1, 2, 4, 6, 7 };
        System.out.println("Repeated Num = " + repetedReturn(arr));

    }

    static int repetedReturn(int arr[]) {
        // int rep = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    // rep = arr[i];
                    return arr[i];
                }
            }
        }
        return -1;

    }

}
