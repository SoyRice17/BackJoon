package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//https://acmicpc.net/problem/2743

public class StringLength {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        System.out.println(text.length());
    }
}
