import java.util.*;
import java.util.Scanner;

class noOfSqinChessboard {
    static int countSquares(int n) {
        // A better way to write n*(n+1)*(2n+1)/6
        return (n * (n + 1) / 2) * (2 * n + 1) / 3;
    }
}