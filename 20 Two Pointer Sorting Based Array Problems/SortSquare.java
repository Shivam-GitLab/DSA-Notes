public class SortSquare {
    public static void main(String[] args) {
        int arr[] = { -10, -3, -2, 1, 4, 5 };
        int nums[] = sortSquare(arr);
        // reverseArr(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    static int[] sortSquare(int arr[]) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        int nums[] = new int[n];
        // int k = 0;
        int k = n - 1;
        while (i <= j) {
            if (Math.abs(arr[i]) > Math.abs(arr[j])) {
                // nums[k++] = arr[i] * arr[i];
                nums[k--] = arr[i] * arr[i];
                // nums[k++] = (int) Math.sqrt(arr[i]);
                i++;
            } else {
                // nums[k++] = arr[j] * arr[j];
                nums[k--] = arr[j] * arr[j];
                j--;
            }
        }
        return nums;
    }

    static void reverseArr(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }
    }

}
