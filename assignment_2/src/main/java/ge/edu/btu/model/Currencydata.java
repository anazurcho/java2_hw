package ge.edu.btu.model;

import java.util.ArrayList;

public class Currencydata {
    private static ArrayList<Currency> currencyarray;

    private Currencydata() {
    }
    public static ArrayList<Currency> getInstance(){
        if (currencyarray==null) {
            currencyarray = new ArrayList<Currency>();
        }
        return currencyarray;
    }
}