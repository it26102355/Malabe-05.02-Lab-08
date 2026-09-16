import java.util.Scanner;

public class IT26102355Lab8Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] Array = new int[6];
        
        int n = 0;
        while (n < 6) {
            System.out.print("Enter a positive number (" + (n + 1) + "/6): ");
            int value = input.nextInt(); 
            
            if (value <= 0) { 
                System.out.println("Please enter positive numbers only.");
            } else {
                Array[n] = value; 
                n++;             
            }
        }
		
		 System.out.println();
		 
         System.out.println("Array content :");
		
		 int i = 0;
		 while (i < 6) {
            System.out.print(Array[i]);

            if (i < 5) {
                System.out.print(" ");
            }

            i++;
        }
		
		System.out.println();
		
		int max = Array[0]; 
        
        for (int k = 1; k < 6; k++) {
            if (Array[k] > max) {
                max = Array[k];
            }
        }
		
	   System.out.print("The maximum number entered :" + max);
	   
    }
}