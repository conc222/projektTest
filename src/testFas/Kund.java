package Projekt;

public class Kund {
    int id;
    String fNamn;
    String eNamn;
    String titel;
    boolean ok;
    int perm_lvl;
    int nuvarande_lån;
    int försenade_lån;
    int prickar;

    public Kund(){

    }

    public Kund(int id, String fNamn, String eNamn, String titel, boolean ok, int perm_lvl, int nuvarande_lån, int försenade_lån, int prickar){
        this.id = id;
        this.fNamn = fNamn;
        this.eNamn = eNamn;
        this.titel = titel;
        this.ok = ok;
        this.perm_lvl = perm_lvl;
        this.nuvarande_lån = nuvarande_lån;
        this.försenade_lån = försenade_lån;
        this.prickar = prickar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfNamn() {
        return fNamn;
    }

    public void setfNamn(String fNamn) {
        this.fNamn = fNamn;
    }

    public String geteNamn() {
        return eNamn;
    }

    public void seteNamn(String eNamn) {
        this.eNamn = eNamn;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public int getPerm_lvl() {
        return perm_lvl;
    }

    public void setPerm_lvl(int perm_lvl) {
        this.perm_lvl = perm_lvl;
    }

    public int getNuvarande_lån() {
        return nuvarande_lån;
    }

    public void setNuvarande_lån(int nuvarande_lån) {
        this.nuvarande_lån = nuvarande_lån;
    }

    public int getFörsenade_lån() {
        return försenade_lån;
    }

    public void setFörsenade_lån(int försenade_lån) {
        this.försenade_lån = försenade_lån;
    }

    public int getPrickar() {
        return prickar;
    }

    public void setPrickar(int prickar) {
        this.prickar = prickar;
    }
}
