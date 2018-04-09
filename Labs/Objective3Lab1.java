import java.util.Scanner;

public class Objective3Lab1 {
  public static void main(String[] args) {
    String userInput = "";
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Please type a word: ");
    userInput = keyboard.next();

    System.out.println(userInput);

    keyboard.close();
  }

}
