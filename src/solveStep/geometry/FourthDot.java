package solveStep.geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://www.acmicpc.net/problem/3009
public class FourthDot {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] x = new int[4];
        int[] y = new int[4];
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < 4; i++) {
            for (int j = i+1; j < 4; j++) {
                if (x[i] == x[j]) {
                    x[i] = -1;
                    x[j] = -1;
                }
                if (y[i] == y[j]) {
                    y[i] = -1;
                    y[j] = -1;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            if (x[i] != -1 && x[i] != 0){
                System.out.println(x[i]);
            }
        }
        for (int i = 0; i < 4; i++) {
            if (y[i] != -1 && y[i] != 0){
                System.out.println(y[i]);
            }
        }
    }
}
