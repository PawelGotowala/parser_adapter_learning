package Adapter;

public class Main {
    public static void main(String[] args) {

        PierwszaFirma pierwszaFirma = new PierwszaFirma();
        AdapterPierwszaFirma adapterPierwszaFirma = new AdapterPierwszaFirma(pierwszaFirma);

        adapterPierwszaFirma.getFlightInfo();


    }
}
