package solveStep.bruteforce;
//https://www.acmicpc.net/problem/19532
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MathNoFace {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums = new int[6];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        int a = nums[0];
        int b = nums[1];
        int c = nums[2];
        int d = nums[3];
        int e = nums[4];
        int f = nums[5];

        for (int i = -999; i < 1000; i++) {
            for (int j = -999; j < 1000; j++) {
                if (a*i+b*j==c&&d*i+e*j==f) {
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}
