package Projekt;

public class Bok {
    int bokISBN;
    int bokID;
    String bokNamn;
    String författare;
    String genre;
    boolean utlånad;
    int lånad_av;

    public Bok(){

    }

    public Bok(int bokISBN, int bokID, String bokNamn, String författare, String genre, boolean utlånad, int lånad_av){
        this.bokISBN = bokISBN;
        this.bokID = bokID;
        this.bokNamn = bokNamn;
        this.författare = författare;
        this.genre = genre;
        this.utlånad = utlånad;
        this.lånad_av = lånad_av;
    }

    public int getBokISBN() {
        return bokISBN;
    }

    public void setBokISBN(int bokISBN) {
        this.bokISBN = bokISBN;
    }

    public int getBokID() {
        return bokID;
    }

    public void setBokID(int bokID) {
        this.bokID = bokID;
    }

    public String getBokNamn() {
        return bokNamn;
    }

    public void setBokNamn(String bokNamn) {
        this.bokNamn = bokNamn;
    }

    public String getFörfattare() {
        return författare;
    }

    public void setFörfattare(String författare) {
        this.författare = författare;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isUtlånad() {
        return utlånad;
    }

    public void setUtlånad(boolean utlånad) {
        this.utlånad = utlånad;
    }
}
