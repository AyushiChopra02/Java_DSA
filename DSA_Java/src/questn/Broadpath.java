package questn;

import java.util.Scanner;

public class Broadpath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // Size of the board
        int M = scanner.nextInt(); // Number of faces of a dice

        // Calculate and print the count of different ways the board can be traveled
        int count = SnakesAndLadders.countPaths(N, M);
        System.out.println(count);

        // Print all the paths
        SnakesAndLadders.printPaths(N, M, "");
    }
}

class SnakesAndLadders {
    // Function to count different ways the board can be traveled using the dice
    static int countPaths(int N, int M) {
        // Base case: If N is 0, there is only one way to reach the destination
        if (N == 0)
            return 1;

        int count = 0;

        // Recursively count paths by rolling the dice
        for (int i = 1; i <= M; i++) {
            if (N - i >= 0) {
                count += countPaths(N - i, M);
            }
        }

        return count;
    }

    // Function to print dice-values for all valid paths across the board
    static void printPaths(int N, int M, String path) {
        // Base case: If N is 0, print the path
        if (N == 0) {
            System.out.print(path + " ");
            return;
        }

        // Recursively generate paths by rolling the dice
        for (int i = 1; i <= M; i++) {
            if (N - i >= 0) {
                printPaths(N - i, M, path + i);
            }
        }
    }
}
