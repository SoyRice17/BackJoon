package geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://www.acmicpc.net/problem/9063
public class Earth {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }
        int min_X = x[0];
        int max_X = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (x[i] > max_X) {
                max_X = x[i];
            }
            if (x[i] < min_X) {
                min_X = x[i];
            }
        }

        int min_Y = y[0];
        int max_Y = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (y[i] > max_Y) {
                max_Y = y[i];
            }
            if (y[i] < min_Y) {
                min_Y = y[i];
            }
        }
        System.out.println((max_X-min_X)*(max_Y-min_Y));
    }
}
