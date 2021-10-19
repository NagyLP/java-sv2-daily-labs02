package day02;

import day01.Human;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem az egyik oldal hosszát: ");
        double aSide = scanner.nextDouble();

        System.out.println("Kérem a másik oldal hosszát: ");
        double bSide = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(aSide, bSide);

        System.out.println("A következő adatokat rögzítetem: " +rectangle.getInfo());
        System.out.println("Terület: " +rectangle.caclculateArea());
    }
}
