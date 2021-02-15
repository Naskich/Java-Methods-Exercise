
/*1.	Smallest of Three Numbers
Write a method to print the smallest of three integer numbers.
Use appropriate name for the method.
Examples
Input	Output
2
5
3	2
600
342
123	123
25
-21
4	-21
* */
import java.util.Scanner;
public class SmallestThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberFirst = Integer.parseInt(scanner.nextLine());
        int numberSecond = Integer.parseInt(scanner.nextLine());
        int numberThird = Integer.parseInt(scanner.nextLine());
        smallerComparison(numberFirst, numberSecond, numberThird);
    }
    public static void smallerNumbers(int numberFirst,int numberSecond,int numberThird){

            int smallNumber = Math.min(numberFirst, numberSecond);
            if (smallNumber==numberFirst){
                System.out.println(Math.min(numberFirst, numberThird));
            } else {
                System.out.println(Math.min(numberSecond, numberThird));
            }
    }
    public static void smallerComparison(int numberFirst,int numberSecond,int numberThird) {
        if (numberFirst != numberSecond && numberSecond != numberThird && numberThird != numberFirst) {
            smallerNumbers(numberFirst, numberSecond, numberThird);
        } else {
            smallerComparisonеEquality(numberFirst,numberSecond,numberThird);
        }
    }
    public static void smallerComparisonеEquality(int numberFirst,int numberSecond,int numberThird){
         if(numberFirst==numberSecond && numberSecond!=numberThird){
            System.out.println(Math.min(numberSecond, numberThird));
        } else if(numberFirst!=numberSecond && numberSecond==numberThird){
            System.out.println(Math.min(numberFirst, numberThird));
        } else if(numberFirst==numberThird && numberSecond!=numberThird) {
             System.out.println(Math.min(numberSecond, numberThird));
         }  else {
             System.out.println(numberFirst);
         }
    }
}
