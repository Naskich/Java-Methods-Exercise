
/* 8.	Factorial Division
Read two integer numbers. Calculate factorial of each number.
 Divide the first result by the second and print the division formatted to the second decimal point.
Examples
Input	Output		Input	Output
5
2
	60.00		6
2	360.00
* */
import java.util.Scanner;
public class FacturiaDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numberFirst = Integer.parseInt(scanner.nextLine());
        double numberSecond = Integer.parseInt(scanner.nextLine());
        double devidNumber = factorialUsingNumbers(numberFirst,numberSecond);
        System.out.printf("%.2f", devidNumber);
    }
    private static double factorialUsingNumbers(double numberFirst,double numberSecond) {
        double factFirst = 1;
        double factSecond = 1;
        for (double i = 2; i <= numberFirst; i++) {
               factFirst = factFirst * i;
        }
        for (double i = 2; i <= numberSecond; i++) {
            factSecond = factSecond * i;
        }
        double devidNumber = 0.00;
        return devidNumber = factFirst/factSecond;
    }
}
