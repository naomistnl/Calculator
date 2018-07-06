import java.util.Scanner;

public class CalcTwo {

    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number ");
        num1 = input.nextInt();

        System.out.println("Enter your second number ");
        num2 = input.nextInt();

        System.out.println("Enter your third number ");
        num3 = input.nextInt();

        if (num1 + num2 == num3) {
            System.out.println(num1 + " + " + num2 + " = " + num3);
        } else {
            System.out.println(num1 + " + " + num2 + " is not " + num3 + " Try again!");
        }
        if (num1 - num2 == num3) {
            System.out.println(num1 + " + " + num2 + " = " + num3);
        } else {
            System.out.println(num1 + " - " + num2 + " is not " + num3 + " Try again!");
        }
        if (num1 * num2 == num3) {
            System.out.println(num1 + " * " + num2 + " = " + num3);
        } else {
            System.out.println(num1 + " * " + num2 + " is not " + num3 + " Try again!");
        }
        if (num1 / num2 == num3) {
            System.out.println(num1 + " / " + num2 + " = " + num3);
        } else {
            System.out.println(num1 + " / " + num2 + " is not " + num3 + " Try again!");
        }
    }
}