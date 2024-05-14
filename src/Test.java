import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    // +,- 연산을 통해 가장 최소의 식으로 값을 도출한 등차수열의 마지막 더한 값 출력
    //     <문제>
    //
    // ? 1 ? 2 ? … ? n = k 문제
    //
    // 다음과 같은 공식이 주어지면,
    //
    // ? 1 ? 2 ? … ? n = k
    //
    // 주어진 k에 대해서 식을 얻기 위해 각 ‘?’ 대신에 ‘+’ 나 ‘-‘ 연산자를 놓을 수 있습니다.
    //
    // 예를 들면 k = 12 가 되기 위해서는, 식은 다음과 같이 되어야만 합니다.
    //
    // - 1 + 2 + 3 + 4 + 5 + 6 – 7 = 12 (n = 7)
    //
    // == 입력 ==
    //
    // 첫 줄에는 테스트 케이스 개수가 입력되고 그 다음 빈 줄이 입력됩니다.
    //
    // 각 입력 테스트 케이스는 정수 k ( 0 ≤ |k| ≤ 1000000000)를 가지고 있고
    // 각 테스트 케이스는 빈 줄로 구분됩니다.
    //
    // == 출력 ==
    //
    // 각 테스트 케이스에 대해서, 여러분의 프로그램은 위 공식에서 k를 얻을 수 있는 가장 작은 n ( 1 ≤ n )을 출력합니다.
    //
    // 연속된 테스트 케이스 출력들 사이에는 빈 줄을 찍습니다.
    //

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int num;
        int last[] = new int[N];
        for (int i = 0; i < N; i++) {
            num = Integer.parseInt(br.readLine());
            num = Math.abs(num);
            last[i] = ap(num);
        }
        for (int i = 0; i < N; i++) {
            System.out.println(last[i]);
        }
    }

    public static int ap(int num) {
        int sum = 0;
        int lastAdded = 0;
        boolean even = false;

        if (num % 2 == 0) {
            even = true;
        }
    
        for (int i = 1; ; i++) {
            sum += i;
            lastAdded = i;
    
            if (sum > num) {
                if (even){
                    if (sum % 2 == 0) {
                        return lastAdded;
                    }
                }
               else {
                    if (sum % 2 == 1) {
                        return lastAdded;
                    }
                }
            }
        }
    }
}
