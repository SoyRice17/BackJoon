package solveStep.geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//https://www.acmicpc.net/problem/10101
public class Triangle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a1 = Integer.parseInt(br.readLine());
        int a2 = Integer.parseInt(br.readLine());
        int a3 = Integer.parseInt(br.readLine());
        if (a1+a2+a3 != 180) {
            System.out.println("Error");
        }
        else {
            if (a1 == 60 && a2 == 60 && a3 == 60) {
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
