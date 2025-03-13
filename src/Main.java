public class Main {
    public static void main(String[] args) {


        System.out.println("1 task");
        printYear(2025);
        printYear(2015);
        printYear(2020);
        printYear(1587);
        System.out.println(" 2 task");
        printOS(2020, 1);
        printOS(2014, 1);
        printOS(2014, 0);
        printOS(2020, 0);
        System.out.println(" 3 task");
        delivery(5);
        delivery(25);
        delivery(85);
        delivery(105);
    }

    public static void printYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год  не является високосным");
        }
    }

    public static void printOS(int year, int operation) {
        String system = (operation == 0) ? "IOS" : "Android";
        int currentYear = 2015;
        if (year > currentYear) {
            System.out.println("Установите версию приложения для " + system + " по ссылке");
        }
        if (year < currentYear) {
            System.out.println("Установите облегченную версию приложения для " + system + " по ссылке");
        }
    }

    public static void delivery(int distance) {
        if (distance <= 19) {
            System.out.println("Доставка займет 1 день");
        } else if (distance > 19 && distance <= 59) {
            System.out.println("Доставка займет 2 деня");
        } else if (distance > 60 && distance < 100) {
            System.out.println("Доставка займет 3 деня");
        } else {
            System.out.println("Доставки нет");
        }

    }
}