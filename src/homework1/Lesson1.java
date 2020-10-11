package homework1;

public class Lesson1 {
    public static void main(String[] args) {
        do_Exercise_2();
        do_Exercise_3(20, 5, 12, 0);
        System.out.println(do_Exercise_4(10, 9));
        do_Exercise_5(0);
        System.out.println(do_Exercise_6(6));
        do_Exercise_7("Никита");
        do_Exercise_8(2020);
    }

    //2.Создать переменные всех пройденных типов данных, и инициализировать их значения;
    static void do_Exercise_2() {
        byte a = 90;
        short b = 2020;
        int c = 40043;
        double d = 854.45;
        float e = 60.23f;
        long f = 554443221;
        char g = 1200;
        boolean h = true;
        System.out.println("Задание №2");
        System.out.println("Значение для типа byte=" + a);
        System.out.println("Значение для типа short=" + b);
        System.out.println("Значение для типа int=" + c);
        System.out.println("Значение для типа double=" + d);
        System.out.println("Значение для типа float=" + e);
        System.out.println("Значение для типа long=" + f);
        System.out.println("Значение для типа char=" + g);
        System.out.println("Значение для типа boolean=" + h);
    }

    // 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
    static double do_Exercise_3(double a, double b, double c, double d) {
        System.out.println("Задание №3");
        double result = 0;
        if (d != 0) {
            result = a * (b + (c / d));
            System.out.println(result);
        } else {
            System.out.println("На ноль делить нельзя!");
        }
        return result;
    }

    // 4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    static boolean do_Exercise_4(int a, int b) {
        System.out.println("Задание №4");
        return (a + b >= 10 && a + b <= 20) ;
        }




    //5.Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное;
    // Замечание: ноль считаем положительным числом.
    static void do_Exercise_5(int a) {
        System.out.println("Задание №5");
        if (a >= 0) {
            System.out.println("Число - положительное");
        } else {
            System.out.println("Число -отрицательное");
        }
    }

    // 6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
    static boolean do_Exercise_6(int a) {
        System.out.println("Задание №6");
        return (a < 0);

    }

    //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    static void do_Exercise_7(String name) {
        System.out.println("Упражнение №7");
        System.out.println("Привет " + name + "!");
    }

    // 8.Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным,
    // кроме каждого 100-го, при этом каждый 400-й – високосный.
    static void do_Exercise_8(int year) {
        System.out.println("Задание №8");
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " - " + "високосный год");
        } else {
            System.out.println(year + " - " + "невисокосный год");
        }

    }
}