import org.junit.Test;
import static org.junit.Assert.*;

public class UnitTest{

  public void testConcatenate(){
    UnitTest t = new UnitTest();
    String res = t.concatenate("one","two");
    assertEquals("onetwo", res);
  }


}
