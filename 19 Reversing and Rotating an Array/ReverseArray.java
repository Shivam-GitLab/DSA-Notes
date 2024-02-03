
public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 6, 8, 10, 12, 14 };
        int revArr[] = reverseArray(arr);

        for (int i = 0; i < revArr.length; i++) {
            System.out.print(revArr[i] + " ");
        }

    }

    static int[] reverseArray(int arr[]) {
        int n = arr.length;
        int j = 0;
        int revArr[] = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            revArr[j++] = arr[i];
        }
        return revArr;
    }
}
