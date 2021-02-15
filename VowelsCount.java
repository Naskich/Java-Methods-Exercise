
/*2.	Vowels Count
Write a method that receives a single string and prints the count of the vowels.
Use appropriate name for the method.
Examples
Input	Output
SoftUni	3
Cats	1
JS	0
* */
import java.util.Scanner;
public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String indexSimbol = scanner.nextLine();
        String [] nameSimbols = indexSimbol.split("");
        countVowelsPrint(nameSimbols);
    }
    public static void countVowelsPrint(String[]nameSimbols) {
        int countAlphabetVowels = 0;
        String[] vowelsAlphabet = {"A", "a", "E", "e", "I", "i", "O", "o", "U", "u", "Y", "y"};
        for (int i = 0; i < nameSimbols.length; i++) {
            for (int j = 0; j < vowelsAlphabet.length; j++) {
                if (nameSimbols[i].equals(vowelsAlphabet[j])) {
                    countAlphabetVowels += 1;
                }
            }
        }
        System.out.println(countAlphabetVowels);
    }
}