package Puzzles;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number){

        int sum = 0;

        if(number < 0){
            return -1;
        }

        while (number > 0){
            int isEven = number % 10;
            if(isEven % 2 == 0){
                sum += isEven;
            }
            number /= 10;
        }
        return sum;
    }
}

//    public static int getEvenDigitSum(int number) {
//
//        if (number < 0) {
//            return -1;
//        }
//
//        int sum = 0;
//        for (int i = number; i > 0; i /= 10) {
//            int lastDigit = i % 10;
//            if (lastDigit % 2 == 0) {
//                sum += lastDigit;
//            }
//        }

