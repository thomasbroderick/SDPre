import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int userNum;

    System.out.println("Please enter a number: ");
    userNum = scanner.nextInt();

    if (userNum > 0) {
      System.out.println(userNum + " is positive");
    }
    else if (userNum == 0) {
      System.out.println(userNum + " is equal to 0");
    }
    else {
      System.out.println(userNum + " is negative");
    }
    scanner.close();
  }
}
