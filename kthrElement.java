package Experiment5;

import java.util.Comparator;
import java.util.PriorityQueue;

public class kthrElement {
     // Ques10: kth element in sorted matrix
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            minHeap.offer(new int[]{matrix[i][0], i, 0}); // {value, row, col}
        }

        int result = 0;
        while (k-- > 0) {
            int[] curr = minHeap.poll();
            result = curr[0];
            int row = curr[1], col = curr[2];

            if (col + 1 < n) {
                minHeap.offer(new int[]{matrix[row][col + 1], row, col + 1});
            }
        }
        return result;
    }
}
