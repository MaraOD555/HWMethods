public class Main {
    public static void main(String[] args) {
        exercise1(2022);
        exercise2(0, 2020);

    }
        //Задание 1 Реализуйте метод, который
        // получает в качестве параметра год, а затем проверяет,
        // является ли он високосным, и выводит результат в консоль.

    public static void exercise1 (int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " - високосный год");
        }  else {
            System.out.println(year + " - не високосный год");
        }
    }

        //Задание 2 Напишите метод, куда подаются два параметра: тип операционной системы (ОС)
        // ( 0 — iOS или 1 — Android ) и год выпуска устройства.
        //Если устройство старше текущего года, предложите ему установить lite-версию (облегченную версию).

    public static void exercise2 (int os, int yearOfRelease) {
        int currentYear = 2022;

        if (os == 0 && yearOfRelease < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (os == 1 && yearOfRelease < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (os == 0 && yearOfRelease >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (os == 1 && yearOfRelease >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

}