// import java.util.*;
public class EvenDivisible {
    public static void main(String[] args) {
        int num = 25;
        if (num % 2 == 0 && num % 3 == 0) {
            System.out.println("Hello");
        }

        if (num % 3 == 0 || num % 5 == 0) {
            System.out.println("true");
        }

        class Solution {
            public void rotateArray(int[] nums, int k) {
                int n = nums.length;
                k %= n;
                reverseArray(nums, 0, n-1);
                reverseArray(nums, 0, k-1);
                reverseArray(nums, k, n-1);

            }
            public void reverseArray(int nums[] int i, int j){
                while(i < j){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    //
                    i++;
                    j--;
                }
            }
        }
    }

}
