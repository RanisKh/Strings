public class Main {
    public static int printYear(int a) {
        int c = a % 4;
        return c;
    }

    public static int printYear1(int a) {
        int n = a % 100;
        return n;
    }

    public static int printYear2(int a) {
        int r = a % 400;
        return r;
    }

    public static void printClientOSAndroid() {
        System.out.println("Установите версию приложения для Android по ссылке");
    }

    public static void printClientOSAndroid1() {
        System.out.println("Установите облегченную версию приложения для Android по ссылке");
    }

    public static void printClientOSIOS() {
        System.out.println("Установите версию приложения для iOS по ссылке");
    }

    public static void printClientOSIOS1() {
        System.out.println("Установите облегченную версию приложения для iOS по ссылке");
    }

    public static void printDeliveryDays() {
        System.out.println("Потребуется дней: " + 1);
    }
    public static void printDeliveryDays1(){
        System.out.println("Потребуется дней: " + 2);
    }
    public static void printDeliveryDays2(){
        System.out.println("Потребуется дней: " + 3);
    }
    public static void printDeliveryDays3(){
        System.out.println("Извините, на данное расстояние нет доставки.");
    }

    public static void main(String[] args) {
        System.out.println("1 task");
        int year = 2001;
        if (printYear(year) % 4 == 0 && printYear1(year) != 0 || printYear2(year) == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println("2 task");
        int clientOSYear = 1;
        int clientDeviceYear = 2018;
        if (clientOSYear == 1 && clientDeviceYear >= 2015) {
            printClientOSAndroid();
        } else if (clientOSYear == 1 && clientDeviceYear < 2015) {
            printClientOSAndroid1();
        }
        if (clientOSYear == 0 && clientDeviceYear >= 2015) {
            printClientOSIOS();
        } else if (clientOSYear == 0 && clientDeviceYear < 2015) {
            printClientOSIOS1();
        }
        System.out.println("3 task");
        int deliveryDistance = 95;
        if (deliveryDistance <= 19) {
            printDeliveryDays();
        }
        if (deliveryDistance >= 20 && deliveryDistance <= 59) {
            printDeliveryDays1();
        }
        if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            printDeliveryDays2();
        } else {
            printDeliveryDays3();
        }
    }
}