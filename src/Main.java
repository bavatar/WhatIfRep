import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        // Start with the code below and create a program that will output the sum, product, and average of num1 and num2.
        // If the calculated sum is over 200, print an asterisk next to the sum.
        int num1, num2;
        double avgNo = 0;
        double limitNo = 200;
        int sumNo = 0;
        int prodNo = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("First number? : ");
        num1 = keyboard.nextInt();

        System.out.println("Second number? : ");
        num2 = keyboard.nextInt();

        sumNo = GetSum(num1, num2);
        prodNo = GetProduct(num1, num2);
        avgNo = GetAvg(num1, num2);

        if (sumNo > 200) {
            System.out.println("Sum : " + sumNo + "*");
        } else {
            System.out.println("Sum : " + sumNo);
        }
        System.out.println("Product : " + prodNo);
        System.out.println("Average : " + avgNo);
    }

    public static int GetProduct(int n_one, int n_two){
        return n_one * n_two;
    }

    public static int GetSum(int n_one, int n_two){
        return n_one + n_two;
    }

    public static double GetAvg(int n_one, int n_two){
        double dTest = n_one + n_two;
        return (dTest/2);
    }
}
