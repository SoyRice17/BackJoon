package solveStep.factorsMultiples;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://www.acmicpc.net/problem/2501

public class Measure {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int count = 0;
        int result = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
                if (count == k) {
                    result = i;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
