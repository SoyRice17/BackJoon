package solveStep.deepening;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*https://www.acmicpc.net/problem/25206*/
public class Rating {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        double gradeSum = 0;
        double creditSum = 0;

        double[] gradeScores = {0.0, 0.0, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0, 4.5};
        String[] gradeLetters = {"P","F", "D0", "D+", "C0", "C+", "B0", "B+", "A0", "A+"};

        for(int i = 0; i < 20; i++){
            st = new StringTokenizer(br.readLine(), " ");
            st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if (grade.equals("P")) {
                continue;
            }

            // Find the grade score
            for (int j = 0; j < gradeLetters.length; j++) {
                if (grade.equals(gradeLetters[j])) {
                    gradeSum += gradeScores[j] * credit;
                    creditSum += credit;
                    break;
                }
            }
        }

        double GPA = gradeSum / creditSum;
        System.out.printf("%.6f\n ", GPA);
    }
}