public class Lesson1 {
    byte b = 15;
    short s = 125;
    int i = 6512;
    long l = 654566546;
    float f = 4.156F;
    double d = 44.6489;
    char c = 'A';

    public static boolean bool = true;
    String str = "String variable";

    public static void main(String[] args) {
        System.out.println(abcdMath(3, 2,4,2));
        System.out.println(isTeenAger(7,8));
        isPositive(-14);
        bool = isNegative(-94);
        sayHello("�������");
        bool = isEqual(26, 26); // true
        bool = isDivided(6,2); // true
        bool = isTriangle(4,5,10); //false
        bool = isLeapYear(2016); // true
        bool = isLeapYear(2100); // false
        bool = isLeapYear(2000); // true
        randomNumber(15,45); // ��������� ����� ����� 15 � 45
        dices();
        sinuses(0.5F);
        isDateInRange(3, 26); // true
        rgb2cmyk(100, 50, 20); // 0.0 - 0.5 - 0.8 - 0.6078   ��� ���������
        isTrippleEqual(10,10,14);
        isInRange(0.5F, 1.5F); //false
    }

//  03. �����, ����������� ������� a*(b+(c/d)) � ������������ ���������
    public static int abcdMath (int a, int b, int c, int d){
        return a*(b+(c/d));
    }

//  04. �����, �����������, ����� �� ����� x1 � x2 � ��������� ����� 10 � 20 � ������������ ��/���
    public static boolean isTeenAger(int x1, int x2){
        int sum = x1 + x2;
        if (sum >= 10 && sum <= 20)
            return true;
        else
            return false;
    }

//  05. �����, ����������� ����� �� ���������������
    public static void isPositive(int x){
        String str = "�������������";
        if (x<0){
            str = "�������������";
        }
        System.out.println("���������� ����� \"" + x + "\" - " + str + ".");
    }

//  06. �����, ����������� ����� �� ��������������� � ������������ true/false
    public static boolean isNegative(int x){
        if (x<0){
            return true;
        }
        return false;
    }

//  07. �����, ��������� ����������� � ��������� ������
    public static void sayHello(String name){
        System.out.println("������, " + name + "!");
    }

//  08. �����, ����������� �������� (!(a && b) && (a || b)) || ((a && b) || !(a || b))
    public static void isTrue (boolean a, boolean b){
        boolean res = (!(a && b) && (a || b)) || ((a && b) || !(a || b));
        if (res) {
            System.out.println("��������!");
        }
        else {
            System.out.println("�� ��������.");
        }
    }

//    09. ���������� ��������� (!(a < b) && !(a > b))
//    �� ����, ����������� ������� "���� a �� ������ b � a �� ������ b", ��� ������������ "���� a ����� b"
    public static boolean isEqual (int a, int b){
        if (a==b) return true;
        else return false;
    }

//  10. �����, ����������� ������� ������ � ������������ true/false
    public static boolean isDivided(int x1, int x2){
        if ((x1 % x2) == 0) return true;
        else return false;
    }

//  11. �����, ����������� ����� �� ���� ��������� ��������� ������������
    public static boolean isTriangle(int x1, int x2, int x3){
        if (x1<0 || x2 <0 || x3<0) return false; // ���� ���� �� ������ ������������� �����, ��� �� �����������
        if ( (x1<(x2+x3)) && (x2<(x1+x3)) && (x3<(x1+x2)) ) return true; // ���� ��� ��� ������� ������ ���� ���� ������ - ����� � �����������
        else return false; // ����� ����� ���
    }

//  12. �����, ����������� ��� �� ������������
    public static boolean isLeapYear(int year){
        boolean isLeap = false;
        if ( ((year%4)==0) && (((year%100)!=0) || ((year%400)==0))) isLeap = true;
        return isLeap;
    }

//  13. ����� �� ����� ���������� ����� � ��������� r1-r2
    public static void randomNumber(int r1, int r2){
        System.out.println("��������� �����: " + (int) (Math.random()*(r2-r1)+r1));
    }

//  14. ����� �� ����� ���� �������� �������� �������
    public static void dices(){
        int x1, x2;
        int sum = 0;
        x1 = (int) (Math.random() * 6) + 1;
        x2 = (int) (Math.random() * 6) + 1;
        sum = x1 + x2;
        System.out.println("������ �����: " + x1);
        System.out.println("������ �����: " + x2);
        System.out.println("�������� �����: " + sum);
    }

//  15. ����� �� ����� Sin(2t) + Sin(3t)
    public static void sinuses(double t){
        System.out.println("Sin(2*" + t + ") + Sin(3*" + t +") = " + (Math.sin(2*t)+Math.sin(3*t)));
    }

//  16. ��������, ��� ���� � ������� ��.�� ��������� � ��������� 20.03 - 20.06
    public static boolean isDateInRange(int m, int d){
        if ((m>3 && m<6) || (m==3 && d>=20) || (m==6 && d<=20)) return true;
        else return false;
    }

//   17. �������������� ����� RGB � ������ CMYK. ��������� ������� �������������� ���� (R, G � B / 255):
//    Black   = minimum(1-Red,1-Green,1-Blue)
//    Cyan    = (1-Red-Black)/(1-Black)
//    Magenta = (1-Green-Black)/(1-Black)
//    Yellow  = (1-Blue-Black)/(1-Black)

    public static void rgb2cmyk(float r, float g, float b){
        float c, m, y, k;
        r /= 255;
        g /= 255;
        b /= 255;
        k = Math.min(Math.min(1-r,1-g),1-b);
        c = (1-r-k)/(1-k);
        m = (1-g-k)/(1-k);
        y= (1-b-k)/(1-k);
        System.out.println("������������ ��� CMYK:");
        System.out.println("cyan = " + c);
        System.out.println("magenta = " + m);
        System.out.println("yellow = " + y);
        System.out.println("k-index = " + k);
    }

//  18. �������� ���� ����� �� �������� ���������
    public static void isTrippleEqual(int x1, int x2, int x3){
        String ins = "";
        if ((x1!=x2) || (x1!=x3)) ins = "�� ";
        System.out.println("��� ��� ����� "+ins+"�����.");
    }

//  19. �������� ���������� ���������� � ��������� �� 0 �� 1
    public static boolean isInRange(double x, double y){
        if (x>=0 && x<=1 && y>=0 && x<=1) return true;
        else return false;
    }
}