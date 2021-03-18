
public class Printer {
    
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            // in the text of the exercise row bellow needs to be = -1, but with that result we would have bug in the program, so I put 0
            this.tonerLevel = 0;
            System.out.println("Wrong input, min of toner level should be 0, max 100");
        }    
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
    
    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (tonerLevel + tonerAmount > 100) {
                return -1;
            } else {
                tonerLevel += tonerAmount;
                return tonerLevel;
            }        
        }
        return -1;        
    }
    
    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (duplex) {
            System.out.println("Duplex mode");
            if (pagesToPrint % 2 == 0) {
                pagesToPrint /= 2;
            } else {
                pagesToPrint = pagesToPrint / 2 + 1;
            }            
        }
        pagesPrinted = pagesToPrint;
        return pagesPrinted;
    }
    
}
