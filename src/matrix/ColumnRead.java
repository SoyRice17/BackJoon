package matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/10798
public class ColumnRead {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text;
        StringBuilder sb = new StringBuilder();
        String[][] matrix = new String[5][15];

        for (int i = 0; i < 5; i++) {
            text = br.readLine();
            for (int j = 0; j < 15; j++) {
                matrix[i][j] = String.valueOf(text.charAt(j));
                if(j == text.length()-1){
                    break;
                }
            }
        }
        br.close();

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if(matrix[j][i] == null){
                    continue;
                }
                sb.append(matrix[j][i]);
            }
        }
        System.out.println(sb);
    }
}
