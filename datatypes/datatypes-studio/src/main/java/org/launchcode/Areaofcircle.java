package main.java.org.launchcode;

import java.util.Scanner;

public class Areaofcircle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double radius = input.nextDouble();
        double result = area(radius);
        System.out.println(result);
    }
    public static double area(double num){
        return  3.14 * num * num;
    };

}
