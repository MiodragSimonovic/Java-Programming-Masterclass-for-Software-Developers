
public class NumberToWords {
    
    public static int reverse(int number) {
        int reversedNumber = 0;        
        while (number != 0) {
            int lastNumber = number % 10;
            reversedNumber = (reversedNumber + lastNumber) * 10;
            number /= 10;
        }        
        return reversedNumber / 10;
    }    
    
    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        int DigitCount = 0;        
        while (number != 0) {
            number /= 10;
            DigitCount++;
        }        
        return DigitCount;
    }    
    
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int reversedNumber = reverse(number);
        int digitCountOfReversedNumber = 0;        
        while (reversedNumber != 0) {
            int lastNumber = reversedNumber % 10;
            switch (lastNumber) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;                
            }
            reversedNumber /= 10;
            digitCountOfReversedNumber++;
        }
        
        for (int i = 0; i < getDigitCount(number) - digitCountOfReversedNumber; i++) {
            System.out.println("Zero");
        }
    }  
    
}
