package deepening;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//https://www.acmicpc.net/problem/1316
//https://st-lab.tistory.com/69 상당수 참고
public class GroupWordChecker {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        int times = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < times; i++) {
            if(check(br.readLine())) {
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean check(String word) {
        boolean cheakAlphabet[] = new boolean[26];
        int prev = 0;
        for (int i = 0; i < word.length(); i++) {
            int now = word.charAt(i);

            if (prev != now) {
                if (!cheakAlphabet[now - 'a']) {
                    cheakAlphabet[now - 'a'] = true;
                    prev = now;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}
