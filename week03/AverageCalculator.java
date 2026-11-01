/*
 * Student Name: OWOLABI TEMILOLUWA BUSOLA
 * Matric No: 25/17320
 * Programme: COMPUTER SCIENCE
 */
import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first score: ");
        double score1 = input.nextDouble();
        System.out.print("Enter second score: ");
        double score2 = input.nextDouble();
        System.out.print("Enter third score: ");
        double score3 = input.nextDouble();
        
        double total = score1 + score2 + score3;
        double average = total / 3;
        
        System.out.printf("Total: %.2f%n", total);
        System.out.printf("Average: %.2f%n", average);
        input.close();
    }
}
