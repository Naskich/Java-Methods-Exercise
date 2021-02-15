
/*1.	Data Types
Write a program that, depending on the first line of the input, reads an int, double or string.
•	If the data type is int, multiply the number by 2.
•	If the data type is real, multiply the number by 1.5 and format it to the second decimal point.
•	If the data type is string, surround the input with "$".
Print the result on the console.
Examples
Input	Output
int
5	       10
real
2	      3.00
string
hello	$hello$
Hint
Try to solve the problem using only one method with different overloads

* */

import java.util.Scanner;
    public class DataTypes {
        public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String typeData = scanner.nextLine();
        printDataType( scanner,typeData);
        }
        public static void printDataType(Scanner scanner,String typeData){
                switch (typeData) {
                    case "int":
                        int number = Integer.parseInt(scanner.nextLine());
                        number = 2 * number;
                        System.out.println(number);
                        break;
                    case "real":
                        double numberReal = Integer.parseInt(scanner.nextLine());
                        numberReal = 1.5 * numberReal;
                        System.out.printf("%.2f",numberReal);
                        break;
                    case "string":
                        String stringWord = scanner.nextLine();
                        System.out.printf("$%s$",stringWord);
                        break;
                }
            }
    }
