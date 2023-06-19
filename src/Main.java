import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ведите данные переменных X и Y, я определю в какой плоскости данная точка");

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x < 0 & y < 0) {
            System.out.println("III");
        }
        else if (x < 0 & y > 0) {
            System.out.println("II");
        }
        else if (x > 0 & y < 0) {
            System.out.println("IV");
        }
        else if (x > 0 & y > 0) {
            System.out.println("I");
        }
        else if (x == 0 & y < 0) {
            System.out.println("III или IV решай сам");
        }
        else if (x == 0 & y > 0) {
            System.out.println("I или II решай сам");
        }
        else if (x < 0 & y == 0) {
            System.out.println("II или III решай сам");
        }
        else if (x > 0 & y == 0) {
            System.out.println("I или IV решай сам");
        }
        else if (x == 0 & y == 0) {
            System.out.println("Не хочу отвечать");
        }

    }
}