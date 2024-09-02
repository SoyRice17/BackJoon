package bruteforce;
//https://www.acmicpc.net/problem/1018
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChessBoard {

    public static boolean[][] grid; // 보드판
    public static int min = 64; // 최소 칠해야 하는 칸의 수

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int width = Integer.parseInt(st.nextToken()); // 보드의 가로 길이
        int height = Integer.parseInt(st.nextToken()); // 보드의 세로 길이
        grid = new boolean[width][height]; // 보드판 초기화
        
        // 보드판 입력받기
        for (int i = 0; i < width; i++) {
            String line = br.readLine();
            for (int j = 0; j < height; j++) {
                grid[i][j] = line.charAt(j) == 'W' ? true : false; // 보드판 i(고정), j(가변) 판별후 초기화

            }
        }

        int caseX = width - 7; // 보드판 가로 케이스 수 -7한 이유는 체스판 크기가 8x8이기 때문
        int caseY = height - 7; // 보드판 세로 케이스 수

        for (int i = 0; i < caseX; i++) {
            for (int j = 0; j < caseY; j++) {
                find(i, j); // 체스판 찾기
            }
        }
        System.out.println(min);

        
    }
    public static void find(int x, int y) {
        int count = 0;
        int endX = x + 8; // 보드판 가로 끝 좌표
        int endY = y + 8; // 보드판 세로 끝 좌표

        boolean first = grid[x][y]; // 첫 칸 색

        for (int i = x; i < endX; i++) { // 보드판 가로 끝 좌표까지 반복
            for (int j = y; j < endY; j++) { // 보드판 세로 끝 좌표까지 반복
                if (grid[i][j] != first) { // 첫 칸 색과 다르면
                    count++; // 카운트 증가
                }
                first = !first; // 첫 칸 색 반전
            }
            first = !first; // 줄바꿈 후 첫 칸 색 반전
        }

        min = Math.min(min, Math.min(count, 64 - count)); // 최소값 갱신
    }
}
