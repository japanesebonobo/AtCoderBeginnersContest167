import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int Q = scanner.nextInt();

        int[] score = new int[M];
        for (int i = 0; i < M; i++) {
            score[i] = N;
        }

        int[][] answerFlag = new int[N][M];
        int[] totalScore = new int[N];

        int n;
        int m;

        for (int i = 0; i < Q; i++) {
            int flag = scanner.nextInt();
            n = scanner.nextInt();
            if (flag == 1) {
                System.out.println(totalScore[n - 1]);
            } else {
                m = scanner.nextInt();
                score[m - 1] -= 1;
                answerFlag[n- 1][m - 1] = 1;
                totalScore[n - 1] += score[m - 1] + 1;
                for (int j = 0; j < N; j++) {
                    if (answerFlag[j][m - 1] == 1) {
                        totalScore[j] -= 1;
                    }
                }
            }
        }
    }
}
