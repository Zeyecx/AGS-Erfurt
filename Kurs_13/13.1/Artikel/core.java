package artikel;

/**
 * @author Barthyr
 */
public class core {

    /* Vars */
    private static String Artikelnummer;
    private static String Artikelbezeichnung;
    private static Double Stückpreis;
    private static Double Anzahl;
    private static Double Gesamtpreis;

    /* Konstruktor */
    public core(String Artikelnummer, String Artikelbezeichnung, Double Stückpreis, Double Anzahl, Double Gesamtpreis) {
        // class reference is higher then this. ^^
        core.Artikelnummer = Artikelnummer;
        core.Artikelbezeichnung = Artikelbezeichnung;
        core.Stückpreis = Stückpreis;
        core.Anzahl = Anzahl;
        core.Gesamtpreis = Gesamtpreis;

    }

    /* ggf. Setter und Getter */
    public static String getArtikelnummer() {
        return Artikelnummer;
    }

    public static void setArtikelnummer(String aArtikelnummer) {
        Artikelnummer = aArtikelnummer;
    }

    public static String getArtikelbezeichnung() {
        return Artikelbezeichnung;
    }

    public static void setArtikelbezeichnung(String aArtikelbezeichnung) {
        Artikelbezeichnung = aArtikelbezeichnung;
    }

    public static Double getStückpreis() {
        return Stückpreis;
    }

    public static void setStückpreis(Double aStückpreis) {
        Stückpreis = aStückpreis;
    }

    public static Double getAnzahl() {
        return Anzahl;
    }

    public static void setAnzahl(Double aAnzahl) {
        Anzahl = aAnzahl;
    }

    public static Double getGesamtpreis() {
        return Gesamtpreis;
    }

    public static void setGesamtpreis(Double aGesamtpreis) {
        Gesamtpreis = aGesamtpreis;
    }

}
