package solveStep.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//https://www.acmicpc.net/problem/10809
public class AlphabetLocation {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        int[] ascii = new int[26];
        for (int i = 97; i < 123; i++){
            char serch = (char) i;
            ascii[i-97] = text.indexOf(serch);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ascii.length; i++){
            sb.append(ascii[i]).append(" ");
        }
        System.out.println(sb);
    }
}
