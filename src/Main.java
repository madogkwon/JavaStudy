public class Main {
  int num1;

  static int num2;

  public void printName(String name) {
    String prtMsg = name + " Hello";
    System.out.println(prtMsg);
  }
  public static void main(String[] args) {
    Main mc = new Main();
    mc.num1 = 10;
    Main.num2 = 20;

    mc.printName("홍길동");

    System.out.printf("%d\n%d", mc.num1, num2);
  }
}