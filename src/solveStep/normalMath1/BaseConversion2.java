package solveStep.normalMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
//https://www.acmicpc.net/problem/11005
public class BaseConversion2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int base = Integer.parseInt(st.nextToken());

        ArrayList<Character> list = new ArrayList<>();

        while (n > 0) {
            if (n % base < 10) {
                list.add((char)((n % base) + '0'));
            }
            else {
                list.add((char)(n % base - 10 + 'A'));
            }
            n /= base;
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i));
        }
    }
}
