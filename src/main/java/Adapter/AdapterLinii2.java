package Adapter;

import java.util.List;

public class AdapterLinii2 implements InterfejsDlaUzytkownika {

    private ParserDlaPlikuLinii2 parserDlaPlikuLinii2;

    public AdapterLinii2(ParserDlaPlikuLinii2 parserDlaPlikuLinii2) {
        this.parserDlaPlikuLinii2 = parserDlaPlikuLinii2;
    }

    @Override
    public List<String[]> getFlightInfo() {
        return parserDlaPlikuLinii2.getFlightInfo();
    }
}
