package Lesson2;

import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {

//      Основное задание 1. Создаем и заполняем значениями бинарный массив, после чего инвертируем его
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("                            ОСНОВНОЕ ЗАДАНИЕ 1");
        System.out.println("----------------------------------------------------------------------------");
        int[] anArray = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        System.out.println("Исходный массив:       " + Arrays.toString(anArray));
        for (int i = 0; i < anArray.length; i++)
            anArray[i]=Math.abs(anArray[i]-1);
        System.out.println("Инвертированный массив:" + Arrays.toString(anArray));

//      Основное задание 2. Создаем массив из 8 элементов и заполняем его значениями по формуле index*3
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("                            ОСНОВНОЕ ЗАДАНИЕ 2");
        System.out.println("----------------------------------------------------------------------------");
        int[] ar8 = new int[8];
        for (int i = 0; i < 8; i++)
            ar8[i]=i*3;
        System.out.println("Значения массива (индекс*3):" + Arrays.toString(ar8));

//      Основное задание 3. Создаем предзаполненный масив и умножам на 2 элементы со значениями меньше 6
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("                            ОСНОВНОЕ ЗАДАНИЕ 3");
        System.out.println("----------------------------------------------------------------------------");
        int[] arDouble = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println("Исходный массив:             " + Arrays.toString(arDouble));
        for (int i = 0; i < arDouble.length; i++)
            if (arDouble[i]<6) arDouble[i]*=2;
        System.out.println("Все значения менее 6 удвоены:" + Arrays.toString(arDouble));

//      Основное задание 4. Создаем квадратную матрицу и по диагоналям заполняем единицами
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("                            ОСНОВНОЕ ЗАДАНИЕ 4");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Матрица с диагоналями, заполненными \"1\"");
        int[][] matrix = new int[6][6];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
            matrix[i][matrix.length - i - 1] = 1;
            System.out.println(Arrays.toString(matrix[i]));
        }

//      Основное задание 5. Создаем массив и определеяем его экстремумы (минимальное и максимальное значения)
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("                            ОСНОВНОЕ ЗАДАНИЕ 5");
        System.out.println("----------------------------------------------------------------------------");
        int[] arMinMax = new int[10];
        for (int i = 0; i < arMinMax.length; i++)
            arMinMax[i] = (int) (Math.random() * 100);
        int min = arMinMax[0], max = arMinMax[0];
        System.out.print("Сформирован массив значений: " + Arrays.toString(arMinMax));
        for (int i: arMinMax){  // сохранять текущий индекс не нужно, поэтому используем "for each"
            if (i<min) min = i; // хотя при испозовании массива можно было бы начать со второго элемента,
            if (i>max) max = i; // ак как первый элемент служит инициализатором минимального и максимального значений
        }
        System.out.print("  Минмальное значение=" + min);
        System.out.println("  Максимальное значение="+ max);

//      Основное задание 6. Поиск баланса массива
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("                            ОСНОВНОЕ ЗАДАНИЕ 6");
        System.out.println("----------------------------------------------------------------------------");
        int [] balArray = new int[20];
        for (int i = 0; i < 20; i++) balArray [i] = (int) (Math.random() * 100);
        System.out.print("В массиве "+ Arrays.toString(balArray));
        if (checkBalance(balArray)) System.out.print(" есть точка баланса!");
        else System.out.print(" точки баланса нет.");
        System.out.println();

//      Основное задание 7. Сдвиг массива на +/- n элементов
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("                            ОСНОВНОЕ ЗАДАНИЕ 7");
        System.out.println("----------------------------------------------------------------------------");
        shiftArray(balArray,(int) (Math.random() * 6) - 3);

//      ДОПОЛНИТЕЛЬНЫЕ ЗАДАНИЯ
//      1.4.3. Расчет евклидова расстояния между двумя векторами
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("Дополнительное задание 1.4.3");
        float[] v1 = {4F, 9F, 5F};
        float[] v2 = {5F, 9F, 9F};
        float sum = 0;
        for (int i = 0; i < 3; i++)
            sum += Math.pow(v1[i] - v2[i], 2);
        sum = (float) Math.sqrt(sum);
        System.out.println("Евклидово расстояние между векторами " + Arrays.toString(v1) + " и " + Arrays.toString(v2) + " равно " + sum);

//      1.4.4. Перестановка элементов массива в обратном порядке
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("Дополнительное задание 1.4.4");
        int[] ar1 = {1, 14, 3, 22, 69, 34, 73, 12, 5, 99, 0, 0, 146, 5, 7};
        System.out.println("Исходный массив:           " + Arrays.toString(ar1));
        int start = ar1.length / 2 - 1; // находим середину массива с учетом стартового индекса 0, а не 1
        int temp;
        for (int i = start; i >= 0; i--) {
            temp = ar1[i];
            ar1[i] = ar1[ar1.length - i - 1];
            ar1[ar1.length - i - 1] = temp;
        }
        System.out.println("Массив в обратном порядке: " + Arrays.toString(ar1));

//      В задании 1.4.5 некорректно объявлен массив - он не создается динамически и не заполняется статичными значениями

//      1.4.6. Вывод на консоль двумерного массива логических значений, где * обозначает true, а " " - false
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("Дополнительное задание 1.4.6");
        boolean[][] map = {{true, true, false, true, false}, {false, true, false, false, false}, {true, true, true, true, true},
                {true, false, true, false, true}, {true, true, true, true, true}};
        System.out.println("Индексы:  ");
        for (int i = 0; i < map.length; i++) {
            System.out.print("Строка " + i + ": ");
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] ? "*" : " ");
            }
            System.out.println();
        }

//      В задании 1.4.7 на экран будет выведено "0123443210". Проверил. Так и есть.

//      В задании 1.4.8 в массиве будут значения [1,1,2,3,5,8,13,21,34,55]

//      В задании 1.4.9 результатом будет "false", так как указатели на массивы имеют разные значения

//      1.4.10 N покерных раздач
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("Дополнительное задание 1.4.10");
        int n;
        if (args.length>0)
            n = Integer.parseInt(args[0]);
        else
            n=0;
        String[][] cards = {{"¦2", "¦3", "¦4", "¦5", "¦6", "¦7", "¦8", "¦9", "¦10", "¦J", "¦Q", "¦K", "¦A"},
                {"¦2", "¦3", "¦4", "¦5", "¦6", "¦7", "¦8", "¦9", "¦10", "¦J", "¦Q", "¦K", "¦A"},
                {"¦2", "¦3", "¦4", "¦5", "¦6", "¦7", "¦8", "¦9", "¦10", "¦J", "¦Q", "¦K", "¦A"},
                {"¦2", "¦3", "¦4", "¦5", "¦6", "¦7", "¦8", "¦9", "¦10", "¦J", "¦Q", "¦K", "¦A"}};
        int[][] cardsOut = new int[4][13];
        int type, card;
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                do {
                    type = (int) (Math.random() * 4);
                    card = (int) (Math.random() * 13);
                } while (cardsOut[type][card] == 1);
                cardsOut[type][card] = 1;
                System.out.print(cards[type][card]+" ");
            }
            System.out.println();
        }

//      1.4.11 Программа HowMany, выводящая количество полученных параметров командной строки
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("Дополнительное задание 1.4.11");
        System.out.println("Количество полученных параметров: " + args.length);

//      1.4.12 Вывод целого числа i с вероятностью, пропорциональной значению i-го аргумента
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("Дополнительное задание 1.4.12");
        int params = args.length;
        int sumArg = 0;
          float chance=0F;
        for (int i = 0; i < params; i++)
            sumArg += Integer.parseInt(args[i]);
        for (int i = 0; i < params; i++) {
            chance = (float) ((Integer.parseInt(args[i])) / (sumArg));
            System.out.println("Вероятность вывода " + i + "-го аргумента = " +chance*100 + "%" );
            if (Math.random() < chance )  System.out.println("Сработало! Вот его порядковый номер: " + i);
        }

//      1.4.13 Копирование массива a[][] в b[][]
//             Вариант 1 - исходный массив квадратный
        int aSquare[][] = {{1,4,15},{9,6,1},{17,42,4}};
        int size = aSquare.length;
        int bSquare[][] = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) bSquare[i][j] = aSquare[i][j];
        }
//             Вариант 2 - исходный массив прямоугольный
        int aRect[][] = {{1,4,15,60,5},{9,6,1,22,9},{17,42,4,94,66}};
        int sizeX = aRect.length;
        int sizeY = aRect[0].length;
        int bRect[][] = new int[sizeX][sizeY];
        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) bRect[i][j] = aRect[i][j];
        }
//             Вариант 3 - исходный массив разной размерности
        int aStripes[][] = {{1,4,15,60,5},{9,6,1},{17,42,4,94}};
        sizeX = aStripes.length;
        int bStripes[][] = new int[sizeX][];
        for (int i = 0; i < sizeX; i++) {
            sizeY = aStripes[i].length;
            bStripes[i] = new int [sizeY];
            for (int j = 0; j < sizeY; j++) bStripes[i][j] = aStripes[i][j];
        }
    }

//  6. Метод, проверяющий массив на наличие "баланса", относительно которого суммы сторон равны
    public static boolean checkBalance(int[] ar){
        if (ar.length < 2) return false;  // данных для нахождения баланса слишком мало
        int leftSide, rightSide;
        for (int i = 0; i < (ar.length - 1); i++) { // передвигать маркер на последний элемент массива не имеет смысла
            // в каждой итерации обнуляем суммы сторон
            leftSide = 0;
            rightSide = 0;

            // Используем i как маркер последнего элемента левой суммируемой части массива
            for (int j = 0; j < ar.length; j++)
               if (j<=i) leftSide += ar[j];    //  Пробегаем по всему массиву, и то, что левее маркера складываем в leftSide,
               else rightSide += ar[j];        //  а то, что правее - в rightSide
            if (leftSide == rightSide) return true;  // если стороны массива равны, возвращаем TRUE
        }
        return false;
    }

//  7. Метод, "вращающий" значения массива "ar" вперед или назад на полученное количество шагов "n"
    public static void shiftArray(int[] ar, int n){
        if (n==0) return; // ничего двигать не нужно
        int destination, temp=0, step = n / Math.abs(n);  // сдвигаем массив на каждом шагу либо на +1, либо на -1 позицию
        System.out.println("Исходный массив:               " + Arrays.toString(ar));
        for (int j = 0; j < Math.abs(n); j++) {
            for (int i = 0; i < (ar.length-1); i++) {
                if (step<0) destination = i-1;
                else destination = ar.length-i;

                if (destination == ar.length) { // Если массив сдвигается вперед и достигнут его конец
                    destination = 0;
                    temp = ar[destination];
                }
                if (destination < 0) { // Если массив сдвигается назад и достигнуто его начало
                    destination = ar.length-1;
                    temp = ar[destination];
                }
                if (step<0) ar[destination] = ar [i];
                else ar[destination] = ar[ar.length-1-i];
            }
            if (step<0) ar[ar.length - 2]=temp;
            else ar[1] = temp;
        }
        System.out.println("Массив, сдвинутый на " + n + " шагов: " + Arrays.toString(ar));
    }
}