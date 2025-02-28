package Experiment5;

public class Median {
    // Ques11: Median of Sorted arrays
    public double findMedianSortedArrays(int[] A, int[] B) {
        if (A.length > B.length) return findMedianSortedArrays(B, A);

        int m = A.length, n = B.length, l = 0, h = m;
        while (l <= h) {
            int x = (l + h) / 2;
            int y = (m + n + 1) / 2 - x;

            int L1 = (x == 0) ? Integer.MIN_VALUE : A[x - 1];
            int R1 = (x == m) ? Integer.MAX_VALUE : A[x];

            int L2 = (y == 0) ? Integer.MIN_VALUE : B[y - 1];
            int R2 = (y == n) ? Integer.MAX_VALUE : B[y];

            if (L1 <= R2 && L2 <= R1) {
                if ((m + n) % 2 == 0) {
                    return (Math.max(L1, L2) + Math.min(R1, R2)) / 2.0;
                } else {
                    return Math.max(L1, L2);
                }
            } else if (L1 > R2) {
                h = x - 1;
            } else {
                l = x + 1;
            }
        }
        return 0.0;
    }
}
