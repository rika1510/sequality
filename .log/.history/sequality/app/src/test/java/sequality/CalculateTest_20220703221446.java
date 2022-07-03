package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testSumTo() {
    Calculate calculate = new Calculate();
    int expected = 55;
    assertEquals(expected, calculate.sumTo(1, 10));
  }

  @Test
  public void testSumOddTo() {
    Calculate calculate = new Calculate();
    int expected = 25;
    assertEquals(expected, calculate.sumOddTo(1, 10));
  }

  @Test
  public void testSumEvenTo() {
    Calculate calculate = new Calculate();
    int expected = 30;
    assertEquals(expected, calculate.sumEvenTo(1, 10));
  }

  @Test
  public void testAverage() {
    Calculate calculate = new Calculate();
    double expected = 2.5;
    assertEquals(expected, calculate.average(1, 10));
  }

}
