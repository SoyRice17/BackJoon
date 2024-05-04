package deepening;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
//https://www.acmicpc.net/problem/10988
public class Palindrome {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        String palindrome = new StringBuilder().append(text).reverse().toString();
        if (Objects.equals(text, palindrome)){
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}

//배열이름[정수]
