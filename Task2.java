package com.itacademy;
import java.util.Scanner;

/*Написать программу, вычисляющую корни квадратного уравнения
вида ax ² + bx + c = 0, где a, b и c - вводимые пользователем из консоли
данные.
    Учитывать только реальные корни (в случае отрицательного
дискриминанта выводить сообщение пользователю).
    При решении создать и использовать следующие вынесенные
функции:
    - функция isPositive, определяющая, является ли число
положительным
    - функция isZero, определяющая, является ли число нулём
    - функция discriminant, вычисляющая дискриминант*/

public class Task2 {
    private static long discriminant (int a, int b, int c) {
        return (b*b-4*a*c);
    }
    private static boolean isPositive(long y) {
        return (y>0);
    }

    private static boolean isZero(long t) {
        return (t==0);
    }

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a:");
        int a = scanner.nextInt();
        System.out.println("Введите b:");
        int b = scanner.nextInt();
        System.out.println("Введите c:");
        int c = scanner.nextInt();

        System.out.println("ax ² + bx + c = 0");

        long d = discriminant (a,b,c);

        if (!isPositive(d)) {
            System.out.println("Нет корней, т.к дискриминант отрицательный");
        }
        else {
            double root1 = (b*(-1)+Math.sqrt(d))/(2*a);
            double root2 = (b*(-1)-Math.sqrt(d))/(2*a);
            System.out.println("х1=:"+root1);
            System.out.println("х2=:"+root2);
        }

        if (isZero(d)) {
            double root1 = (b*(-1)+Math.sqrt(d))/(2*a);
            System.out.println("Уравнение имеет один корень, т.к. дискриминант равен нулю:");
            System.out.println("х1=:"+root1);
        }
    }
}


