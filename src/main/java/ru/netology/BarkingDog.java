package ru.netology;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if (!barking) {
            return false;
        } else if ((hourOfDay >= 0 && hourOfDay < 8) || (hourOfDay > 22 && hourOfDay <= 23)) {
            return true;
        } else {
            return false;
        }
    }

        public static boolean shouldWakeUp2(boolean barking, int hourOfDay) {

            if (hourOfDay < 0 || hourOfDay > 23) {
                return false;
            }
            return barking && (hourOfDay < 8 || hourOfDay > 22);
        }
}
