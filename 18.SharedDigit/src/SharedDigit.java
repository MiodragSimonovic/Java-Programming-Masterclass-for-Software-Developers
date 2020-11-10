
public class SharedDigit {
    
    public static boolean hasSharedDigit(int x, int y) {
        if ((x < 10 || x > 99) || (y < 10 || y > 99)) {
            return false;
        }
        int xFirstNumber = x /10;
        int xLastNumber = x % 10;
        int yFirstNumber = y /10;
        int yLastNumber = y % 10;
        return xFirstNumber == yFirstNumber || xFirstNumber == yLastNumber || xLastNumber == yFirstNumber || xLastNumber == yLastNumber;
    }
    
}
