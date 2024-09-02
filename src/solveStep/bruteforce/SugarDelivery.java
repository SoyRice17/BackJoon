package solveStep.bruteforce;
//https://www.acmicpc.net/problem/2839
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SugarDelivery {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sugar = Integer.parseInt(br.readLine());

        int count = 0;

        while (sugar > 0) {
            if (sugar % 5 == 0) {
                count += sugar / 5;
                break;
            } else {
                sugar -= 3;
                count++;
            }
        }

        if (sugar < 0) {
            System.out.println(-1);
        } else {
            System.out.println(count);
        }
    }
}

