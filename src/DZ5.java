import java.util.Scanner;

public class DZ5 {
    public static void main(String[] args) {
//        System.out.println("Введите свою дату, месяц и год рождения, именно в этой последовательности, я определю какой у вас знак зодиака и в чей год вы рождены");
//        Scanner sc = new Scanner(System.in);
//        int data = sc.nextInt();
//        int month = sc.nextInt();
//        int year = sc.nextInt();
//
//        if (0 >= data | data > 31)
//            System.out.println("Ты пишешь чепуху");
//
//        else if (0 >= month | month > 12)
//            System.out.println("Ты пишешь чепуху");
//
//        else if (1900 >= year | year > 2023)
//            System.out.println("Ты пишешь чепуху");
//
//        if (0 < data


//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int i = sc.nextInt();
//        System.out.println(Integer.toBinaryString(n));
//        int mask = 1;
//        mask = mask << i;
//        mask = ~mask;
//        n = n & mask;
//        System.out.println(Integer.toBinaryString(n));


//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int i = sc.nextInt();
//        System.out.println(Integer.toBinaryString(n));
//        int mask = 1;
//        mask = mask << i;
//        n = mask & n;
//        n = n >> i;
//        System.out.println(Integer.toBinaryString(n));



        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(n << 5));



    }
}
