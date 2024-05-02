import java.io.*;
import java.util.StringTokenizer;
//https://www.acmicpc.net/problem/10810
public class ballBasket {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] basket = new int[Integer.parseInt(st.nextToken())];
        int count = Integer.parseInt(st.nextToken());
        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int startBasket = Integer.parseInt(st.nextToken())-1;
            int endBasket = Integer.parseInt(st.nextToken())-1;
            int insertNum = Integer.parseInt(st.nextToken());
            for(int j = startBasket; j <= endBasket; j++){
                basket[j] = insertNum;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int j : basket) {
            sb.append(j).append(" ");
        }
        System.out.println(sb);
    }
}
