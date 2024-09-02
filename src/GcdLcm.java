import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GcdLcm {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        int gcd = nums[0];
        int lcm = nums[0];
        for (int i = 1; i < n; i++) {
            gcd = gcdCal(gcd, nums[i]);
            lcm = lcm / gcdCal(lcm, nums[i]) * nums[i];
        }
        System.out.println(gcd+" "+lcm);
    }
    public static int gcdCal(int a, int b) {
        if (b == 0) {
            return a;
        }
        else{
            return gcdCal(b, a % b);
        }
    }
}
