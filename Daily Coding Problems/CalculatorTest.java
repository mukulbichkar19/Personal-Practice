import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class CalculatorTest{

  @Test
  public void testSum(){
    Calculator c = new Calculator();
    int res = c.sum(2,3);
    assertEquals(res, 5);
  }

}
