package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    private static int requestedNumber;
    private static int attemptsLeft;
    private static int answer;

    private static boolean correctAnswer = false;
    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//    1. Ппрограмма, загадывает число от 0 до 9, и дает 3 попытки угадать это число.
//    При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
//    После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

        do {
            playRound();
            System.out.print("Ну что, сыгрем ещё разик? (1 - да / 0 - нет) >");
        } while (scanner.nextInt() == 1);
    }

    public static void playRound(){
        requestedNumber = random.nextInt(10);
        System.out.println("-------------------------------------------------");
        System.out.println("Я загадал число от 0 до 9.");
        System.out.println("У тебя ровно 3 попытки на то, чтобы его угадать.");
        System.out.println("После каждого ответа я буду немного подсказывать.");
        System.out.print("Итак, первая попытка. Что это за число? >");
        attemptsLeft = 3;
        do {
            answer = scanner.nextInt();
            attemptsLeft --;
            if (answer != requestedNumber) {
                System.out.print("НЕВЕРНО! Загаданное мной число ");
                if (answer < requestedNumber)
                    System.out.println("больше твоего!");
                else
                    System.out.println("меньше твоего!");
                if (attemptsLeft == 0)
                    System.out.println("Извини, твои попытки закончились! ((  Правильным ответом было \"" + requestedNumber + "\"");
                else
                    System.out.print("У тебя ещё "+attemptsLeft+ " попыт" + (attemptsLeft==2?"ки. >":"ка. >"));
            }
            else
                System.out.println("Молодец! Угадал!!!");
        } while (answer != requestedNumber && attemptsLeft >0 );
    }
}
