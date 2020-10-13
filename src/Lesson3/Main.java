package Lesson3;

import sun.security.krb5.internal.crypto.RsaMd5CksumType;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        1 Задание
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        do {
            int randomNumber = random.nextInt(10);
            for (int i = 2; i >= 0; i--) {
                int userNumber = getNumberFromScanner("Введите число от 0 до 9",0,9);
                if (userNumber == randomNumber) {
                    System.out.println("Вы угадали");
                    break;
                } else if (userNumber > randomNumber) {
                    System.out.println("Загаданное число меньше, осталось попыток: " + i);
                } else if (userNumber < randomNumber) {
                    System.out.println("Загаданное число больше, осталось попыток: " + i);
                }

            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        } while (scanner.nextInt()==1);
    }

    public static int getNumberFromScanner(String message, int min, int max) {
        int x;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(message);
            x = sc.nextInt();
        } while (x < min || x > max);
        return x;

    }
}


