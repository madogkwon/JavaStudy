package chap_02;

public class _05_Operator5 {
  public static void main(String[] args) {
    // 삼항 연산자
    // 결과 = (조건) ? (참의 경우 결과값) : (거짓의 경우 결과값)
    int a = 3;
    int b = 5;
    int max = (a > b) ? a : b;
    System.out.println(max); // 5

    int min  = (a < b) ? a : b;
    System.out.println(min); // 3

    boolean x  = (a == b) ? true : false;
    System.out.println(x); // false

    String s = (a != b) ? "달라요" : "같아요";
    System.out.println(s); // 달라요
  }
}
