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
        sayHello("Алексей");
        bool = isEqual(26, 26); // true
        bool = isDivided(6,2); // true
        bool = isTriangle(4,5,10); //false
        bool = isLeapYear(2016); // true
        bool = isLeapYear(2100); // false
        bool = isLeapYear(2000); // true
        randomNumber(15,45); // случайное число между 15 и 45
        dices();
        sinuses(0.5F);
        isDateInRange(3, 26); // true
        rgb2cmyk(100, 50, 20); // 0.0 - 0.5 - 0.8 - 0.6078   что корректно
        isTrippleEqual(10,10,14);
        isInRange(0.5F, 1.5F); //false
    }

//  03. Метод, реализующий формулу a*(b+(c/d)) и возвращающий результат
    public static int abcdMath (int a, int b, int c, int d){
        return a*(b+(c/d));
    }

//  04. Метод, проверяющий, лежит ли сумма x1 и x2 в диапазоне между 10 и 20 и возвращающий да/нет
    public static boolean isTeenAger(int x1, int x2){
        int sum = x1 + x2;
        if (sum >= 10 && sum <= 20)
            return true;
        else
            return false;
    }

//  05. Метод, проверяющий число на положительность
    public static void isPositive(int x){
        String str = "положительное";
        if (x<0){
            str = "отрицательное";
        }
        System.out.println("Переданное число \"" + x + "\" - " + str + ".");
    }

//  06. Метод, проверяющий число на отрицательность и возвращающий true/false
    public static boolean isNegative(int x){
        if (x<0){
            return true;
        }
        return false;
    }

//  07. Метод, выводящий приветствие с указанным именем
    public static void sayHello(String name){
        System.out.println("Привет, " + name + "!");
    }

//  08. Метод, реализующий проверку (!(a && b) && (a || b)) || ((a && b) || !(a || b))
    public static void isTrue (boolean a, boolean b){
        boolean res = (!(a && b) && (a || b)) || ((a && b) || !(a || b));
        if (res) {
            System.out.println("Доказано!");
        }
        else {
            System.out.println("Не доказано.");
        }
    }

//    09. Упрощенное выражение (!(a < b) && !(a > b))
//    По сути, проверяется условие "если a не меньше b И a не больше b", что эквивалентно "если a равно b"
    public static boolean isEqual (int a, int b){
        if (a==b) return true;
        else return false;
    }

//  10. Метод, проверяющий деление нацело и возвращающий true/false
    public static boolean isDivided(int x1, int x2){
        if ((x1 % x2) == 0) return true;
        else return false;
    }

//  11. Метод, проверяющий могут ли быть параметры сторонами треугольника
    public static boolean isTriangle(int x1, int x2, int x3){
        if (x1<0 || x2 <0 || x3<0) return false; // если одна из сторон отрицательной длины, это не треугольник
        if ( (x1<(x2+x3)) && (x2<(x1+x3)) && (x3<(x1+x2)) ) return true; // если все три стороны меньше сумм двух других - может и треугольник
        else return false; // иначе точно нет
    }

//  12. Метод, проверяющий год на високосность
    public static boolean isLeapYear(int year){
        boolean isLeap = false;
        if ( ((year%4)==0) && (((year%100)!=0) || ((year%400)==0))) isLeap = true;
        return isLeap;
    }

//  13. Вывод на экран случайного числа в диапазоне r1-r2
    public static void randomNumber(int r1, int r2){
        System.out.println("Случайное число: " + (int) (Math.random()*(r2-r1)+r1));
    }

//  14. Вывод на экран двух значений выпавших кубиков
    public static void dices(){
        int x1, x2;
        int sum = 0;
        x1 = (int) (Math.random() * 6) + 1;
        x2 = (int) (Math.random() * 6) + 1;
        sum = x1 + x2;
        System.out.println("Первый кубик: " + x1);
        System.out.println("Второй кубик: " + x2);
        System.out.println("Выпавшая сумма: " + sum);
    }

//  15. Вывод на экран Sin(2t) + Sin(3t)
    public static void sinuses(double t){
        System.out.println("Sin(2*" + t + ") + Sin(3*" + t +") = " + (Math.sin(2*t)+Math.sin(3*t)));
    }

//  16. Проверка, что дата в формате ДД.ММ находится в диапазоне 20.03 - 20.06
    public static boolean isDateInRange(int m, int d){
        if ((m>3 && m<6) || (m==3 && d>=20) || (m==6 && d<=20)) return true;
        else return false;
    }

//   17. Преобразование цвета RGB в формат CMYK. Найденная формула преобразования ниже (R, G и B / 255):
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
        System.out.println("Получившийся код CMYK:");
        System.out.println("cyan = " + c);
        System.out.println("magenta = " + m);
        System.out.println("yellow = " + y);
        System.out.println("k-index = " + k);
    }

//  18. Проверка трех числе на взаимное равенство
    public static void isTrippleEqual(int x1, int x2, int x3){
        String ins = "";
        if ((x1!=x2) || (x1!=x3)) ins = "не ";
        System.out.println("Все три числа "+ins+"равны.");
    }

//  19. Проверка нахождения переменных в диапазоне от 0 до 1
    public static boolean isInRange(double x, double y){
        if (x>=0 && x<=1 && y>=0 && x<=1) return true;
        else return false;
    }
}