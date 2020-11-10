
public class LastDigitChecker {
    
    public static boolean isValid(int number) {
        return !(number < 10 || number > 1000);
    }
    
    public static boolean hasSameLastDigit(int x, int y, int z) {
        if (!isValid(x) || !isValid(y) || !isValid(x)) {
            return false;
        }
        int xLastNumber = x % 10;        
        int yLastNumber = y % 10;
        int zLastNumber = z % 10;
        return xLastNumber == yLastNumber || xLastNumber == zLastNumber || yLastNumber == zLastNumber;
    }
    
}
