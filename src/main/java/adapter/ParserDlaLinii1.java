package adapter;

import model.FlightInfo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class ParserDlaLinii1 {

    public List<String[]> readFileScannerAndSplitByFlights(String fileNameToRead) {
        List<String[]> flights = new ArrayList<>();
        String line;
        try (Scanner scanner = new Scanner(new File(fileNameToRead))) {
            while (scanner.hasNext()) {
                line = scanner.nextLine();
                flights.add(line.split(";"));
            }
        } catch (IOException e) {
            System.out.println("IOException!");
        }
        return flights;
    }

}
