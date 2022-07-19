import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    public static void task1() {
        String clientOS;
        //boolean clientOS = true;
        System.out.print("Введите ОС Андроид - 1, IOS -0 : ");
        Scanner rew = new Scanner(System.in);
        clientOS = rew.next();
        if (clientOS.equals("1")) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS.equals("0"))
            System.out.println("Установите версию приложения для iOS по ссылке");
        System.out.println("------------------------------------------------------------------");
    }

    public static void task2() {
        var clientDeviceYear = 2011;
        var clientOS = true;
        if (clientDeviceYear >= 2015 && clientOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientDeviceYear >= 2015 && !clientOS) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && !clientOS) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        System.out.println("-------------------------------------------------------------------------");
    }

    public static void task3() {
        var year = 1963;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else System.out.println(year + " год не является високосным");
        System.out.println("----------------------------------------------------------");
    }

    public static void task4() {
        int deliveryDistance = 95;
        int day = 1;

        if (deliveryDistance > 20) {
            day++;
        }
        if (deliveryDistance > 60) {
            day++;
        }
        if (deliveryDistance > 100) {
            day++;
            System.out.println("Потребуется дней более: " + day);
        } else System.out.println("Потребуется дней: " + day);
        System.out.println("---------------------------------------------------------------");
    }

    public static void task5() {
        int monthNumber = 7;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("такого месяца не существует");
        }
        System.out.println("---------------------------------------------------------------");
    }

    public static void task6() {
        int age = 19;
        int salary = 58_000;
        if (age >= 23 && salary < 50_000) {
            salary *= 3;
        } else if (age >= 23 && salary >= 50_000 && salary < 80_000) {
            salary *= 1.2 * 3;
        } else if (age >= 23 && salary >= 80_000) {
            salary *= 1.5 * 3;
        }
        if (age < 23 && salary < 50_000) {
            salary *= 2;
        } else if (age < 23 && salary >= 50_000 && salary < 80_000) {
            salary *= 1.2 * 2;
        } else if (age < 23 && salary >= 80_000) {
            salary *= 1.5 * 2;
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary + " рублей");

    }


}
