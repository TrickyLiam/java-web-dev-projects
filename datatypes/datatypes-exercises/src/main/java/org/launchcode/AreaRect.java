package org.launchcode;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class AreaRect {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a length for the rectangle:");
        Double length = input.nextDouble();

        System.out.println("Please enter a width for the rectangle:");
        Double width = input.nextDouble();

        Double area = length * width;
        System.out.println("The area of the rectangle is " + area);
    }

}
