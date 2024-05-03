package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://www.acmicpc.net/problem/2675
public class StringRepeat {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            int repeat = Integer.parseInt(st.nextToken());
            String text = st.nextToken();
            for(int k = 0; k < text.length(); k++){
                for(int j = 0; j < repeat; j++){
                    sb.append(text.charAt(k));
                }
            }
            sb.append("\n");
        }
        br.close();
        System.out.println(sb);
    }
}
