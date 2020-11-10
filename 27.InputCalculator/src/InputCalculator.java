
import java.util.Scanner;

public class InputCalculator {
    
    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        long avg = 0;
        int counter = 0;
        Scanner scanner = new Scanner(System.in);       
        while(true) {
            boolean isAnInt = scanner.hasNextInt();           
            if (isAnInt) {
                int number = scanner.nextInt();
                sum += number;
                counter++;
                double avgDouble = (double) sum / counter;
                avg = Math.round(avgDouble);                                  
            }
            else {
                System.out.println("SUM = " + sum + " AVG = " + avg);
                break;
            }
            scanner.nextLine();
        }        
        scanner.close();
    }    
    
}
