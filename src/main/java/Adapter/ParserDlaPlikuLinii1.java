package Adapter;

import java.io.*;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public final class ParserDlaPlikuLinii1 {
    private static List<String[]> flights = new ArrayList<>();



    public List<String[]> getFlightInfo(){
    readFileScannerAndSplitByFlightsAndAddToFieldFlights("C:\\Users\\bonzo\\IdeaProjects\\Adapter\\resources\\LOTY1");
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

    private static void readFileScannerAndSplitByFlightsAndAddToFieldFlights(String fileNameToRead) {
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
        String placesNumbers = "Miejsca w pierwszej klasie: ";
        String[] numebrs = flights.get(i)[3].split("%");
        for(String numeber : numebrs){
            placesNumbers = placesNumbers + numeber + ",";
        }
        return placesNumbers;
    };

    private static String getSecondClassPlacesNumebrs(int i){
        String placesNumbers = "Miejsca w drugiej klasie: ";

        String[] numebrs = flights.get(i)[4].split("%");
        for(String numeber : numebrs){
            placesNumbers = placesNumbers + numeber + ",";
        }
        return placesNumbers;
    };

    private static String getPersonAndNumberOfPlaceAndNumebrOfReservation(int i){
        List<String[]> all = new ArrayList<>();
        String allData = "";
        String[] personsData;

        try {
            personsData = flights.get(i)[5].split("%");
            for (String person : personsData) {
                all.add(person.split("#"));
            }
            for (String[] strings : all) {
                allData = allData + "Nazwisko: " + strings[0] + ". Numera miejsca: " + strings[1] + ". Numer rezerwacji: " + strings[2] + " || ";
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            allData = null;
        }

        return allData;
    };


//todo: konwertować godzinę
}
