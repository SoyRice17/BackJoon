package solveStep.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://www.acmicpc.net/problem/10811

public class basketReverse {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] basket = new int[Integer.parseInt(st.nextToken())];
        int count = Integer.parseInt(st.nextToken());

        for (int i = 0; i < basket.length; i++){
            basket[i] = i+1;
        }

        for (int i = 0; i < count; i++){
            st = new StringTokenizer(br.readLine());
            int ReverseStart = Integer.parseInt(st.nextToken())-1;
            int ReverseEnd = Integer.parseInt(st.nextToken())-1;
            while (ReverseStart < ReverseEnd) {
                int temp = basket[ReverseStart];
                basket[ReverseStart++] = basket[ReverseEnd];
                basket[ReverseEnd--] = temp;
            }
        }
        br.close();
        StringBuilder sb = new StringBuilder();
        for (int j : basket) {
            sb.append(j).append(" ");
        }
        System.out.println(sb);
    }
}
