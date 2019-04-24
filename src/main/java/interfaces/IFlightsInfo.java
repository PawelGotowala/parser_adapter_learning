package interfaces;

import model.FlightInfo;

import java.util.List;

public interface IFlightsInfo {

    List<FlightInfo> createFlightInfoObjectList(String fileNameToRead);


}