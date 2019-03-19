package Adapter;

public class AdapterPierwszaFirma implements InterfejsDlaUzytkownika {

    private PierwszaFirma pierwszaFirma;

    public AdapterPierwszaFirma(PierwszaFirma pierwszaFirma) {
        this.pierwszaFirma = pierwszaFirma;
    }


    @Override
    public void getFlightInfo() {
       pierwszaFirma.getFlightInfo();
    }




}
