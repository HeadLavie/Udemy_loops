package CotrolFlow;

public class Main {

    public static void main(String[] args) {

        PrintDayOfWeek print = new PrintDayOfWeek();
        print.printDayOfWeek(0);
        print.printDayOfWeek(1);
        print.printDayOfWeek(6);
        print.printDayOfWeek(7);

        NumberInWord number = new NumberInWord();
        System.out.println(NumberInWord.printNumberInWord(4));

        char letter = 'A';

        switch (letter) {

            case 'A'-> System.out.println("Able");
            case 'B' -> System.out.println("Brian");
            case 'C' -> System.out.println("Charlie");
            case 'D' -> System.out.println("Dog");
            case 'E' -> System.out.println("Easy");
            default -> {
                System.out.println("not found");
            }
        }

    }
}
