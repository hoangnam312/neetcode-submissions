class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] arr = new int[m + n];
        while (k < m + n) {
            // System.out.println("i " + i + "  j " + j + "  k " + k);
            if (i == m) {arr[k++] = nums2[j++]; continue;} 
            if (j == n) {arr[k++] = nums1[i++]; continue;}
            if (nums1[i] < nums2[j]) arr[k++] = nums1[i++]; else arr[k++] = nums2[j++];
            // k++;
        }
        k = 0;
        while (k < m + n) {
            // System.out.println("k " + k);
            nums1[k] = arr[k++];
        }
    }
}