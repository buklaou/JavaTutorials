package EncapsulationPt2;

/**
 * Created by Raffi on 12/28/2015.
 */
public class Printer {

    private int tonerLevel = 0;
    private int numOfPages;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.numOfPages = 0;
        this.duplexPrinter = duplexPrinter;
    }

    public void fillUpToner(int tonerAmount) {
        if (tonerAmount >= 0 && tonerAmount <= 100) {
            this.tonerLevel = this.tonerLevel + tonerAmount;
            if (this.tonerLevel + tonerAmount > 100 || this.tonerLevel + tonerAmount < 0) {
                System.out.println(-1);
            }
            System.out.println("Current toner level is " + this.tonerLevel);
        } else {
            System.out.println(-1);
        }
    }

    public boolean enoughToner() {

        if (this.tonerLevel <= 0 || this.tonerLevel < 10) {
            System.out.println("Need to add more toner.");
            return false;
        }
        return true;

    }

    public void printingPage(int pages) {


        while(enoughToner()) {
            if(duplexPrinter) {
                this.tonerLevel -= 10;
                numOfPages += pages / 2;
                System.out.println("Amount of pages printed was " + pages
                        + " with a total number of " + getNumOfPages() + " pages.");
                System.out.println("Current toner level is " + this.tonerLevel);
                break;

            }
            if (!duplexPrinter)
                this.tonerLevel -= 10;
            numOfPages += pages;
            System.out.println("Amount of pages printed was " + pages
                    + " with a total number of " + getNumOfPages() + " pages.");
            System.out.println("Current toner level is " + this.tonerLevel);
            break;

        }

    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }
}
