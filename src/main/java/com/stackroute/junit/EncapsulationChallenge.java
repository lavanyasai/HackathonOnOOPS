package com.stackroute.junit;

public class EncapsulationChallenge {
    public static void main(String args[]){
        Printer printer=new Printer(); //creating an object for printer class
        printer.setNoOfPages(30);
        printer.setTonerLevel(30f);
        printer.setDuplexPrinter(false);
        System.out.println("Number of pages to be printed "+printer.getNoOfPages());
        System.out.println("Level of the toner is "+printer.getTonerLevel());
        System.out.println("Whether the printer is duplex: "+printer.isDuplexPrinter());
        PrintPages printPages=new PrintPages(); //creating an object for PrintPages class
        int printpage=printPages.printPages(printer.getNoOfPages());
        System.out.println(printpage+" pages are printed");
        TonerFiller tonerFiller =new TonerFiller(); //creating an object for TonerFiller class
        float tonerLevel= tonerFiller.fillToner(printer.getTonerLevel());
        System.out.println("Toner Level to be filled is: "+tonerLevel+" to be maximum");

    }
}
