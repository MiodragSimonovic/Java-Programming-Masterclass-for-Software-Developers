
public class DiagonalStar {
    
    public static void printSquareStar(int number) {
        char character; 
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= number; j++) {
                    character = ' '; 
                    if (i == 1 || i == number) {
                        character = '*';
                    } 
                    if (j == 1 || j == number) {
                        character = '*';
                    } 
                    if (i == j) {
                        character = '*';
                    } 
                    if (j == number - i + 1) {
                        character = '*';
                    } 
                    System.out.print(character);
                } 
                System.out.println();
            }
        }    
    }
    
}
