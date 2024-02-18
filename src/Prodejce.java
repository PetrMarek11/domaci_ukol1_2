import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Prodejce {
    private String jmeno;
    private String prijmeni;
    private LocalDate datumNarozeni;
    private int pocetSmluv;
    private BigDecimal mnozstviProdaneMrkve;
    private String mesto;
    private String spz;
    private BigDecimal spotrebaVozidla;
    private String ipAdresa;

    // Konstruktor pro inicializaci údajů

    public Prodejce(String jmeno, String prijmeni,
                    LocalDate datumNarozeni, int pocetSmluv,
                    BigDecimal mnozstviProdaneMrkve,
                    String mesto, String spz, BigDecimal spotrebaVozidla,
                    String ipAdresa) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.datumNarozeni = datumNarozeni;
        this.pocetSmluv = pocetSmluv;
        this.mnozstviProdaneMrkve = mnozstviProdaneMrkve;
        this.mesto = mesto;
        this.spz = spz;
        this.spotrebaVozidla = spotrebaVozidla;
        this.ipAdresa = ipAdresa;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public LocalDate getDatumNarozeni() {
        return datumNarozeni;
    }

    public void setDatumNarozeni(LocalDate datumNarozeni) {
        this.datumNarozeni = datumNarozeni;
    }

    public int getPocetSmluv() {
        return pocetSmluv;
    }

    public void setPocetSmluv(int pocetSmluv) {
        this.pocetSmluv = pocetSmluv;
    }

    public BigDecimal getMnozstviProdaneMrkve() {
        return mnozstviProdaneMrkve;
    }

    public void setMnozstviProdaneMrkve(BigDecimal mnozstviProdaneMrkve) {
        this.mnozstviProdaneMrkve = mnozstviProdaneMrkve;
    }

    public String getMesto() {
        return mesto;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }

    public String getSpz() {
        return spz;
    }

    public void setSpz(String spz) {
        this.spz = spz;
    }

    public BigDecimal getSpotrebaVozidla() {
        return spotrebaVozidla;
    }

    public void setSpotrebaVozidla(BigDecimal spotrebaVozidla) {
        this.spotrebaVozidla = spotrebaVozidla;
    }

    public String getIpAdresa() {
        return ipAdresa;
    }

    public void setIpAdresa(String ipAdresa) {
        this.ipAdresa = ipAdresa;
    }
}



