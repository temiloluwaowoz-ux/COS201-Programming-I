/*
 * Student Name: OWOLABI TEMILOLUWA BUSOLA
 * Matric No: 25/17320
 * Programme: COMPUTER SCIENCE
 * Course: COS 201 - Week 3
 */
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double secondNumber = scanner.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = 0;
        boolean valid = true;
        
        switch(operator) {
            case '+': result = firstNumber + secondNumber; break;
            case '-': result = firstNumber - secondNumber; break;
            case '*': result = firstNumber * secondNumber; break;
            case '/': 
                if(secondNumber != 0) result = firstNumber / secondNumber;
                else { System.out.println("Error: Division by zero not allowed."); valid = false; }
                break;
            default: System.out.println("Invalid operator."); valid = false;
        }
        if(valid) {
            System.out.printf("Result: %.2f %c %.2f = %.2f%n", firstNumber, operator, secondNumber, result);
        }
        scanner.close();
    }
}
