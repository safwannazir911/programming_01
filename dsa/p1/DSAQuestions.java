package dsa.p1;

import java.util.*;
import java.util.Stack;

public class DSAQuestions {

    // 1. Find the largest element in an array
    public int findLargest(int[] arr) {
        int max = arr[0]; // Start with the first element as the largest
        for (int num : arr) { // Traverse all elements
            if (num > max)
                max = num; // Update max if a larger element is found
        }
        return max;
    }

    // 2. Find the second largest element in an array
    public int findSecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) { // If current is greater than max
                secondMax = max; // Update secondMax before changing max
                max = num; // Update max to current element
            } else if (num > secondMax && num != max) { // Update secondMax only if num is distinct and less than max
                secondMax = num;
            }
        }
        return secondMax;
    }

    // 3. Check if an array is sorted
    public boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1])
                return false; // If any pair is out of order, return false
        }
        return true; // Array is sorted if loop completes
    }

    // 4. Reverse an array
    public void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) { // Swap elements from both ends
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    // 5. Find the missing number in a sequence (1 to n)
    public int findMissingNumber(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2; // Sum of 1 to n
        int actualSum = 0;
        for (int num : arr)
            actualSum += num; // Sum all elements in the array
        return expectedSum - actualSum; // Difference gives the missing number
    }

    // 6. Find duplicates in an array
    public Set<Integer> findDuplicates(int[] arr) {
        Set<Integer> duplicates = new HashSet<>();
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(num))
                duplicates.add(num); // If seen before, it's a duplicate
            else
                seen.add(num); // Otherwise, add to seen set
        }
        return duplicates;
    }

    // 7. Rotate an array by k positions
    public void rotateArray(int[] arr, int k) {
        k %= arr.length; // Normalize k in case it's greater than array length
        reverse(arr, 0, arr.length - 1); // Reverse entire array
        reverse(arr, 0, k - 1); // Reverse first k elements
        reverse(arr, k, arr.length - 1); // Reverse the rest
    }

    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }

    // 8. Find the maximum product of two integers in an array
    public int maxProduct(int[] arr) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int num : arr) { // Track top two maximums
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }
        return max1 * max2; // Return product of the two largest numbers
    }

    // 9. Move all zeros to the end of an array
    public void moveZeroesToEnd(int[] arr) {
        int insertPos = 0;
        for (int num : arr) {
            if (num != 0)
                arr[insertPos++] = num; // Shift non-zero elements forward
        }
        while (insertPos < arr.length)
            arr[insertPos++] = 0; // Fill remaining positions with zeros
    }

    // 10. Find the intersection of two arrays
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums1)
            map.put(num, map.getOrDefault(num, 0) + 1); // Count each element in nums1
        List<Integer> result = new ArrayList<>();
        for (int num : nums2) {
            if (map.getOrDefault(num, 0) > 0) { // If num in nums2 exists in nums1
                result.add(num);
                map.put(num, map.get(num) - 1); // Decrease count to avoid duplicates
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    // 11. Find the first unique character in a string
    public int firstUniqChar(String s) {
        Map<Character, Integer> count = new HashMap<>();
        for (char c : s.toCharArray())
            count.put(c, count.getOrDefault(c, 0) + 1); // Count each character
        for (int i = 0; i < s.length(); i++) {
            if (count.get(s.charAt(i)) == 1)
                return i; // Return first unique character's index
        }
        return -1;
    }

    // 12. Find the longest common prefix in an array of strings
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) { // Reduce prefix until it's common in each string
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return ""; // No common prefix found
            }
        }
        return prefix;
    }

    // 13. Binary search in a sorted array
    public int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target)
                return mid; // Return index if target is found
            else if (arr[mid] < target)
                left = mid + 1; // Search right half
            else
                right = mid - 1; // Search left half
        }
        return -1; // Target not found
    }

    // 14. Find kth largest element in an array
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k)
                minHeap.poll(); // Remove smallest to keep k largest
        }
        return minHeap.peek();
    }

    // 15. Check if two strings are anagrams
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int c : count)
            if (c != 0)
                return false;
        return true;
    }

    // 16. Reverse a linked list
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
        }
        return prev;
    }

    // 17. Detect cycle in a linked list
    public boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true; // Cycle detected
        }
        return false;
    }

    // 18. Merge two sorted linked lists
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        current.next = (l1 != null) ? l1 : l2;
        return dummy.next;
    }

    // Define ListNode class for linked list problems
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    // 19. Find the middle of a linked list
    public ListNode findMiddle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; // Move slow by 1
            fast = fast.next.next; // Move fast by 2
        }
        return slow; // Slow will be at the middle when fast reaches the end
    }

    // 20. Check if a linked list is a palindrome
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;
        ListNode slow = head, fast = head, prev = null;

        // Find the middle of the list
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        if (fast != null)
            slow = slow.next; // Skip the middle element if odd length
        while (slow != null) {
            if (slow.val != prev.val)
                return false;
            slow = slow.next;
            prev = prev.next;
        }
        return true;
    }

    // 21. Implement a stack using an array
    class ArrayStack {
        private int[] arr;
        private int top;
        private int capacity;

        public ArrayStack(int size) {
            arr = new int[size];
            capacity = size;
            top = -1;
        }

        public void push(int x) {
            if (top == capacity - 1)
                throw new IllegalStateException("Stack overflow");
            arr[++top] = x;
        }

        public int pop() {
            if (top == -1)
                throw new IllegalStateException("Stack underflow");
            return arr[top--];
        }

        public int peek() {
            if (top == -1)
                throw new IllegalStateException("Stack is empty");
            return arr[top];
        }

        public boolean isEmpty() {
            return top == -1;
        }
    }

    // 22. Implement a queue using two stacks
    class QueueUsingStacks {
        java.util.Stack<Integer> stack1 = new java.util.Stack<>();
        java.util.Stack<Integer> stack2 = new Stack<>();

        public void enqueue(int x) {
            stack1.push(x); // Always push new elements to stack1
        }

        public int dequeue() {
            if (stack2.isEmpty()) { // Move elements from stack1 to stack2 if stack2 is empty
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            if (stack2.isEmpty())
                throw new NoSuchElementException("Queue is empty");
            return stack2.pop();
        }
    }

    // 23. Find all subsets of a set (power set)
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(0, nums, new ArrayList<>(), result);
        return result;
    }

    private void generateSubsets(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current)); // Add the current subset to the result
        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]); // Include nums[i] in the current subset
            generateSubsets(i + 1, nums, current, result); // Generate subsets including nums[i]
            current.remove(current.size() - 1); // Backtrack to generate other subsets
        }
    }

    // 24. Generate all permutations of a string
    public List<String> permuteString(String str) {
        List<String> result = new ArrayList<>();
        permuteHelper(str.toCharArray(), 0, result);
        return result;
    }

    private void permuteHelper(char[] chars, int index, List<String> result) {
        if (index == chars.length) {
            result.add(new String(chars)); // Add permutation to result when index reaches end
            return;
        }
        for (int i = index; i < chars.length; i++) {
            swap(chars, i, index); // Swap current index with i
            permuteHelper(chars, index + 1, result); // Recurse with next index
            swap(chars, i, index); // Swap back to backtrack
        }
    }

    private void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    // 25. Merge intervals
    public int[][] mergeIntervals(int[][] intervals) {
        if (intervals.length <= 1)
            return intervals;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0])); // Sort intervals by starting time
        List<int[]> result = new ArrayList<>();
        int[] currentInterval = intervals[0];
        result.add(currentInterval);

        for (int[] interval : intervals) {
            int currentEnd = currentInterval[1];
            int nextBegin = interval[0];
            int nextEnd = interval[1];

            if (currentEnd >= nextBegin) { // Overlapping intervals, merge them
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                currentInterval = interval; // No overlap, add current interval
                result.add(currentInterval);
            }
        }
        return result.toArray(new int[result.size()][]);
    }

    // 26. Find the longest increasing subsequence
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0)
            return 0;
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1); // Each element is a subsequence of length 1 by itself

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) { // If nums[i] can extend the subsequence ending at nums[j]
                    dp[i] = Math.max(dp[i], dp[j] + 1); // Update the LIS length ending at i
                }
            }
        }

        int maxLIS = 0;
        for (int length : dp)
            maxLIS = Math.max(maxLIS, length); // Find the maximum LIS in dp array
        return maxLIS;
    }

    // 27. Find the number of islands (connected components in a 2D grid)
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0)
            return 0;
        int numIslands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') { // '1' represents land
                    numIslands++;
                    dfs(grid, i, j); // Sink the connected land
                }
            }
        }
        return numIslands;
    }

    private void dfs(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0')
            return;
        grid[i][j] = '0'; // Mark visited land as '0'
        dfs(grid, i + 1, j); // Visit all adjacent land (up, down, left, right)
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
    }

    // 28. Find the peak element in an array
    public int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1])
                right = mid; // Descending side of peak
            else
                left = mid + 1; // Ascending side of peak
        }
        return left;
    }

    // 29. Find the maximum profit in a stock trading problem
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE, maxProfit = 0;
        for (int price : prices) {
            minPrice = Math.min(minPrice, price); // Track minimum price seen so far
            maxProfit = Math.max(maxProfit, price - minPrice); // Calculate maximum profit possible
        }
        return maxProfit;
    }

    // 30. Implement binary tree inorder traversal
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderHelper(root, result);
        return result;
    }

    private void inorderHelper(TreeNode root, List<Integer> result) {
        if (root == null)
            return;
        inorderHelper(root.left, result); // Visit left subtree
        result.add(root.val); // Visit root
        inorderHelper(root.right, result);// Visit right subtree
    }

    // Define TreeNode class for binary tree problems
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }

    }

}
