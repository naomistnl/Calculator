import java.util.Scanner;

public class factorials {
    public static void main(String[] args) {

        int i, fact = 1; //this is our initial factorial

        int number = 5; //this is the number we want to calculate

        for (i = 1; i <= number; i++) { /*the for loop will run for each number from 1 - 5
                                       multiplying 5 by that number until we reach 120 e.g. 1 * 5 = 5, 5 * 2 = 10 etc */

            fact = fact * i; /*this works out the factorial - 1 * 120 (the number we end up with
             after the loop*/
        }
        System.out.println("Factorial of 5 is " + fact); //this will print the result

        //call other method
        factorials x = new factorials();
        x.factorial2();


        factorials z = new factorials();
        z.factorial4();
    }
    //now lets reverse it!

    public void factorial2() {

        int number = 120; //This is the number we are starting with

        int nums[] = {2, 3, 4, 5}; //these are the numbers we want to divide 120 by until we get to factorial 5

        for (int i : nums) { //for every integer i, in nums, do the following:

            number = number / i; //120 = 120/each number in the array

            if (number == 5) {
                System.out.println("Factorial of 120 is " + number);
                break; /*if the number reaches 5 (the factorial we are looking for) we want to print the factorial
                    and break the loop*/
            }

        }
    }


   //function to find the factorial of any number
    public void factorial4() {
        int n, c, fact = 1;


        Scanner in = new Scanner(System.in);
        System.out.println("Enter number here: ");


        n = in.nextInt();

        if (n == 0) {
                System.out.println("No");
        } else {
            for (c = 1; c <= n; c++)
                fact = fact * c;
        }
        System.out.println("Factorial of " + n + " is " + fact);
    }
}

