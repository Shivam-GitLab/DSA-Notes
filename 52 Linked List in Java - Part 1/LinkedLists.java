import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Node;

public class LinkedLists {
    public static class Node {
        int data; // Value
        Node next; // Address of next node

        Node(int data) {
            this.data = data;
        }
    }

    public static void displayList(Node head) {
        // Print Linked List
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(80);
        /*
         * System.out.println(b.data); // b.data = 20
         * System.out.println(a.next.data); // a.next = b or b.data = 20;
         */
        a.next = b; // 10 -> 20 30 40 80
        //
        b.next = c; // 10 -> 20 -> 30 40 80
        //
        c.next = d; // 10 -> 20 -> 30 -> 40 80
        //
        d.next = e; // 10 -> 20 -> 30 -> 40 -> 80
        //

        /*
         * System.out.println(e.data);
         * 
         * System.out.println(e.next);
         */
        class Solution {
            public int[] rearrangeArray(int[] nums) {
                int n = nums.length;

                List<Integer> pos = new ArrayList<>();
                List<Integer> neg = new ArrayList<>();

                for (int i = 0; i < n; i++) {
                    if (nums[i] > 0) {
                        pos.add(nums[i]);
                    } else {
                        neg.add(nums[i]);
                    }
                }

                for (int i = 0; i < n / 2; i++) {
                    nums[2 * i] = pos.get(i);
                    nums[2 * i + 1] = neg.get(i);
                }

                return nums;
            }
        }

        displayList(a);
        class Solution {
            public int[] rearrangeArray(int[] nums) {
                int n = nums.length;

                list<Integer> pos = new ArrayList<>();
                list<Integer> neg = new ArrayList<>();

                for (int i = 0; i < n; i++) {
                    if (nums[i] > 0) {
                        pos.add(nums[i]);
                    } else {
                        neg.add(nums[i]);
                    }
                }

                for (int i = 0; i < n / 2; i++) {
                    nums[2 * i] = pos.get(i);
                    nums[2 * i + 1] = neg.get(i);
                }

                return nums;
            }
        }
    }
}
