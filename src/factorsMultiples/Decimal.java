package factorsMultiples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//https://www.acmicpc.net/problem/2581
public class Decimal {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int sum = 0;
        int minDecimal = -1;

        for (int i = num1; i <= num2; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2){
                if(minDecimal == -1) {
                    minDecimal = i;
                }
                sum += i;
            }
        }

        if(minDecimal == -1) {
            System.out.println("-1");
        } else {
            System.out.println(sum);
            System.out.println(minDecimal);
        }
    }
}