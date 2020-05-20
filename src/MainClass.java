import java.util.Random;
import java.util.Scanner;

public class MainClass {
    public static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        guessNumber();
    }
    public static void guessNumber(){
        System.out.println("Добро пожаловать в игру \"Угадай число\". Введите число от 0 до 99");
        Random random = new Random();
        int number = random.nextInt(100);
        int userNumber;
            do {
                userNumber = sc.nextInt();
                if (userNumber == number) {
                    System.out.println("Поздравляю, Вы угадали!");
                } else if (userNumber > number) {
                    System.out.println("Загаданное число меньше! Попробуйте еще раз");
                } else {
                    System.out.println("Загаданное число больше! Попробуйте еще раз");
                }
            } while (number != userNumber);
           System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
           int restart = sc.nextInt();
           if (restart == 1) {guessNumber();}
        }
}
