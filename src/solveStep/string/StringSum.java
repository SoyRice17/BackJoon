package solveStep.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//https://www.acmicpc.net/problem/11720
public class StringSum {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        String textNum = br.readLine();
        int nums = 0;
        for (int i = 0; i < len; i++){
            nums += Integer.parseInt(String.valueOf(textNum.charAt(i)));
        }
        System.out.println(nums);
    }
}
