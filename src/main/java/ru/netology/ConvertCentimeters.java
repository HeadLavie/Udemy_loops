package ru.netology;

public class ConvertCentimeters {

    public static double convertToCentimeters(int inches) {

        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {
     double centimeters = feet * 12 + inches;
     return convertToCentimeters((int) centimeters);

     // return convertToCentimeters((feet * 12) + inches);
    }

}
