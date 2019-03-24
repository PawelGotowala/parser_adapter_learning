package Adapter;

import java.util.List;

public class Main{
    public static void main(String[] args)  {

        ParserDlaPlikuLinii1 parserDlaPlikuLinii1 = new ParserDlaPlikuLinii1();
        AdapterLinii1 adapterLinii1 = new AdapterLinii1(parserDlaPlikuLinii1);

        List<String[]> trener = adapterLinii1.getFlightInfo();
        for(String[] element : trener){
            System.out.println(element[2]);
        }


    }


}
