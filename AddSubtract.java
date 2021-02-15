
/*5.	Add and Subtract
You will receive 3 integers. Write a method sum to get the sum of the first
 two integers and subtract method that subtracts the third integer from the result from the sum method.
Examples
Input	Output
23
6
10	19
1
17
30	-12
42
58
100	0
* */

import java.util.Scanner;
public class AddSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersFirst = Integer.parseInt(scanner.nextLine());
        int numbersSecond = Integer.parseInt(scanner.nextLine());
        int numberSubtract = Integer.parseInt(scanner.nextLine());
        sum(numbersFirst, numbersSecond, numberSubtract);
    }
    public static void sum(int numbersFirst,int numbersSecond,int numberSubtract){
     int sum = subtract(numbersFirst, numbersSecond);
     sum = sum-numberSubtract;
     System.out.printf("%d",sum);
    }
    public static int subtract( int numbersFirst,int numbersSecond){
        return numbersFirst + numbersSecond;
    }
}

