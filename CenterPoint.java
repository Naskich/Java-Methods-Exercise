/*2.	Center Point
You are given the coordinates of two points on a Cartesian coordinate system - X1, Y1, X2 and Y2.
Create a method that prints the point that is closest to the center
of the coordinate system (0, 0) in the format (X, Y). If the points
are on a same distance from the center, print only the first one.
Examples
Input	Output
2
4
-1
2	(-1, 2)
* */
import java.util.Scanner;
public class CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        printCoordinates(scanner,x1, y1, x2, y2);
    }
    public static void printCoordinates(Scanner scanner,double x1, double y1, double x2, double y2){
        double sum1 = 0;
        double sum2 = 0;
        double sumLast1 = 0;
        double sumLast2 = 0;
        sum1 = Math.pow(x1,2) + Math.pow(y1,2);
        sumLast1 = Math.sqrt(sum1);
        sum2 = Math.pow(x2,2) + Math.pow(y2,2);
        sumLast2 = Math.sqrt(sum2);
        if (sumLast1<0){
            sumLast1=sumLast1*(-1);
        }
        if (sumLast2<0){
            sumLast2=sumLast2*(-1);
        }
        if (sumLast1>sumLast2){
            System.out.printf("(%.0f, %.0f)",x1,y1);
        } else {
            System.out.printf("(%.0f, %.0f)",x2,y2);
        }
    }
}

