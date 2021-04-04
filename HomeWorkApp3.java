package lessons;

public class HomeWorkApp3<b> {
    public static void main(String[] args) {

        doOne();
       printPositiveOrNegative();
       printPositiveOrNegative1();
        doFive();
        doFour();

    }
    /**
     * Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно),
     * если да – вернуть true, в противном случае – false
     */


    static boolean doOne() {

        int a = 5;
        int b = 11;
        int sum = a + b;
        if (sum > 10 && sum < 20) {
System.out.println( sum+ "true");
            return true;
        }
        else {
System.out.println( sum+ "false");
            return false;
        }
    }

    /**
     * Написать метод, которому в качестве параметра передается целое число,
     * метод должен напечатать в консоль, положительное ли число передали или отрицательное.
     * Замечание: ноль считаем положительным числом
     */
    static void printPositiveOrNegative (){
        int i = -5;
        if (i >= 0) {
            System.out.println(i + " положительное");
        } else {
            System.out.println(i + " отрицательное");
        }

    }

    /**
     * Написать метод, которому в качестве параметра передается целое число.
     * Метод должен вернуть true, если число отрицательное,
     * и вернуть false если положительное
     */
    static void printPositiveOrNegative1 (){
        int c = 10;
        if (c >= 0) {
            System.out.println(c + " false");
        } else {
            System.out.println(c + " true");
        }

    }

/**
 * Написать метод, которому в качестве аргументов передается строка и число,
 * метод должен отпечатать в консоль указанную строку, указанное количество раз
 */
static void doFour() {
    String str = "abc";
    String repeated = str.repeat(3);
    repeated.equals("abc abc abc");
    System.out.println(repeated);
}

    /**
     * Написать метод, который определяет, является ли год високосным,
     * и возвращает boolean (високосный - true, не високосный - false).
     * Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     */

static void doFive() {
    int year = 139;
    if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0)))
        System.out.println(year + " г. не високосный");
    else System.out.println(year + " г. високосный");
}


}







