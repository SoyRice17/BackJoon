package solveStep.geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://www.acmicpc.net/problem/5073
public class Triangle2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a1 = Integer.parseInt(st.nextToken());
            int a2 = Integer.parseInt(st.nextToken());
            int a3 = Integer.parseInt(st.nextToken());

            if (a1 == 0 && a2 == 0 && a3 == 0) {
                break;
            }
            else {
                if (a1 + a2 <= a3 || a2 + a3 <= a1 || a3 + a1 <= a2) {
                    System.out.println("Invalid");
                }
                else if (a1 == a2 && a1 == a3) {
                    System.out.println("Equilateral");
                }
                else if (a1 == a2 || a1 == a3 || a2 == a3) {
                    System.out.println("Isosceles");
                }
                else {
                    System.out.println("Scalene");
                }
            }
        }
    }
}