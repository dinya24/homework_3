package ru.geekbrains.lesson3;


import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int receivedNum;
        String warnMin = "Число меньше загаданного";
        String warnMax = "Число больше загаданного";
        int start = 1;
        while (start == 1) {
            int generateNum = random.nextInt(10);
            System.out.print("Введите число от 0 до 9: ");
            int whiles = 0;
            do {
                while (!sc.hasNextInt()) {
                    System.out.println("Вы ввели не число. Введите число от 0 до 9:");
                    sc.next();
                }
                receivedNum = sc.nextInt();

                if (receivedNum < generateNum) {
                    System.out.println(warnMax);
                }
                if (receivedNum > generateNum) {
                    System.out.println(warnMin);
                }
                if (receivedNum == generateNum) {
                    System.out.println("Молодец! Ты угадал!");
                    break;
                }
                whiles++;
            } while (whiles < 3);

            System.out.println("Ответ системы: " + generateNum);
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            while (!sc.hasNextInt()) {
                System.out.println("Вы ввели не число. Повторить игру еще раз? 1 – да / 0 – нет");
                sc.next();
            }
            String yesno = sc.next();

            if (Objects.equals(yesno, "1")) {
                start = 1;
            } else {
                start = 0;
            }

        }
    }
}
