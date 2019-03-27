package Adapter;

import java.util.List;

public class AdapterLinii1 implements InterfejsDlaUzytkownika {

    private ParserDlaPlikuLinii1 parserDlaPlikuLinii1;

    public AdapterLinii1(ParserDlaPlikuLinii1 parserDlaPlikuLinii1) {
        this.parserDlaPlikuLinii1 = parserDlaPlikuLinii1;
    }


    @Override
    public List<String[]> getFlightInfo() {
        return parserDlaPlikuLinii1.getFlightInfo();
    }

}
