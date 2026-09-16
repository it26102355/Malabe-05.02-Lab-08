import java.util.Scanner;

public class IT26102355Lab8Q4 {
    public static void main(String[] args) {
        
        boolean found = false; 

        Scanner input = new Scanner(System.in);
        int[] studentsArray = new int[8];
        
        int n = 0;
        while (n < 8) {
            System.out.print("Enter student ID for student " + (n + 1) + ": ");
            int value = input.nextInt(); 
            
            if (value <= 0) { 
                System.out.println("Please enter positive numbers only.");
            } else {
                studentsArray[n] = value; 
                n++;             
            }
        }
        
        System.out.println();
        
        System.out.print("Enter student ID to search: ");
        int searchValue = input.nextInt(); 
        
        
        for (int count = 0; count < studentsArray.length; count++) {
            if (studentsArray[count] == searchValue) {
                found = true;
                break; 
            }
        }
        
        
        if (found) {
            System.out.println("Student is available");
        } else {
            System.out.println("Student is not available");
        }
        
        input.close();
    }
}