import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int X = scanner.nextInt();

        int [][] A = new int[N][M+1];

        for (int i = 0; i < N; i++) {
            int c = scanner.nextInt();
            A[i][0] = c;
            for (int j = 0; j < M; j++) {
                int a = scanner.nextInt();
                A[i][j+1] = a;
            }
        }

        Arrays.sort(A, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];    //[0] をキーにソート(昇順)
                //return o2[0] - o1[0];    //[0] をキーにソート(降順)
            }
        });

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M+1; j++) {

            }
        }
    }
}
