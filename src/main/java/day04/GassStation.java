package day04;

public class GassStation {

    private int price;

    public GassStation (int price) {
        this.price = price;
    }

// Objektumot hív meg.

    public int tankCar(Car car, int liter) {
        car.setLiter(liter);
        return liter*price;
    }
}
