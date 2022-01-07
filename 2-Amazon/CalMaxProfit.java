import java.util.*;
import java.util.Scanner;

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();

    int[] A = new int[N];
    for(int i=0;i<N;i++){
        A[i] = sc.nextInt();
    }

    maxProfit(K, N , A);
}

public static int maxProfit(int K, int N, int A[]) {
    int profit[][] = new int[K + 1][N + 1];
    for (int i = 0; i <= K; i++) profit[i][0] = 0;
    for (int j = 0; j <= N; j++) profit[0][j] = 0;
    for (int i = 1; i <= K; i++) {
        int prevDiff = Integer.MIN_VALUE;
        for (int j = 1; j < N; j++) {
            prevDiff = Math.max(prevDiff, profit[i - 1][j - 1] - A[j - 1]);
            profit[i][j] = Math.max(profit[i][j - 1], A[j] + prevDiff);
        }
    }

    return profit[K][N - 1];
}