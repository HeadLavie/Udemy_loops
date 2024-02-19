package ru.netology;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {

        int scaledA = (int) (a * 1000);
        int scaledB = (int) (b * 1000);

        return scaledB == scaledA;
    }
}