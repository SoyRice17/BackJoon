package solveStep.geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://www.acmicpc.net/problem/1085
public class EscapeLine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int u_X = Integer.parseInt(st.nextToken());
        int u_Y = Integer.parseInt(st.nextToken());
        int square_X = Integer.parseInt(st.nextToken());
        int square_Y = Integer.parseInt(st.nextToken());

        int mostMinLength = u_X > u_Y ? u_Y : u_X;

        if (mostMinLength > square_X - u_X) {
            mostMinLength = square_X - u_X;
        }
        if (mostMinLength > square_Y - u_Y) {
            mostMinLength = square_Y - u_Y;
        }
        System.out.println(mostMinLength);
    }
}
