package normalMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://www.acmicpc.net/problem/2745
public class BaseConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String text = st.nextToken(); //숫자입력
        int base = Integer.parseInt(st.nextToken()); // 진법
        int result = 0; // 계산값 저장

        for (int i = 0; i < text.length(); i++) {
            int at = text.length() - (i+1); // 거듭제곱할 지수 구하기
            char ch = text.charAt(i); // 문자열 개별 구분
            if (Character.isLetter(ch)) { // ch가 문자라면
                result += ((ch - 55)*Math.pow(base, at)); // 55를 빼면 A부터 10,11.. 올라감 / * 진법^지수
            } else if (Character.isDigit(ch)) { // ch가 숫자라면
                result += ((ch - '0')*Math.pow(base, at)); // 숫자를 직접 사용
            }
        }
        System.out.println(result);
    }
}
