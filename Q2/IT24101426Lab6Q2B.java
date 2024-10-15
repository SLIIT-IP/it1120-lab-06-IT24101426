import java.util.Scanner;

public class IT24101426Lab6Q2B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1; 
        int[] numbers = new int[10]; 

        
        while (i <= 10) {
            System.out.print("Enter number " + i + ": ");
            numbers[i - 1] 
            i++; 
        }

        
        System.out.println("The entered numbers are:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
