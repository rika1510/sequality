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
      sum = sum + i;
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
    if (x % 2 == 0) {
      x++;
    }
    for (i = x; i <= y; i = i + 2) {
      sum = sum + i;
    }
    return sum;
  }

  public int sumEvenTo(int x, int y) {
    int sum = 0;
    int i, tmp;
    if (x > y) {
      tmp = x;
      x = y;
      y = tmp;
    }
    if (x % 2 == 1) {
      x++;
    }
    for (i = x; i <= y; i = i + 2) {
      sum = sum + i;
    }
    return sum;
  }

  public double average(int x, int y) {
    int tmp;
    double ave, sum;
    if (x > y) {
      tmp = x;
      x = y;
      y = tmp;
    }
    sum = (double) (sum(x, y));
    ave = sum / (y - x + 1);
    return ave;
  }

  public static void main(String[] args) {
    System.out.println(new Calculate().sum(3, 2));
  }
}
