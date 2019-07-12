package com.stackroute.junit;
//counting the number of pages to be printed
public class PrintPages {
    private int page;
    static int i=0;

    public int printPages(int noOfPages){
        while(i!=noOfPages){
            page++;
            i++;
        }
        return page;

    }
}
