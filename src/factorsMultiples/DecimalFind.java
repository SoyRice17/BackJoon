package factorsMultiples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://www.acmicpc.net/problem/1978
public class DecimalFind {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int decimal[] = new int[N];
        for (int i = 0; i < N; i++) {
            int num1 = Integer.parseInt(st.nextToken());
            int count = 0;
            for (int j = 1; j <= num1; j++) {
                if (num1 % j == 0) {
                    count++;
                }
            }
            if (count == 2){
                decimal[i] = num1;
            }
        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (decimal[i] != 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
