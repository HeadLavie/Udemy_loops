package Loops;

public class IsEvenNumber {

    public static void main(String[] args) {

        int j = 5;
        int totalEven = 0;
        int totalOdd = 0;

        while (j <= 20) {
            if (!(isEvenNumber(j))) {
                j++;
                totalOdd++;
                continue;
            }
            System.out.println(j);
            j++;
            totalEven++;

            if(totalEven == 5){
                System.out.println(totalEven);
                System.out.println(totalOdd);
                break;
            }
        }
    }

    public static boolean isEvenNumber(int number) {

        return (number % 2) == 0;
    }
}
