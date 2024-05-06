package deepening;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//https://www.acmicpc.net/problem/1157

public class MostAlphabet {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        int[] alphabet = new int[26];

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= 65 && text.charAt(i) <= 90){
                alphabet[text.charAt(i) - 65]++;
            }
            else{
                alphabet[text.charAt(i) - 97]++;
            }
        }

        int max = -1;
        char mostAlphabet = '?';
        for( int i = 0; i < 26; i++){
            if (max < alphabet[i]){
                max = alphabet[i];
                mostAlphabet = (char) (i+65);
            }
            else if (alphabet[i] == max) {
                mostAlphabet = '?';
            }
        }
        System.out.println(mostAlphabet);
    }
}
