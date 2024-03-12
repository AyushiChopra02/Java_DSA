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

        SnakesAndLadders.printPaths(N, M, "");
    }
}
class SnakesAndLadders {
    // Function to count different ways the board can be travelled using the dice
    static int countPaths(int N, int M) {
        // Agar board ka size 0 hai, to ek rasta hi hota hai ki destination tak pahonche.
        if (N == 0)
            return 1;
//path ka count store krega 
        int count = 0;
       // yea loop har ek possible dice value ke liye board par travel karta hai. 
        //i variable ko 1 se lekar M tak badhaya jata hai, jo dice ke faces ko represent karta hai. Har ek iteration mein,
        //hum dekhte hain ki current position N se i ko subtract karke naya position kya hai. Agar nayi position valid hai (N - i >= 0), 
        //matlab ki board ke bahar nahi gaye hain, to hum countPaths function ko us nayi position ke saath phir se call karte hain. 
        //Isse har ek possible move ke liye hum paths ko count kar sakte hain. Finally, jo bhi count milta hai, 
        //hum use count variable mein add kar lete hain.
        for (int i = 1; i <= M; i++) {
            if (N - i >= 0) {
                count += countPaths(N - i, M);
            }
        }

        return count;
    }

    // Function to print dice-values for all valid paths across the board
    static void printPaths(int N, int M, String path) {
        // Agar board ka size 0 ho jata hai, to hum path ko print karte hain.
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
