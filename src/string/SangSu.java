package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://www.acmicpc.net/problem/2908
public class SangSu {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

        System.out.print(A > B ? A:B);
    }
}
