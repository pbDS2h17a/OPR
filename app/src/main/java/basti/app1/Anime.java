package basti.app1;

/**
 * Created by pbs2h17awb on 14.11.2018.
 */

public class Anime {
    String titel;
    String typ;

    Anime(String titel, String typ) {
        this.titel = titel;
        this.typ = typ;
    }

    @Override
    public String toString() {
        return "Titel: "+this.titel + " Typ: "+this.typ;
    }
}
