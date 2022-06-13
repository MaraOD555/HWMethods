public class Main {
    public static void main(String[] args) {
        findLeapYear(2022);
        correctApplication(0, 2020);
        System.out.println("Потребуется дней: " + daysForDelivery(80));
    }
        //Задание 1 Реализуйте метод, который
        // получает в качестве параметра год, а затем проверяет,
        // является ли он високосным, и выводит результат в консоль.

    private static void findLeapYear (int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " - високосный год");
        }  else {
            System.out.println(year + " - не високосный год");
        }
    }

        //Задание 2 Напишите метод, куда подаются два параметра: тип операционной системы (ОС)
        // ( 0 — iOS или 1 — Android ) и год выпуска устройства.
        //Если устройство старше текущего года, предложите ему установить lite-версию (облегченную версию).

    private static void correctApplication (int os, int yearOfRelease) {
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
        //Задание 3 расчет дней доставки банковской карты от банка
        //доработать код, а именно написать метод, который на вход принимает дистанцию
        // и возвращает итоговое количество дней доставки.

        private static int daysForDelivery (int distance) {
            int days = 0;
            if (distance < 20) {
                days = 1;
            } else if (distance >= 20 && distance < 60) {
                days = 2;
            } else if (distance >= 60 && distance < 100) {
                days = 3;
            }
            return days;
        }


}