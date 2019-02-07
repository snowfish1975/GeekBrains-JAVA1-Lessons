package Lesson2;

import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {

//      �������� ������� 1. ������� � ��������� ���������� �������� ������, ����� ���� ����������� ���
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("                            �������� ������� 1");
        System.out.println("----------------------------------------------------------------------------");
        int[] anArray = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        System.out.println("�������� ������:       " + Arrays.toString(anArray));
        for (int i = 0; i < anArray.length; i++)
            anArray[i]=Math.abs(anArray[i]-1);
        System.out.println("��������������� ������:" + Arrays.toString(anArray));

//      �������� ������� 2. ������� ������ �� 8 ��������� � ��������� ��� ���������� �� ������� index*3
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("                            �������� ������� 2");
        System.out.println("----------------------------------------------------------------------------");
        int[] ar8 = new int[8];
        for (int i = 0; i < 8; i++)
            ar8[i]=i*3;
        System.out.println("�������� ������� (������*3):" + Arrays.toString(ar8));

//      �������� ������� 3. ������� ��������������� ����� � ������� �� 2 �������� �� ���������� ������ 6
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("                            �������� ������� 3");
        System.out.println("----------------------------------------------------------------------------");
        int[] arDouble = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println("�������� ������:             " + Arrays.toString(arDouble));
        for (int i = 0; i < arDouble.length; i++)
            if (arDouble[i]<6) arDouble[i]*=2;
        System.out.println("��� �������� ����� 6 �������:" + Arrays.toString(arDouble));

//      �������� ������� 4. ������� ���������� ������� � �� ���������� ��������� ���������
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("                            �������� ������� 4");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("������� � �����������, ������������ \"1\"");
        int[][] matrix = new int[6][6];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
            matrix[i][matrix.length - i - 1] = 1;
            System.out.println(Arrays.toString(matrix[i]));
        }

//      �������� ������� 5. ������� ������ � ����������� ��� ���������� (����������� � ������������ ��������)
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("                            �������� ������� 5");
        System.out.println("----------------------------------------------------------------------------");
        int[] arMinMax = new int[10];
        for (int i = 0; i < arMinMax.length; i++)
            arMinMax[i] = (int) (Math.random() * 100);
        int min = arMinMax[0], max = arMinMax[0];
        System.out.print("����������� ������ ��������: " + Arrays.toString(arMinMax));
        for (int i: arMinMax){  // ��������� ������� ������ �� �����, ������� ���������� "for each"
            if (i<min) min = i; // ���� ��� ����������� ������� ����� ���� �� ������ �� ������� ��������,
            if (i>max) max = i; // �� ��� ������ ������� ������ ��������������� ������������ � ������������� ��������
        }
        System.out.print("  ���������� ��������=" + min);
        System.out.println("  ������������ ��������="+ max);

//      �������� ������� 6. ����� ������� �������
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("                            �������� ������� 6");
        System.out.println("----------------------------------------------------------------------------");
        int [] balArray = new int[20];
        for (int i = 0; i < 20; i++) balArray [i] = (int) (Math.random() * 100);
        System.out.print("� ������� "+ Arrays.toString(balArray));
        if (checkBalance(balArray)) System.out.print(" ���� ����� �������!");
        else System.out.print(" ����� ������� ���.");
        System.out.println();

//      �������� ������� 7. ����� ������� �� +/- n ���������
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("                            �������� ������� 7");
        System.out.println("----------------------------------------------------------------------------");
        shiftArray(balArray,(int) (Math.random() * 6) - 3);

//      �������������� �������
//      1.4.3. ������ ��������� ���������� ����� ����� ���������
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("�������������� ������� 1.4.3");
        float[] v1 = {4F, 9F, 5F};
        float[] v2 = {5F, 9F, 9F};
        float sum = 0;
        for (int i = 0; i < 3; i++)
            sum += Math.pow(v1[i] - v2[i], 2);
        sum = (float) Math.sqrt(sum);
        System.out.println("��������� ���������� ����� ��������� " + Arrays.toString(v1) + " � " + Arrays.toString(v2) + " ����� " + sum);

//      1.4.4. ������������ ��������� ������� � �������� �������
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("�������������� ������� 1.4.4");
        int[] ar1 = {1, 14, 3, 22, 69, 34, 73, 12, 5, 99, 0, 0, 146, 5, 7};
        System.out.println("�������� ������:           " + Arrays.toString(ar1));
        int start = ar1.length / 2 - 1; // ������� �������� ������� � ������ ���������� ������� 0, � �� 1
        int temp;
        for (int i = start; i >= 0; i--) {
            temp = ar1[i];
            ar1[i] = ar1[ar1.length - i - 1];
            ar1[ar1.length - i - 1] = temp;
        }
        System.out.println("������ � �������� �������: " + Arrays.toString(ar1));

//      � ������� 1.4.5 ����������� �������� ������ - �� �� ��������� ����������� � �� ����������� ���������� ����������

//      1.4.6. ����� �� ������� ���������� ������� ���������� ��������, ��� * ���������� true, � " " - false
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("�������������� ������� 1.4.6");
        boolean[][] map = {{true, true, false, true, false}, {false, true, false, false, false}, {true, true, true, true, true},
                {true, false, true, false, true}, {true, true, true, true, true}};
        System.out.println("�������:  ");
        for (int i = 0; i < map.length; i++) {
            System.out.print("������ " + i + ": ");
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] ? "*" : " ");
            }
            System.out.println();
        }

//      � ������� 1.4.7 �� ����� ����� �������� "0123443210". ��������. ��� � ����.

//      � ������� 1.4.8 � ������� ����� �������� [1,1,2,3,5,8,13,21,34,55]

//      � ������� 1.4.9 ����������� ����� "false", ��� ��� ��������� �� ������� ����� ������ ��������

//      1.4.10 N �������� ������
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("�������������� ������� 1.4.10");
        int n;
        if (args.length>0)
            n = Integer.parseInt(args[0]);
        else
            n=0;
        String[][] cards = {{"�2", "�3", "�4", "�5", "�6", "�7", "�8", "�9", "�10", "�J", "�Q", "�K", "�A"},
                {"�2", "�3", "�4", "�5", "�6", "�7", "�8", "�9", "�10", "�J", "�Q", "�K", "�A"},
                {"�2", "�3", "�4", "�5", "�6", "�7", "�8", "�9", "�10", "�J", "�Q", "�K", "�A"},
                {"�2", "�3", "�4", "�5", "�6", "�7", "�8", "�9", "�10", "�J", "�Q", "�K", "�A"}};
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

//      1.4.11 ��������� HowMany, ��������� ���������� ���������� ���������� ��������� ������
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("�������������� ������� 1.4.11");
        System.out.println("���������� ���������� ����������: " + args.length);

//      1.4.12 ����� ������ ����� i � ������������, ���������������� �������� i-�� ���������
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("�������������� ������� 1.4.12");
        int params = args.length;
        int sumArg = 0;
          float chance=0F;
        for (int i = 0; i < params; i++)
            sumArg += Integer.parseInt(args[i]);
        for (int i = 0; i < params; i++) {
            chance = (float) ((Integer.parseInt(args[i])) / (sumArg));
            System.out.println("����������� ������ " + i + "-�� ��������� = " +chance*100 + "%" );
            if (Math.random() < chance )  System.out.println("���������! ��� ��� ���������� �����: " + i);
        }

//      1.4.13 ����������� ������� a[][] � b[][]
//             ������� 1 - �������� ������ ����������
        int aSquare[][] = {{1,4,15},{9,6,1},{17,42,4}};
        int size = aSquare.length;
        int bSquare[][] = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) bSquare[i][j] = aSquare[i][j];
        }
//             ������� 2 - �������� ������ �������������
        int aRect[][] = {{1,4,15,60,5},{9,6,1,22,9},{17,42,4,94,66}};
        int sizeX = aRect.length;
        int sizeY = aRect[0].length;
        int bRect[][] = new int[sizeX][sizeY];
        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) bRect[i][j] = aRect[i][j];
        }
//             ������� 3 - �������� ������ ������ �����������
        int aStripes[][] = {{1,4,15,60,5},{9,6,1},{17,42,4,94}};
        sizeX = aStripes.length;
        int bStripes[][] = new int[sizeX][];
        for (int i = 0; i < sizeX; i++) {
            sizeY = aStripes[i].length;
            bStripes[i] = new int [sizeY];
            for (int j = 0; j < sizeY; j++) bStripes[i][j] = aStripes[i][j];
        }
    }

//  6. �����, ����������� ������ �� ������� "�������", ������������ �������� ����� ������ �����
    public static boolean checkBalance(int[] ar){
        if (ar.length < 2) return false;  // ������ ��� ���������� ������� ������� ����
        int leftSide, rightSide;
        for (int i = 0; i < (ar.length - 1); i++) { // ����������� ������ �� ��������� ������� ������� �� ����� ������
            // � ������ �������� �������� ����� ������
            leftSide = 0;
            rightSide = 0;

            // ���������� i ��� ������ ���������� �������� ����� ����������� ����� �������
            for (int j = 0; j < ar.length; j++)
               if (j<=i) leftSide += ar[j];    //  ��������� �� ����� �������, � ��, ��� ����� ������� ���������� � leftSide,
               else rightSide += ar[j];        //  � ��, ��� ������ - � rightSide
            if (leftSide == rightSide) return true;  // ���� ������� ������� �����, ���������� TRUE
        }
        return false;
    }

//  7. �����, "���������" �������� ������� "ar" ������ ��� ����� �� ���������� ���������� ����� "n"
    public static void shiftArray(int[] ar, int n){
        if (n==0) return; // ������ ������� �� �����
        int destination, temp=0, step = n / Math.abs(n);  // �������� ������ �� ������ ���� ���� �� +1, ���� �� -1 �������
        System.out.println("�������� ������:               " + Arrays.toString(ar));
        for (int j = 0; j < Math.abs(n); j++) {
            for (int i = 0; i < (ar.length-1); i++) {
                if (step<0) destination = i-1;
                else destination = ar.length-i;

                if (destination == ar.length) { // ���� ������ ���������� ������ � ��������� ��� �����
                    destination = 0;
                    temp = ar[destination];
                }
                if (destination < 0) { // ���� ������ ���������� ����� � ���������� ��� ������
                    destination = ar.length-1;
                    temp = ar[destination];
                }
                if (step<0) ar[destination] = ar [i];
                else ar[destination] = ar[ar.length-1-i];
            }
            if (step<0) ar[ar.length - 2]=temp;
            else ar[1] = temp;
        }
        System.out.println("������, ��������� �� " + n + " �����: " + Arrays.toString(ar));
    }
}