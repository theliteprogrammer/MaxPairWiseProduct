import java.util.*;
import java.io.*;

public class MaxPairwiseProduct {
    static long getMaxPairwiseProduct(int[] numbers) {
        long max_product = 0;
        int max_number1 = 0;
        int max_number2 = 0;
        int max_1 = 0;
        int max_2 = 0;
        int n = numbers.length;

        // find index of the first maximum
        for (int i = 0; i < n; i++) {
            if (numbers[i] > max_number1) {
                max_number1 = numbers[i];
                max_1 = i;
            }
        }

        // find the index of the second maximum
        for (int i = 0; i < n; i++) {
            if ((i != max_1) && (numbers[i] > max_number2)) {
                max_number2 = numbers[i];
                max_2 = i;
            }
        }
        max_product = Math.max(max_product, ((long)numbers[max_1]) * numbers[max_2]);
        return max_product;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxPairwiseProduct(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                        InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}
