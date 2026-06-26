
class Solution {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }
        if (n == 0)
            return;
        if (nums1[m - 1] <= nums2[0]) {
            for (int i = 0; i < n; i++) {
                nums1[m + i] = nums2[i];
            }
            return;
        }

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        // stop condition:
        // i, j < 0
        // nums1[i] <= nums2[0]
        // j == 0 && nums1[i] <= nums2[j]
        while (k >= 0) {

            if (i < 0) {
                nums1[k--] = nums2[j--];
                continue;
            }
            if (j < 0) {
                break;
            }
            // System.out.println("k: " + k + " -- i: " + i + " nums1[i]: " + nums1[i] + " |
            // j: " + j + " nums2[j]: " + nums2[j]);
            nums1[k--] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
        }

    }

}
