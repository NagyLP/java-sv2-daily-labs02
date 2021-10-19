package day02;

public class Rectangle {

    private double aSide;
    private double bSide;

    public Rectangle (double aSide, double bSide) {
        this.aSide = aSide;
        this.bSide = bSide;
    }

    public double getaSide() {return aSide;}
    public double getbSide() {return bSide;}

    public void setaSide(double distance) {this.aSide = distance;}
    public void setbSide(double distance) {this.bSide = distance;}

    public String getInfo() {return "Egyik oldal: " +aSide+ " ; " +" Másik oldal: " +bSide;}

    public String caclculateArea() {return "Terület = Egyik oldal: " +aSide+ " * " +" Másik oldal: " +bSide+ " = " +aSide*bSide;}


}
