package ru.netology;

public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {

        if (summer) {
            if (temperature >= 25 && temperature <= 45) {
                return true;
            }
        }
        if (temperature >= 25 && temperature <= 35) {
            return true;
        }
        else return false;
    }

    // ALTERNATIVE SOLUTION
    public class PlayingCat2 {

        public boolean isCatPlaying(boolean summer, int temperature) {

            int max = summer ? 45 : 35;
            return temperature >= 25 && temperature <= max;
        }
    }
}
