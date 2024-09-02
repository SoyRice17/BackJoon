package solveStep.normalMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//https://www.acmicpc.net/problem/2720
public class LaundryKingDonghyuk {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cases = Integer.parseInt(br.readLine());
        int insertMoney;
        int quarter, dime, nickel, penny;

        for (int i = 0; i < cases; i++) {
            insertMoney = Integer.parseInt(br.readLine());
            quarter = insertMoney / 25;
            insertMoney -= quarter * 25;
            dime = insertMoney / 10;
            insertMoney -= dime * 10;
            nickel = insertMoney / 5;
            insertMoney -= nickel * 5;
            penny = insertMoney / 1;
            sb.append(quarter).append(" ").append(dime).append(" ").append(nickel).append(" ").append(penny).append("\n");
        }
        System.out.println(sb);
    }
}
