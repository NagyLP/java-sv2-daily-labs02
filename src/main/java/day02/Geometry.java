package day02;

import day01.Human;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem az egyik oldal hosszát: ");
        String aSide = scanner.nextLine();

        System.out.println("Kérem az életkort: ");
        int age = scanner.nextInt();

        Rectangle rectangle = new Rectangle(1.5, 2.6 );

        System.out.println("A következő adatokat rögzítetem: " +rectangle.getInfo());
        System.out.println("Terület: " +rectangle.caclculateArea());
    }
}
