package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//5597
import java.util.Arrays;

public class WhoDidntSubmitTheirAssignment {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] a = new int[31];
        for(int i = 0; i < a.length; i++){
            a[i] = 0;
        }

        for(int i = 0; i < 28; i++){
            int num1 = Integer.parseInt(br.readLine());
            if(num1 < a.length) {
                a[num1] = num1;
            }
        }

        int lastZeroIndex = -1;
        for(int j = 1; j < a.length; j++){
            if (a[j] == 0){
                lastZeroIndex = j;
            }
        }

        for(int j = 1; j < a.length; j++){
            if (a[j] == 0){
                if (j != lastZeroIndex) {
                    System.out.println(j);
                } else {
                    System.out.print(j);
                }
            }
        }
    }
}