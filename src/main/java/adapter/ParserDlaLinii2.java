package adapter;

import model.FlightInfo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class ParserDlaLinii2 {

    public List<String[]> readFileScannerAndSplitByFlights(String fileNameToRead) {
        String line;
        List<String> allFlight = new ArrayList<>();
        List<String[]> flights = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(fileNameToRead))) {
            while (scanner.hasNext()) {
                line = scanner.nextLine();

                if (!line.equals("-----------------------------------------------------------------------------------------")) {
                    allFlight.add(line);
                }

            }
        } catch (IOException e) {
            System.out.println("IOException!");
        }

        if (allFlight.size() % 6 != 0) {
            allFlight.add(null);
        }

        for (int i = 0; i <= allFlight.size() - 6; i = i + 6) {

            String[] oneFlightInfo = allFlight.subList(i, i + 6).toArray(new String[0]);
            flights.add(oneFlightInfo);
        }

        return flights;
    }


}
