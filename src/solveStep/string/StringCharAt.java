package solveStep.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//https://www.acmicpc.net/problem/27866
public class StringCharAt {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        int num = Integer.parseInt(br.readLine())-1;
        System.out.println(text.charAt(num));
    }
}
