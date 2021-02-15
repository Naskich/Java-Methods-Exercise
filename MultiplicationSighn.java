
/*5.	Multiplication Sign
You are given a number num1, num2 and num3.
Write a program that finds if num1 * num2 * num3 (the product) is negative, positive or zero.
 Try to do this WITHOUT multiplying the 3 numbers.
Examples
Input	Output		Input	Output
2
3
-1	    negative

2
3
1	    positive
* */

import java.util.Scanner;

public class MultiplicationSighn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        insertNumbers(scanner);

    }
    public static void printMultiplication(int num1, int num2, int num3){
            if ((num1*num2*num3)>0) {
                System.out.println("positive");
            }
            if ((num1*num2*num3)<0) {
                System.out.println("negative");
            }
            if ((num1*num2*num3)==0) {
                System.out.println("zero");
            }
            if ((num1*num2*num3)>2147483647 || (num1*num2*num3)<-2147483647) {
                System.out.println("WITHOUT");
            }
        }
        public static void insertNumbers(Scanner scanner){
            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());
            int num3 = Integer.parseInt(scanner.nextLine());

          printMultiplication( num1, num2, num3);
        }
    }

