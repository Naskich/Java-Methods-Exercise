
/*3.	Characters in Range
Write a method that receives two characters and prints on a single line all
 the characters in between them according to ASCII.
Examples
Input	Output
a
d	b c
#
:	$ % & ' ( ) * + , - . / 0 1 2 3 4 5 6 7 8 9
C
#	$ % & ' ( ) * + , - . / 0 1 2 3 4 5 6 7 8 9 : ; < = > ? @ A B
* */
import java.util.Scanner;
public class CharactersRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char simbolFirst = scanner.nextLine().charAt(0);
        char simbolLast = scanner.next().charAt(0);
        printSimbol(simbolFirst, simbolLast);
    }
    public  static void  printSimbol(char simbolFirst, char simbolLast){
        if (simbolFirst<simbolLast){
        for (int ascii = simbolFirst+1; ascii <= simbolLast-1; ascii++) {
            System.out.print((char)ascii+" ");
            }
        } else {
            for (int ascii = simbolLast+1; ascii <= simbolFirst-1; ascii++) {
                System.out.print((char)ascii+" ");
            }
        }
    }
}