package deepening;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://www.acmicpc.net/problem/3003
public class ChessPiece {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int king = 1;
        int queen = 1;
        int bishop = 2;
        int knight = 2;
        int rook = 2;
        int pawn = 8;
        StringBuilder sb = new StringBuilder();
        sb.append(king - Integer.parseInt(st.nextToken()));
        sb.append(" ");
        sb.append(queen - Integer.parseInt(st.nextToken()));
        sb.append(" ");
        sb.append(bishop - Integer.parseInt(st.nextToken()));
        sb.append(" ");
        sb.append(knight - Integer.parseInt(st.nextToken()));
        sb.append(" ");
        sb.append(rook - Integer.parseInt(st.nextToken()));
        sb.append(" ");
        sb.append(pawn - Integer.parseInt(st.nextToken()));
        System.out.println(sb);
    }
}
