package com.itacademy;
import java.util.Scanner;
/*Имеются три числа - день, месяц и год, вводимые пользователем с
консоли.
   Вывести дату следующего дня в формате "День.Месяц.Год".
   Учесть переход на следующий месяц, а также следующий год.
   Форматирование строки " День.Месяц.Год" вынести в отдельную
функцию.*/
public class HW3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день:");
        int day = scanner.nextInt();
        System.out.println("Введите месяц:");
        int month = scanner.nextInt();
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        int maxdays30 = 30;
        if ((month == 4 || month == 6 || month == 9 || month == 11) && day < maxdays30) {
            day++;
            System.out.println("Cледующий день:" + date(day, month, year));
        } else if ((month == 4 || month == 6 || month == 9 || month == 11) && day == maxdays30) {
            month++;
            day = 1;
            System.out.println("Cледующий день:" + date(day, month, year));}

        int maxdays31=31;
        if ((month == 1|| month == 3|| month == 5|| month == 7|| month ==8|| month ==12)&& day<maxdays31){
                day++;
                System.out.println("Cледующий день:" + date(day, month, year));}
        else if ((month == 1|| month == 3|| month == 5|| month == 7|| month ==8)&&day == maxdays31) {
            month++;
            day = 1;
            System.out.println("Cледующий день:" + date(day, month, year));}
        else if (month==12 && day==maxdays31){
            day = 1;
            month = 1;
            year++;
            System.out.println("Cледующий день:" + date(day, month, year));
        }

        int maxdays28=28;
        boolean isLeapYear = ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0));
        if (isLeapYear) {maxdays28=29;}
        if (month==2 && day<maxdays28) {
            day++;
            System.out.println("Cледующий день:" + date(day, month, year));}
        else if (day == maxdays28) {
            month++;
            day = 1;
            System.out.println("Cледующий день:" + date(day, month, year));}

        if (month>=13||month<1||year<0||day>31 ||
                ((month == 1|| month == 3|| month == 5|| month == 7|| month ==8|| month ==12)&& day>maxdays31) ||
                ((month == 4 || month == 6 || month == 9 || month == 11) && day >maxdays30)||
                (month==2 && day>maxdays28)){
            System.out.println ("Такой даты не существует");
        }

}

    private static String date(int day, int month, int year) {
        String date = day + "." + month + "." + year;
        return date;
    }
}

        


