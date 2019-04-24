package model;

public class FlightInfo {

    private String numberOfFlight;
    private String departuteTime;
    private String arrivaleTime;
    private String firstClassPlacesNumbers;
    private String secondClassPlacesNumbers;
    private String PersonAndNumberOfPlaceAndNumebrOfReservation;


    public FlightInfo(String numberOfFlight, String departuteTime, String arrivaleTime, String firstClassPlacesNumbers, String secondClassPlacesNumbers, String personAndNumberOfPlaceAndNumebrOfReservation) {
        this.numberOfFlight = numberOfFlight;
        this.departuteTime = departuteTime;
        this.arrivaleTime = arrivaleTime;
        this.firstClassPlacesNumbers = firstClassPlacesNumbers;
        this.secondClassPlacesNumbers = secondClassPlacesNumbers;
        this.PersonAndNumberOfPlaceAndNumebrOfReservation = personAndNumberOfPlaceAndNumebrOfReservation;
    }

    @Override
    public String toString() {
        return "FlightInfo{" +
                "numberOfFlight='" + numberOfFlight + '\'' +
                ", departuteTime='" + departuteTime + '\'' +
                ", arrivaleTime='" + arrivaleTime + '\'' +
                ", firstClassPlacesNumbers='" + firstClassPlacesNumbers + '\'' +
                ", secondClassPlacesNumbers='" + secondClassPlacesNumbers + '\'' +
                ", PersonAndNumberOfPlaceAndNumebrOfReservation='" + PersonAndNumberOfPlaceAndNumebrOfReservation + '\'' +
                '}';
    }

    public String getNumberOfFlight() {
        return numberOfFlight;
    }

    public String getDepartuteTime() {
        return departuteTime;
    }

    public String getArrivaleTime() {
        return arrivaleTime;
    }

    public String getFirstClassPlacesNumbers() {
        return firstClassPlacesNumbers;
    }

    public String getSecondClassPlacesNumbers() {
        return secondClassPlacesNumbers;
    }

    public String getPersonAndNumberOfPlaceAndNumebrOfReservation() {
        return PersonAndNumberOfPlaceAndNumebrOfReservation;
    }
}
