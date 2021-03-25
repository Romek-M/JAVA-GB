package lessons;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords () ;
        checkSumSign () ;
        printColor() ;
        compareNumbers();

    }




    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    private static void checkSumSign() {
        int a =5, b = 4;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        }
        if (a + b < 0) {
            System.out.println("Сумма отрицательная");
        }

    }
    private static void printColor() {
        int value = 45;
        if (value <=0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    private static void compareNumbers() {
        int a = 5, b = 10;
        if (a >= b) {
            System.out.println("a >= b");
            }
        if (a < b) {
            System.out.println("a<b");
        }
    }
}
