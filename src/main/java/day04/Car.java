package day04;

public class Car {

    public int liter;
    public int distance;

    public Car() {
        this.liter = liter;
        this.distance = distance;
    }
    public double consuption () {return (distance/100.0)*liter;}

    public int getLiter() {return liter;}
    public int getDistance() {return distance;}

    public void setLiter(int liter) {this.liter = liter;}
    public void setDistance(int distance) {this.distance = distance;}
}

