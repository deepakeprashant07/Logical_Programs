import java.util.Scanner;

public class LogicalMainClass {
    public static final int FIBONACCI_SERIES = 1;
    public static final int PERFECT_NUMBER = 2;
    public static final int PRIME_NUMBER = 3;
    public static final int REVERSE_NUMBER = 4;

    public static void main(String[] args) {
        int choice;
        Scanner scan = new Scanner(System.in);
        LogicalProgram object = new LogicalProgram();
        System.out.println("WELCOME LOGICAL PROGRAMS");
        System.out.println("1] FIBONACCI SERIES PROGRAM");
        System.out.println("2] PERFECT NUMBER PROGRAM");
        System.out.println("3] PRIME NUMBER PROGRAM");
        System.out.println("4] REVERSE NUMBER PROGRAM");
        choice = scan.nextInt();
        switch (choice) {
            case FIBONACCI_SERIES:
                object.fibonacciSeries();
                break;
            case PERFECT_NUMBER:
                object.perfectNumber();
                break;
            case PRIME_NUMBER:
                object.primeNumber();
                break;
            case REVERSE_NUMBER:
                object.reverseNumber();
                break;
            default:
        }
    }
}
