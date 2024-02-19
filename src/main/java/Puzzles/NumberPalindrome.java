package Puzzles;

public class NumberPalindrome {


    public static void main(String[] args) {

       System.out.println(isPalindrome(-1221));

    }

    public static boolean isPalindrome(int number) {

        int reverse = 0;
        int num = number;

        while (num != 0) {
            int lastDigit = num % 10;
            reverse = (reverse * 10) + lastDigit;
            num = num / 10;
        }

        if (number == reverse) {
            return true;
        } else {
            return false;
        }
    }

//    public static boolean isPalindrome(int number) {
//
//        int reverse = 0;
//        int original = number;
//        while (original != 0) {
//            reverse = reverse * 10 + original % 10;
//            original /= 10;
//        }
//        return reverse == number;
//    }


}


