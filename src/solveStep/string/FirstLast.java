package solveStep.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//https://www.acmicpc.net/problem/9086
public class FirstLast {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++){
            String text = br.readLine();
            sb.append(text.charAt(0)).append(text.charAt(text.length()-1)).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
