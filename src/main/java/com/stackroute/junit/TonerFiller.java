package com.stackroute.junit;
//filling the toner if it less than 100%
public class TonerFiller {
    public float fillToner(float tonerLevel){
        if(tonerLevel<=100f){
            float remaining=100-tonerLevel;
            return remaining;
        }
        else
            return tonerLevel;
    }
}
