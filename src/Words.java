import java.util.Random;
import java.util.Scanner;

public class Words {
    private static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random random = new Random();
        String word = words[random.nextInt(words.length)];
        String userWord;
        System.out.println("Добро пожаловать в игру \"Угадай слово\". Введите слово: ");
        do {
           userWord = sc.nextLine();
           if (userWord.equals(word)) {
               System.out.println("Поздравляю, Вы угадали! Правильный ответ: " + word);
           }
           else {
                wordsEquality(userWord,word);
           }

        } while (!userWord.equals(word));
    }
    public static void wordsEquality(String userWord, String word) {
        String s = "";
        int n;
        if (userWord.length() > word.length()) {n = word.length();}
        else {n = userWord.length();}
        for (int i = 0; i < n; i++) {
            if (userWord.charAt(i) == word.charAt(i)) {
                s = s + word.charAt(i);
            }
            else {
                s = s + "#";
            }
        }
        if (s.length() < 15) {
            for (int i  = 0; i < 15 - n; i++) {
                s += "#";
            }
        }
        System.out.println("Вы не угадали \n" + s +"\nПопробуйте еще раз");
    }
}
