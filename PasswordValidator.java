
/*4.	Password Validator
Write a program that checks if a given password is valid. Password rules are:
•	6 – 10 characters (inclusive);
•	Consists only of letters and digits;
•	Have at least 2 digits.
If a password is valid, print "Password is valid". If it is not valid,
for every unfulfilled rule print a message:
•	"Password must be between 6 and 10 characters";
•	"Password must consist only of letters and digits";
•	"Password must have at least 2 digits".
Examples
Input	Output
logIn	Password must be between 6 and 10 characters
Password must have at least 2 digits
MyPass123	Password is valid
Pa$s$s	Password must consist only of letters and digits
Password must have at least 2 digits
Hints
Write a method for each rule.

* */

import java.util.Scanner;
public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String passwordSymbols = scanner.nextLine();
        String [] passwordValid = passwordSymbols.split("");
        String [] symbolsNumbers = {"0","1","2","3","4","5","6","7","8","9"};
        countSymbolsNumbers(passwordValid, symbolsNumbers );
    }
    public static void countSymbolsNumbers(String [] passwordValid, String [] symbolsNumbers ){
        int countSymbolPassword = 0;
        int countTwoValidNumbers = 0;
        for (int i = 0; i < passwordValid.length; i++) {
            countSymbolPassword++;
        }
        for (int i = passwordValid.length-3; i <= passwordValid.length-1; i++) {
            for (int j = 0; j < symbolsNumbers.length - 1; j++) {
                if (symbolsNumbers[j].equals(passwordValid[i])) {
                    countTwoValidNumbers += 1;
                }
            }
        }
        printValidPassword(countSymbolPassword,countTwoValidNumbers);
        printBetweenNumbers(countSymbolPassword, countTwoValidNumbers);
        printTwoDigits(countTwoValidNumbers);
    }

    public static void printValidPassword(int countSymbolPassword, int countTwoValidNumbers){
        if (countSymbolPassword >=6 && countSymbolPassword <=10 && countTwoValidNumbers>=2){
            System.out.println("Password is valid");
        }
    }
    public static void printBetweenNumbers(int countSymbolPassword, int countTwoValidNumbers){
        if (countSymbolPassword<6 || countSymbolPassword>10){
            System.out.println("Password must be between 6 and 10 characters");
        } else if (countSymbolPassword>=6 && countSymbolPassword <=10 && countTwoValidNumbers<2){
            System.out.println("Password must consist only of letters and digits");
        }
    }
    public static void printTwoDigits(int countTwoValidNumbers){
        if (countTwoValidNumbers<2){
            System.out.println("Password must have at least 2 digits");
        }
    }
}

