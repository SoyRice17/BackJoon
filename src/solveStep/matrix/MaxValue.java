package solveStep.matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://www.acmicpc.net/problem/2566
public class MaxValue {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[][] matrix = new int[9][9];
        int max = -1;
        int row = 0, column = 0;

        for (int i = 0; i < matrix.length; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    row = i+1;
                    column = j+1;
                }
            }
        }

        System.out.println(max);
        System.out.println(row+" "+column);
    }
}
