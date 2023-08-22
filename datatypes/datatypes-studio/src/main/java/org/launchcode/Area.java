package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius of a circle: ");
        double radius = input.nextDouble();

        do {
            if (radius < 0) {
                System.out.println("Please enter a postive number only");
            }
        } while (radius < 0);
        
        double area = Circle.getArea(radius);
//        double area = 3.14 * radius * radius;
        System.out.println("The area of this circle is " + area);
        input.close();

    }
}
