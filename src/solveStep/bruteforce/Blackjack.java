package solveStep.bruteforce;
//https://www.acmicpc.net/problem/2798
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Blackjack {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int goal = Integer.parseInt(st.nextToken());
        int[] nums = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        int result = cal(nums, n, goal);
        System.out.println(result);
    }
    public static int cal(int[] nums, int n, int goal) {
        int result = 0;
        for (int i = 0; i < n-2; i++) { // 0번부터 N-2번까지
            for (int j = i+1; j < n-1; j++) { // 1번부터 N-1번까지
                for (int k = j+1; k < n; k++) { // 2번부터 N번까지
                    if (nums[i] + nums[j] + nums[k] == goal) { // 일정수를 더한것이 목적과 같다면 목적값 리턴
                        return goal;
                    }
                    if (result < nums[i] + nums[j] + nums[k] && nums[i] + nums[j] + nums[k] < goal) { // 기존 결과값보다 크고 목적값 보다 작다면
                        result = nums[i] + nums[j] + nums[k];
                    }
                }
            }
        }
        return result;
    }
}
