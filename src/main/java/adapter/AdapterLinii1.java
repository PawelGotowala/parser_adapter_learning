package adapter;

import interfaces.IFlightsInfo;
import model.FlightInfo;

import java.util.ArrayList;
import java.util.List;
public class AdapterLinii1 implements IFlightsInfo {

    private ParserDlaLinii1 parserDlaLinii1;

    public AdapterLinii1(ParserDlaLinii1 parserDlaLinii1) {
        this.parserDlaLinii1 = parserDlaLinii1;
    }


    public List<FlightInfo> createFlightInfoObjectList(String fileNameToRead) {
        List<String[]> list = parserDlaLinii1.readFileScannerAndSplitByFlights(fileNameToRead);
        List<FlightInfo> flightsInfo = new ArrayList<>();

        for (String[] flight : list) {

            String firstClassNumbers = flight[3].replace("%", " ");
            String secondClassNumbers = flight[4].replace("%", " ");

            String personInfo;
            try {
                String firstReplace = flight[5].replace("%", " ");
                personInfo = firstReplace.replace("#", ",");


            } catch (ArrayIndexOutOfBoundsException e) {
                personInfo = null;
            }


            FlightInfo flightInfo = new FlightInfo(flight[0], flight[1], flight[2], firstClassNumbers, secondClassNumbers, personInfo);
            flightsInfo.add(flightInfo);
        }
        return flightsInfo;
    }


}
