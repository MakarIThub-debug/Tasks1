import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Task1 {
    public static void main(String[] args) {
        //Ex 1
        System.out.println(max(5, 3));
        //Ex 2
        System.out.println(division(6, 8));
        //Ex 3
        System.out.println(parse("2112"));
        //Ex 4
        System.out.println(sqrt(4));
        //Ex 5
        System.out.println(fact(5));
        //Ex 6
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(mas(arr));
        //Ex 7
        System.out.println(pow(2, 5));
        //Ex 8
        System.out.println(str("Hello, world!", 7));
        //Ex 9
        System.out.println(search(arr, 11));
        //Ex 11
        System.out.println(SecondS(205));
        //Ex 12
        ArrayList<String> names = new ArrayList<>();
            names.add("Москва");
            names.add("Санкт-Петербург");
            names.add("Кострома");
            names.add("Киров");
            names.add("Подольск");
            names.add("Клязьма");
            names.add("Хабаровск");
            System.out.println(Lest(names, 3));
        //Ex 13
        System.out.println(pass("олег1488"));
        //Ex 14
        System.out.println(dat("04.10.2006"));
        //Ex 15
        System.out.println(conc("Привет медвед, ", "молодёжь"));
        //Ex 16
        System.out.println(ostat(5,2));
        //Ex 17
        System.out.println(emty("wqw"));
        //Ex 18
        System.out.println(age(19));
        //Ex 19
        System.out.println(f(10));
        //Ex 20
        System.out.println(del(15,4));
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        if (a < b) {
            return b;
        } else {
            throw new IllegalArgumentException("Аргуемнты равны");
        }
    }

    public static double division(double a, double b) {
        double c;
        if (a != 0 && b != 0) {
            c = a / b;
            return c;
        }
        if (b == 0) {
            throw new ArithmeticException("Делить на ноль нельзя");
        }
        else {
            c = 0;
            return c;
        }
    }

    public static int parse(String a) {
        int num;
        try {
            num = Integer.parseInt(a);
            return num;
        } catch (ArithmeticException e) {
            return 404;
        }
    }

    public static String age(int a) {
        if (150 < a || a < 0) {
            throw new IllegalArgumentException("Возраст не корректен");
        } else {
            return "Все хорошо";
        }

    }

    public static double sqrt(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("Нельзя взять квадрат из отрицательного числа");
        } else {
            return Math.pow(a, 0.5);
        }

    }

    public static int fact(int a) {
        int f = 1;
        for (int i = 1; i <= a; i++) {
            f = f * i;
        }
        return f;
    }

    public static boolean mas(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                return true;
            }
            i++;
        }
        return false;
    }

    public static double pow(int a, int b) {
        if (b < 0) {
            throw new IllegalArgumentException("Уберите отрицательную степень");
        } else {
            return Math.pow(a, b);
        }
    }

    public static String str(String a, int b) {
        if (a.length() > b) {
            return a.substring(b);
        }
        if (a.length() == b) {
            return a;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static boolean search(int[] arr, int b) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == b) {
                return true;

            }
            i++;
        }
        return false;
    }

    public static String SecondS(int a) {
        return Integer.toBinaryString(a);
    }

    public static boolean del(int a, int b) {
        if (a % b == 0) {

            return true;
        }
        if(b==0){
            throw new IllegalArgumentException("На ноль делить нельзя");
        }
         else {
            return false;
        }
    }

    public static String Lest(ArrayList<String> list, int a) {
        String b;
        b = list.get(a);
        return b;
    }

    public static String pass(String s) {
        if (s.length() < 8) {
            throw new IllegalArgumentException("Пароль слабоват");
        } else {
            return "Все нормально";
        }
    }

    public static boolean dat(String s) {
        LocalDate localDate = LocalDate.parse(s, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        if(localDate.equals(s))
        {
            return true;
        }
        else{
            return false;
        }
    }

    public static String conc(String b, String a) {

        if (b != null && a != null) {
            String s = b + a;
            return s;
        } else {
            throw new NullPointerException("Вы задали нулевую строку");
        }
    }


    public static int ostat(int a, int b) {
        int c;
        if (a != 0 && b != 0) {
            c = a % b;
            return c;
        }
        if (a == 0) {
            return 0;
        }
        else {
            throw new IllegalArgumentException("Вы ввели число равное нулю, а на ноль делить нельзя");
        }
    }

    public static boolean emty(String s) {

        if (s != "" && s!= null) {
            return true;
        } else {
            throw new IllegalArgumentException("Строка пустая");
        }
    }

    public static double f(double c) {
        if (c >= -273.16) {
            return c * 1.8 + 32;
        } else {
            throw new IllegalArgumentException("Температура меньше абсолютного нуля");
        }
    }


}