package solveStep.arrays;

import java.io.*;
import java.util.StringTokenizer;

public class Avarage {
    //https://www.acmicpc.net/problem/1546
    public static void main (String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] score = new int[Integer.parseInt(br.readLine())];
        int max = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < score.length; i++){
            score[i] = Integer.parseInt(st.nextToken());
            if (score[i] > max){
                max = score[i];
            }
        }
        double sum = 0;
        for (int j : score) {
            sum += (double) j / max * 100;
        }
        double ava = sum / score.length;
        bw.write(String.valueOf(ava));
        bw.flush();
        bw.close();
    }
}
