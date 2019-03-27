package Adapter;

import java.io.*;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public final class ParserDlaPlikuLinii1 {
    private static List<String[]> flights = new ArrayList<>();


    public List<String[]> getFlightInfo(){
        readFileScannerAndSplitByFlightsAndAddToFieldFlights1("src\\main\\resources\\LOTY1");
        List<String[]> flightsInfo = new ArrayList<>();

        for (int i = 0; i < flights.size(); i++) {
            String[] flightInfo = new String[6];
            flightInfo[0] = getNumberOfFlight(i);
            flightInfo[1] = getDepartuteTime(i);
            flightInfo[2] = getArrivaleTime(i);
            flightInfo[3] = getFirstClassPlacesNumebrs(i);
            flightInfo[4] = getSecondClassPlacesNumebrs(i);
            flightInfo[5] = getPersonAndNumberOfPlaceAndNumebrOfReservation(i);
            flightsInfo.add(flightInfo);
        }
        return flightsInfo;
    }

    private static void readFileScannerAndSplitByFlightsAndAddToFieldFlights1(String fileNameToRead) {
        String line;
        try (Scanner scanner = new Scanner(new File(fileNameToRead))) {
            while (scanner.hasNext()) {
                line = scanner.nextLine();
                flights.add(line.split(";"));
            }
        } catch (IOException e) {
            System.out.println("IOException!");
        }

    };

    private static String getNumberOfFlight(int i){
        return flights.get(i)[0];
    };

    private static String getDepartuteTime(int i){
        return flights.get(i)[1];
    };

    private static String getArrivaleTime(int i){
        return flights.get(i)[2];
    };

    private static String getFirstClassPlacesNumebrs(int i){
        return flights.get(i)[3].replace("%"," ");
    };

    private static String getSecondClassPlacesNumebrs(int i){
        return  flights.get(i)[4].replace("%"," ");
    };

    private static String getPersonAndNumberOfPlaceAndNumebrOfReservation(int i){
        String allData;
        try {
            String firstReplace = flights.get(i)[5].replace("%"," ");
            allData = firstReplace.replace("#",",");

        } catch(ArrayIndexOutOfBoundsException e) {
            allData = null;
        }

        return allData;
    };




}
