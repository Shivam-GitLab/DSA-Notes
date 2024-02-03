public class TargetElemrnt {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 7, 8, 12, 12, 14 };
        int target = 12;
        System.out.println(targetElement(arr, target));

    }

    static int targetElement(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
