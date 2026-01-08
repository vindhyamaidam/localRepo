import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionTest{
  @Test
  void testAdd(){
    Addition addition = new Addition();
    int result = addition.add(5,3);
    assertEquals(result, 8);
  }
}
