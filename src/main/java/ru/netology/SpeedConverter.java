package ru.netology;

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            return Math.round(kilometersPerHour/1.609);
        }
    }

    public static void printConversion(double kilometersPerHour) {
        double milesPerHour = toMilesPerHour(kilometersPerHour);
        if (milesPerHour == -1){
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h " + "= " + (int)milesPerHour + " mi/h");
        }
    }
}
