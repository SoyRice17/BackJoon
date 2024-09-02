package solveStep.bruteforce;
//https://www.acmicpc.net/problem/2231
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BunHaeHap {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int goal = Integer.parseInt(br.readLine());
        int result = 0;
        for (int i = 0; i < goal; i++) {
            int n = i;
            int sum = 0;
            while (n != 0) {
                sum += n % 10;
                n /= 10;
            }
            if (sum + i == goal) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
