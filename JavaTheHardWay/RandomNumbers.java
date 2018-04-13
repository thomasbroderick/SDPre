public class RandomNumbers {
  public static void main(String[] args) {
    int a, b, c, d;
    double r, rps;

    rps = Math.random();
    if (rps < 0.333333) {
      System.out.println("Rock");
    }
    else if (rps < 0.6666667) {
      System.out.println("Paper");
    }
    else {
      System.out.println("Scissors");
    }

    a = 1 +(int)(10 * Math.random());
    b = 1 +(int)(10 * Math.random());
    c = 1 +(int)(10 * Math.random());
    d = 1 +(int)(10 * Math.random());
    System.out.println("1-10:\t" + a + "\t" + b + "\t" + c + "\t" + d);

    a = (int)(100*Math.random());
    b = (int)(100*Math.random());
    c = (int)(100*Math.random());
    d = (int)(100*Math.random());
    System.out.println("0-99:\t" + a + "\t" + b + "\t" + c + "\t" + d);

    a = 1+ (int)(3*Math.random());
    b = 1+ (int)(3*Math.random());
    c = 1+ (int)(3*Math.random());
    System.out.println("1-3:\t" + a + "\t" + b + "\t" + c);

    a = 5+ (int)(6*Math.random());
    b = 5+ (int)(6*Math.random());
    c = 5+ (int)(6*Math.random());
    System.out.println("5-10:\t" + a + "\t" + b + "\t" + c);

  }
}
