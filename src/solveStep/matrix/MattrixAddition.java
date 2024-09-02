package solveStep.matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://www.acmicpc.net/problem/2738
public class MattrixAddition {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] matrixA = new int[n][m];
        int[][] matrixB;
        matrixB = new int[n][m];
        for (int i = 0; i < matrixA.length; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < matrixA[i].length; j++) {

                matrixA[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < matrixB.length; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < matrixB[i].length; j++) {
                matrixB[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                matrixA[i][j] += matrixB[i][j];
            }
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                res.append(matrixA[i][j] + " ");
            }
            res.append("\n");
        }
        System.out.println(res);
    }
}
