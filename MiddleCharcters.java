
/*6.	Middle Characters
You will receive a single string. Write a method that prints the middle character.
If the length of the string is even, there are two middle characters.
Examples
Input	Output
aString	r
someText	eT
3245	24
* */

import java.util.Scanner;
public class MiddleCharcters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String symbolIndex = scanner.nextLine();
        String[] symbolString = symbolIndex.split("");
        printElementSymbolString(symbolString);
    }
    public static void printElementSymbolString(String[] symbolString ){
        int countElementsHalf = 0;
        if (symbolString.length%2==0){
            countElementsHalf=symbolString.length/2;
            for (int i = countElementsHalf-1; i <= symbolString.length-countElementsHalf; i++){
                System.out.printf(symbolString[i]+"");
            }
        } else {
            countElementsHalf=symbolString.length/2;
            for (int i = countElementsHalf; i <= symbolString.length-countElementsHalf-1; i++){
                System.out.printf(symbolString[i]+"");
            }
        }
    }
}