
/*10.	Top Number
Read an integer n from the console. Find all top numbers in the range [1 … n]
 and print them. A top number holds the following properties:
•	Its sum of digits is divisible by 8, e.g. 8, 16, 88.
•	Holds at least one odd digit, e.g. 232, 707, 87578.
Examples
Input	Output		Input	Output
50	     17
         35		     100	17
                            35
                            53
                            71
                            79
                            97
* */

import java.util.Scanner;

public class TopNumber {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = Integer.parseInt(scanner.nextLine());
           sumDigits(numbers);
    }
    public static void sumDigits(int numbers){
        for (int i = 0; i < numbers; i++) {
            if (i%2!=0) {
                int firtsDigits = (i/10000)%10;
                int secondDigits = (i/1000)%10;
                int  threeDigits=(i/100)%10;
                int  fuordDigits=(i/10)%10;
                int  fiveDigits = i%10;
                int sum = secondDigits + firtsDigits + threeDigits + fuordDigits + fiveDigits ;
                if (sum%8==0 && firtsDigits% 2!=0 ||
                        sum%8==0 && secondDigits % 2!=0||
                        sum%8==0 && threeDigits % 2!=0 ||
                        sum%8==0 && fuordDigits % 2!=0 ||
                        sum%8==0 && fiveDigits % 2!=0 )  {
                    System.out.println(i);
                }
            }
        }
    }
}

