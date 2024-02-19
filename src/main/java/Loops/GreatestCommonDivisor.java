package Loops;

public class GreatestCommonDivisor {

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(12, 30));
    }

    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }

        int smalest = 0;

        if (first - second > 0) {
            smalest = second;
        } else {
            smalest = first;
        }

        int commonDivisor = 0;

        for (int i = 1; i < smalest; i++) {
            if ((first % i == 0) && (second % i == 0)) {
                commonDivisor = i;
            }
        }
        return commonDivisor;
    }
}

//    public static int getGreatestCommonDivisor(int first, int second) {
//
//        if (first < 10 || second < 10) {
//            return -1;
//        }
//
//        int min = first < second ? first : second;
//        int gcd = 1;
//        for (int j = 1; j <= min; j++) {
//            if (first % j == 0 && second % j == 0) {
//                gcd = j;
//            }
//        }
//        return gcd;
//    }
//}