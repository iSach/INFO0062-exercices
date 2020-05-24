package be.isach.oopexercices.tp2.ex123;

public class PascalTriangle {

    private static long[][] triangle;
    private static int size;

    public static long get(int n, int k) {
        if (k < 0 || k > n) {
            return 0;
        }

        if (size < n) {
            resizeTo((n + 1) * 2);
        }

        return triangle[n][k];
    }

    private static void resizeTo(int sz) {
        if (size > sz) {
            return;
        }

        long[][] newTriangle = new long[sz][];

        // Copy results
        for (int n = 0; n < size; n++) {
            newTriangle[n] = triangle[n];
        }

        // Calculate new results
        for (int n = size; n < sz; n++) {
            newTriangle[n] = new long[n + 1];

            newTriangle[n][0] = 1;
            newTriangle[n][n] = 1;
            for (int k = 1; k < n; k++) {
                newTriangle[n][k] = newTriangle[n - 1][k - 1] + newTriangle[n - 1][k];
            }
        }

        size = sz;
        triangle = newTriangle;
    }

    public static String asString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int n = 0; n < size; n++) {
            for (int k = 1; k < n; k++) {
                stringBuilder.append(triangle[n][k]).append(" ");
            }
            if (n < size - 1)
                stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }
}
