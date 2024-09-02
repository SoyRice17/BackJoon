package solveStep.factorsMultiples;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//https://www.acmicpc.net/problem/9506
public class PerfectNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1){
                break;
            }
            int measure[] = new int[n+1];
            int sum = 0;
            StringBuilder sb = new StringBuilder();

            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    measure[i] = i;
                    sum += i;
                    sb.append(i).append(" + ");
                }
            }
            sb.setLength(sb.length() - 3); // remove the last " + "

            if (sum == n) {
                System.out.println(n + " = " + sb.toString());
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
    }
}