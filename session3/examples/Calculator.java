import java.util.Scanner;

public class Calculator {

    public int getNumberFromUser () {
        return new Scanner(System.in).nextInt();
    }

    public void start () {
        int a = getNumberFromUser();
        int b = getNumberFromUser();
        System.out.println("Sum = " + (a + b));
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.start();
    }
}