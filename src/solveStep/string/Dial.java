package solveStep.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//https://www.acmicpc.net/problem/5622
public class Dial {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int times = 0;

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'A': case 'B': case 'C':
                    times +=3;
                    break;
                case 'D': case 'E': case 'F':
                    times +=4;
                    break;
                case 'G': case 'H': case 'I':
                    times +=5;
                    break;
                case 'J': case 'K': case 'L':
                    times +=6;
                    break;
                case 'M': case 'N': case 'O':
                    times +=7;
                    break;
                case 'P': case 'Q': case 'R': case 'S':
                    times +=8;
                    break;
                case 'T': case 'U': case 'V':
                    times +=9;
                    break;
                case 'W': case 'X': case 'Y': case 'Z':
                    times +=10;
                    break;
            }
        }
        System.out.println(times);
    }
}
