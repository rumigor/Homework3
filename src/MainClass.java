import java.util.Random;
import java.util.Scanner;

public class MainClass {
    private static Scanner sc;
    private static int count;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        guessNumber();
    }
    public static void guessNumber(){
        System.out.println("Добро пожаловать в игру \"Угадай число\"");
        Random random = new Random();
        int number = random.nextInt(10);
        int userNumber;
        count = 0;
            do {
                count++;
                System.out.println("Введите число от 0 до 9");
                userNumber = sc.nextInt();
                if (userNumber == number) {
                    System.out.println("Поздравляю, Вы угадали!");
                } else if (userNumber > number) {
                    System.out.println("Загаданное число меньше!");
                } else {
                    System.out.println("Загаданное число больше!");
                }
            } while ((number != userNumber)&&(count < 3));
           if (count == 3) System.out.println("Вы проиграли, загаданное число: " + number);
           System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
           int restart = sc.nextInt();
           if (restart == 1) {guessNumber();}
        }
}
