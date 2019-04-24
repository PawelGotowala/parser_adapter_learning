package adapter;

import model.FlightInfo;

import java.util.ArrayList;
import java.util.List;

public class AdapterLinii2 implements IFlightsInfo {

    private ParserDlaLinii2 parserDlaLinii2;

    public AdapterLinii2(ParserDlaLinii2 parserDlaLinii2) {
        this.parserDlaLinii2 = parserDlaLinii2;
    }


    public List<FlightInfo> createFlightInfoObjectList(String fileNameToRead) {
        List<String[]> list = parserDlaLinii2.readFileScannerAndSplitByFlights(fileNameToRead);
        List<FlightInfo> flightsInfo = new ArrayList<>();

        for (String[] flight : list) {

            FlightInfo flightInfo = new FlightInfo(flight[0], flight[1], flight[2], flight[3], flight[4], flight[5]);
            flightsInfo.add(flightInfo);
        }
        return flightsInfo;
    }


}
