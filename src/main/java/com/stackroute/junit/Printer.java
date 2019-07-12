package com.stackroute.junit;
//printer details
public class Printer {
    private float tonerLevel;
    private int noOfPages;
    private boolean duplexPrinter;

    public float getTonerLevel() {
        return tonerLevel;
    }

    public void setTonerLevel(float tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }

    public void setDuplexPrinter(boolean duplexPrinter) {
        this.duplexPrinter = duplexPrinter;
    }

    @Override
    public String toString() {
        return "Printer{" +
                "tonerLevel=" + tonerLevel +
                ", noOfPages=" + noOfPages +
                ", duplexPrinter=" + duplexPrinter +
                '}';
    }
}
