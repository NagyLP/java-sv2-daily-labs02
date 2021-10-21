package day04;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        GassStation gassStation = new GassStation(500);

        System.out.println("Ára: " +gassStation.tankCar(car, 30));
            car.setDistance(656);
        System.out.println("A fogyasztás: " +car.consuption());
    }
}
