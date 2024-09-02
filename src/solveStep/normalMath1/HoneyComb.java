package solveStep.normalMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//https://www.acmicpc.net/problem/2292
//https://st-lab.tistory.com/73 참고
public class HoneyComb {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 1; // 2번부터 한개 지나가야 하기 때문에
        int range = 2; // 2번부터 한 껍질 밖이라
        
        if (N == 1) {
            System.out.println(1);
        }

        else {
            while (range <= N) {
                range += (count*6);
                count++;
            }
            System.out.println(count);
        }
    }
}
