import java.util.Scanner; 

public class IT24101426Lab6Q2C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int i = 1; 
        int[] numbers = new int[10]; 
        int sum = 0; 

  
        while (i <= 10) {
            System.out.print("Enter number " + i + ": ");
            numbers[i - 1] = scanner.nextInt();
            sum += numbers[i - 1];
            i++;
        }

            double average = sum / 10.0;

        System.out.println("The entered numbers are:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
