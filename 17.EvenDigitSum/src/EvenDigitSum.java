
public class EvenDigitSum {
    
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while(number != 0) {
            int numberForCalculation = number % 10;
            if (numberForCalculation % 2 == 0) {
                sum += numberForCalculation;
            }
            number /= 10;
        }
        return sum;
    }
    
}
