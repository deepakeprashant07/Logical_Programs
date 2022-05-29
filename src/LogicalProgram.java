import java.util.Scanner;

public class LogicalProgram {
    public int number;
    Scanner scan = new Scanner(System.in);

    public void fibonacciSeries() {
        int firstValue = 0;
        int secondValue = 1;
        System.out.println("Enter any number");
        number = scan.nextInt();
        System.out.print("Fibonacci Series =");
        for (int i = 0; i < number; i++) {
            System.out.print(firstValue + ",");
            int temp = firstValue + secondValue;
            firstValue = secondValue;
            secondValue = temp;
        }
    }

    public void perfectNumber() {
        int sumAllDivisor = 0;
        int i = 1;
        System.out.println("Enter any number");
        number = scan.nextInt();
        System.out.println("Perfect Number");
        System.out.print(number + " = ");
        while (i <= number / 2) {
            if (number % i == 0) {
                System.out.print(i);
                sumAllDivisor += i;
                System.out.print(" + ");
            }
            i++;
        }
        if (number == sumAllDivisor) {
            System.out.println("\n" + number + " = " + sumAllDivisor);
            System.out.println(number + " Is Perfect Number");
            return;
        }
        System.out.println("\n" + number + " = " + sumAllDivisor);
        System.out.println(number + " Is Not Perfect Number");
    }

    public void primeNumber() {
        int primeNumber = 0;
        System.out.println("Enter any number");
        number = scan.nextInt();
        for (int i = 0; i < number / 2; i++) {
            if (number % 2 == 0) {
                primeNumber = 1;
                break;
            }
        }
        if (primeNumber == 0)
            System.out.println(number + " Is Prime Number");
        else
            System.out.println(number + " Is Not Prime Number");
    }

    public void reverseNumber() {
        int reverse = 0;
        int originNumber=0;
        System.out.println("Enter four digit any number");
        number = scan.nextInt();
        originNumber=number;
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        System.out.println(originNumber+" The reverse of the given number is: " + reverse);
    }
}