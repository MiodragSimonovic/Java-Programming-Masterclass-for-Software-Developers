
public class NumberPalindrome {
    
    public static boolean isPalindrome(int number) {
        int numberForCalculation = number;        
        int reverse = 0;        
        while(numberForCalculation != 0 ) {
            int lastDigit = numberForCalculation % 10;
            numberForCalculation = (numberForCalculation - lastDigit) / 10;
            reverse = (reverse * 10) + lastDigit;
        }
        return number == reverse;
    }
    
}
