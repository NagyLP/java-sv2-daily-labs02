package day05;

public class Movie {

    private String cim;
    private int gyartEv;

    private double atlagosErtekeles;
    private int ertekelesMennyiseg;
    private int ertekelesOsszege;

    public Movie(String cim, int gyartEv) {
        this.cim = cim;
        this.gyartEv = gyartEv;
    }

    public double rateMovie(int rating) {
        ertekelesMennyiseg += rating;
        ertekelesOsszege++;

        atlagosErtekeles=(ertekelesMennyiseg*1.0)/ertekelesOsszege;

        return atlagosErtekeles;
    }

    public void setCim(String cim) {this.cim = cim;}
    public void setGyartEv(int gyartEv) {this.gyartEv = gyartEv;}

    public double getAtlagosErtekeles() {
        return atlagosErtekeles;
    }
}


