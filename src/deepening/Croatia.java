package deepening;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//https://www.acmicpc.net/problem/2941
public class Croatia {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] croatia = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        String croatiaInput = br.readLine();
        for (int i = 0; i < croatia.length; i++) {
            if (croatiaInput.contains(croatia[i])) {
                croatiaInput = croatiaInput.replace(croatia[i], "A");
            }
        }
        int count = croatiaInput.length();
        System.out.println(count);
     }
}

