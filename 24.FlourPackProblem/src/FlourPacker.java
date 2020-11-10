    
public class FlourPacker {
    
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }        
        int total = 5 * bigCount + smallCount;        
        return total >= goal && goal % 5 <= smallCount;
    }    
}
