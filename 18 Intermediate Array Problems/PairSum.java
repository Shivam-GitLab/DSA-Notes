
public class PairSum {
    public static void main(String[] args) {
        int arr[] = { 4, 6, 3, 5, 8, 2 };
        int target = 7;
        targetSum(arr, target);
        System.out.println();
        int arrr[] = { 1, 4, 5, 6, 3 };
        tripletSum(arrr, 12);

    }

    static void targetSum(int arr[], int target) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    sum++;
                }
            }

        }
        System.out.print("Two Sum= " + sum);
    }

    static void tripletSum(int arr[], int target) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        sum++;
                    }
                }
            }
        }
        System.out.print("Triple Sum= " + sum);
    }
}
