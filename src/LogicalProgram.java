import java.util.Scanner;

public class LogicalProgram {
    public int firstValue = 0;
    public int secondValue = 1;
    public int number;
    Scanner scan = new Scanner(System.in);

    public void fibonacciSeries() {
        System.out.println("Enter any number");
        int number = scan.nextInt();
        System.out.print("Fibonacci Series =");
        for (int i = 0; i < number; i++) {
            System.out.print(firstValue + ",");
            int temp = firstValue + secondValue;
            firstValue = secondValue;
            secondValue = temp;
        }
    }
}