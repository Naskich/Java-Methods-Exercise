
/*7.	NxN Matrix
Write a method that receives a single integer n and prints nxn matrix with that number.
Examples
Input	Output
3	3 3 3
    3 3 3
    3 3 3

7	7 7 7 7 7 7 7
    7 7 7 7 7 7 7
    7 7 7 7 7 7 7
    7 7 7 7 7 7 7
    7 7 7 7 7 7 7
    7 7 7 7 7 7 7
    7 7 7 7 7 7 7

2	2 2
    2 2
* */

import java.util.Scanner;
public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        printNxNMatrix(number);
    }
    public static void printNxNMatrix(int number) {
        for (int j = 1; j <= number; j++) {
            for (int i = 1; i <= number; i++) {
                System.out.printf("%d ", number);
            }
            System.out.println();
        }
    }
}

