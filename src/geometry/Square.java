package geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//https://www.acmicpc.net/problem/27323
public class Square {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        System.out.println(num1*num2);
    }
}
