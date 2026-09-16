import java.util.Scanner;

public class IT26102355Lab8Q1A {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] myArray = new int[5];

        System.out.println("Please enter 5 numbers:");

        int n = 0;

        while (n < 5) {
            System.out.print("Enter number " + (n + 1) + ": ");
            myArray[n] = input.nextInt();
            n++;
        }

        System.out.println();
        System.out.println("Array in reverse order :");

        n = 4;

        while (1 <= n) {
            System.out.print(myArray[n]);

            if (0 < n) {
                System.out.print(" ");
            }

            n--;
        }
		System.out.print(myArray[n]);
    }
}