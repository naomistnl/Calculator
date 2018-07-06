import sun.util.resources.uk.CalendarData_uk;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        //call method
        Calculator x = new Calculator();
        x.calc(2, 4, 8);

    }

    public void calc(int a, int b, int c) {

        //a b c
        if (a * b == c) {
            System.out.println(a +" * "+ b +" = "+ c);
        } else {
            System.out.println("That's bad maths bro");
        }
        if (a - b == c) {
            System.out.println(a +" - "+ b +" = "+ c);
        } else {
            System.out.println("2 - 4 is not 8. That's bad maths bro");
        }
        if (a / b == c) {
            System.out.println(a +" / "+ b +" = "+ c);
        } else {
            System.out.println("2 / 4 is not 8. That's bad maths bro");
        }
        if (a + b == c) {
            System.out.println(a +" + "+ b +" = "+ c);
        } else {
            System.out.println("2 / 4 is not 8. That's bad maths bro");
        }


        //c a b
        if (c / a == b) {
            System.out.println(c +" / "+ a +" = "+ b);
        } else {
            System.out.println("8 / 2 is not 4. That's bad maths bro");
        }
        if (c * a == b) {
            System.out.println(c +" * "+ a +" = "+ b);
        } else {
            System.out.println("8 * 2 is not 4. That's bad maths bro");
        }
        if (c + a == b) {
            System.out.println(c +" + "+ a +" = "+ b);
        } else {
            System.out.println("8 + 2 is not 4. That's bad maths bro");
        }
        if (c - a == b) {
            System.out.println(c +" - "+ a +" = "+ b);
        } else {
            System.out.println("8 - 2 is not 4. That's bad maths bro");
        }


        //b a c
        if (b / a == c) {
            System.out.println(b +" / "+ a +" = "+ c);
        } else {
            System.out.println("That's bad maths bro");
        }
        if (b * a == c) {
            System.out.println(b +" * "+ a +" = "+ c);
        } else {
            System.out.println("4 * 2 is not 8. That's bad maths bro");
        }
        if (b + a == c) {
            System.out.println(b +" + "+ a +" = "+ c);
        } else {
            System.out.println("4 + 2 is not 8. That's bad maths bro");
        }
        if (b - a == c) {
            System.out.println(b +" - "+ a +" = "+ c);
        } else {
            System.out.println("8 - 2 is not 4. That's bad maths bro");
        }
    }
}