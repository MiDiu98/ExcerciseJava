package array;

public class Exercise14 {

    public int detMatrix(int[][] a) {
        int n = a.length;
        if (n == 0) return 0;
        if (n == 1) return a[0][0];
        int det = 0;

        for (int i = 0; i < n; i++) {
            int[][] b = new int[n-1][n-1];
            int rB = 0;

            for (int c = 0; c < n; c++){
                if (c != i) {
                    for (int d = 1; d < n; d++){
                        b[rB][d-1] = a[c][d];
                    }
                    rB++;
                }
            }
            det += a[i][0] * (i % 2 == 0 ? 1 : -1) * detMatrix(b);
        }
        return det;
    }
}
