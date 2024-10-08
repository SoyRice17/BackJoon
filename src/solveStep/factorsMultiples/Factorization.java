package solveStep.factorsMultiples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//https://www.acmicpc.net/problem/11653
//https://st-lab.tistory.com/152 참고

import static java.lang.Math.sqrt;

public class Factorization {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for (int i = 2; i <= sqrt(n); i++){
            while (n % i == 0){
                System.out.println(i);
                n /= i;
            }
        }
        if (n != 1){
            System.out.println(n);
        }
    }
}
