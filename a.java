public class a {
  public static void main(String[] argu) {
    // String a = "hello";
    // for (int i = a.length() / 2 + 2; i >= 0; i--) {
    // System.out.println(i + " " + a.charAt(i));
    // }
    // for (int i = a.length() - 1; i >= 0; i--) {
    // System.out.println(i + " " + a.charAt(i));
    // }

    // apna collage change index f to l and l to f
    StringBuilder sb = new StringBuilder("helloRitu");
    for (int i = 0; i < sb.length() / 2; i++) {
      int front = i;
      int back = sb.length() - 1 - i; // 5-1-0=4

      char frontChar = sb.charAt(front);
      char backChar = sb.charAt(back);

      sb.setCharAt(front, backChar);
      sb.setCharAt(back, frontChar);
    }
    System.out.println(sb);
  }

}