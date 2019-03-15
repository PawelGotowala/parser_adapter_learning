package Adapter;

import java.io.*;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class PierwszaFirma {
    private static List<String[]> flights = new ArrayList<>();

    public static void main(String[] args) {
        readFileScannerAndSplitByFlightsAndAddToFieldFlights("C:\\Users\\bonzo\\IdeaProjects\\Adapter\\resources\\LOTY1");
        System.out.println(getNumberOfFlight(0) + getDepartuteTime(0)+getArrivaleTime(0));
        System.out.println(getDepartuteTime(0));
        System.out.println(getArrivaleTime(0));
        System.out.println(getFirstClassPlacesNumebrs(0));
        System.out.println(getSecondClassPlacesNumebrs(0));
        System.out.println(getPersonAndNumberOfPlaceAndNumebrOfReservation(0));

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
        String[] personsData = flights.get(i)[5].split("%");
        for(String person: personsData){
            all.add(person.split("#"));
        }
        for (String[] strings : all) {
            allData = allData + "Nazwisko: " + strings[0] + ". Numera miejsca: " + strings[1] + ". Numer rezerwacji: " + strings[2] + " || ";
        }

        return allData;
    };


//todo: konwertować godzinę
}
