package Task5;

public class Task5 {
    public static void main(final String[] args) {
        final int n = 3;
        final int m = 4;

        final int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = n*i + j;
            }
        }

        System.out.println("------");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }

        final int[][] newmatrixDima = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                newmatrixDima[i][j] = a[j][i];
            }
        }

        System.out.println();
        System.out.println("------");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d", newmatrixDima[i][j]);
            }
            System.out.println();
        }
    }
}

