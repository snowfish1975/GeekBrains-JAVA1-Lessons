import java.util.Arrays;
import java.util.Random;

public class Task_1_4_23 {

//  ���������� "����� ������� �������������"
    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[500];  // ����� �������
        int maxArrayValue = 5;   // ������������ "������" �������
        boolean inPlato = false; // ������� ����, ��� ���� �� �����
        int platoCount = 0;
        int maxPlatoCount=0;
        int platoStart=-1;
        int maxPlatoStart = -1;
        int platoValue = -1;
        for (int i = 0; i < a.length; i++) a[i] = (int)(random.nextInt(maxArrayValue));
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            if (i>0 && a[i]>a[i-1]){
                inPlato = true;
                platoCount = 1;
                platoStart = i;
                platoValue = a[i];
            }
            if (inPlato && a[i]==a[i-1]) platoCount++;
            if (i>0 && inPlato && a[i]<a[i-1]){
                inPlato = false;
                if (platoCount > maxPlatoCount) {
                    maxPlatoCount = platoCount;
                    maxPlatoStart = platoStart;
                }
            }
        }
        if (maxPlatoCount>1)
            System.out.println("������� � ������� " + maxPlatoStart + " ���� ������������� �� �������� \"" + platoValue + "\" ������ " + maxPlatoCount);
        else
            System.out.println("� ���������, �� ����� ������������� ������� 1 ������� ���� �� �������");
    }
}