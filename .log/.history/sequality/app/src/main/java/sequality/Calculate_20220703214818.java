package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public int sumTo(int x, int y) {
    int sum = 0;
    int i, tmp;
    if (x > y) {
      tmp = x;
      x = y;
      y = tmp;
    }
    for (i = x; i <= y; i++) {
      sum = i;
    }
    return sum;
  }

  public int sumOddTo(int x, int y) {
    int sum = 0;
    int i, tmp;
    if (x > y) {
      tmp = x;
      x = y;
      y = tmp;
    }
    if()
    for(i=x;i<=y;i=i+2)
  }

  public static void main(String[] args) {
    System.out.println(new Calculate().sum(3, 2));
  }
}
