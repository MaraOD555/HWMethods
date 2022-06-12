public class Main {
    public static void main(String[] args) {
        exercise1(2022);

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

}