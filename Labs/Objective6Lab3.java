public class Objective6Lab3 {
  public static void main(String[] args) {
    int counter = 1;

    while (counter <= 20) {
      System.out.print(counter);
      if (counter % 2 == 1) {
        System.out.print(" is odd\n");
      }
      else {
        System.out.print(" is even\n");
      }
      counter++;
    }
  }
}
