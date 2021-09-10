import java.util.Scanner;

public class MyMain {
    // Write a method that asks the user to input a double between 0.0 and 1000000.0
    // Your method should keep asking them until they type in a valid value
    // The method returns the final double they type in

    // scan.nextDouble() might be useful here
    public static double inputDouble() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number between 0.0 and 1000000.0");
            double x = scan.nextDouble();
            if (x > 0.0 && x < 1000000.0) {
                return x;
            }
            else {
            }

        }
    }

    // Takes a double money as input and returns the number of quarters that we
    // can return in change
    // You should use a while loop!
    public static int numQuarters(double money) {
        double w = 0;
        double coins = 0;
        while (w < money) {
            w = w + 0.25;
            coins ++;
        }

        return (int)coins;
    }

    // Takes a double money as input and returns the number of dimes that we
    // can return in change
    // You should use a while loop!
    public static int numDimes(double money) {
        double w = 0;
        double coins = 0;
        while (w < money) {
            w = w + 0.10;
            coins ++;
        }

        return (int)coins;
    }

    // Takes a double money as input and returns the number of nickels that we
    // can return in change
    // You should use a while loop!
    public static int numNickels(double money) {
        double w = 0;
        double coins = 0;
        while (w < money) {
            w = w + 0.05;
            coins ++;
        }

        return (int)coins;
    }

    // Takes a double money as input and returns the number of pennies that we
    // can return in change
    // You should use a while loop!
    public static int numPennies(double money) {
        // REPLACE THIS WITH YOUR CODE
        double w = 0;
        double coins = 0;
        while (w < money) {
            w = w + 0.01;
            coins ++;
        }

        return (int)coins;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // You should test inputDouble yourself!
        double d = inputDouble();
        System.out.println(d);

        // Some code to test numQuarters
        System.out.println("\nnumQuarters tests:");
        System.out.println("1.25 in quarters would be: " + numQuarters(1.25) + " quarters."); // 5
        System.out.println("10.55 in quarters would be: " + numQuarters(10.55) + " quarters."); // 42
        System.out.println("1000000.20 in quarters would be: " + numQuarters(1000000.20) + " quarters."); //4000000

        // Some code to test numDimes
        System.out.println("\nnumDimes tests:");
        System.out.println("1.20 in dimes would be: " + numDimes(1.20) + " dimes."); // 12
        System.out.println("120.13 in dimes would be: " + numDimes(120.13) + " dimes."); //1201
        System.out.println("150.25 in dimes would be: " + numDimes(150.25) + " dimes."); //1502

        scan.close();
    }
}