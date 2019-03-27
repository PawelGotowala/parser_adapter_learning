package Adapter;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public final class ParserDlaPlikuLinii2 {

    private static List<String[]> flights2 = new ArrayList<>();


    public List<String[]> getFlightInfo(){
        readFileScannerAndSplitByFlightsAndAddToFieldFlights2("C:\\Users\\bonzo\\IdeaProjects\\Adapter\\resources\\LOTY2");
        return flights2;
    }



    private static void readFileScannerAndSplitByFlightsAndAddToFieldFlights2(String fileNameToRead) {
        String line;
        List<String> allFlight = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(fileNameToRead))) {
            while (scanner.hasNext()) {
                line = scanner.nextLine();

             if(!line.equals("-----------------------------------------------------------------------------------------")){
                 allFlight.add(line);
                }

            }
        } catch (IOException e) {
            System.out.println("IOException!");
        };

          if(allFlight.size() % 6 != 0){
              allFlight.add(null);
          }

          for(int i = 0; i <= allFlight.size() - 6 ; i = i + 6) {

              String[] oneFlightInfo = allFlight.subList(i, i + 6).stream().toArray(String[]::new);
              flights2.add(oneFlightInfo);
          }

    }

}
