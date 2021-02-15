
/*9.	Palindrome Integers
A palindrome is a number which reads the same backward as forward, such as 323 or 1001.
 Write a program which reads a positive integer numbers until you receive "END".
  For each number print whether the number is palindrome or not.
Examples
Input	Output		Input	Output
123
323
421
121
END	false
true
false
true		32
2
232
1010
END	false
true
true
false
* */

import java.util.Scanner;

public class PalindromeDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int countRepeat = 0;

        printPalidoneLoop(scanner,number,countRepeat);
    }
    public static void printPalidoneLoop(Scanner scanner,String number, int countRepeat) {
        while (!number.equals("END")) {
            String[] symbolString = number.split("");
            for (int i = 0; i < symbolString.length; i++) {
                countRepeat = 0;
                if (symbolString[0].contains(symbolString[symbolString.length - 1])) {
                    countRepeat++;
                }
            }
            number = scanner .nextLine();
            printTrueFalse(countRepeat);
        }
    }
    public static void printTrueFalse(int countRepeat) {
        if (countRepeat>=1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}