import static org.junit.Assert.*;

import org.junit.Test;

public class fizzBuzzTest {

    @Test
    public void เลขหนึ่งต้องได้ค่าเป็นหนึ่ง() {
       
        FizzBuzz fz = new FizzBuzz();
      String result = fz.sendAndReturn(1);
      assertEquals("1", result);
    }
    
    @Test
    public void เลขสองต้องได้ค่าเป็นสอง() {
        
        FizzBuzz fz = new FizzBuzz();
      String result = fz.sendAndReturn(2);
      assertEquals("2", result);
    }
    @Test
    public void ต้องเป็นสาม() {
        
        FizzBuzz fz = new FizzBuzz();
      String result = fz.sendAndReturn(3);
      assertEquals("fizz", result);
    }
    
    @Test
    public void ต้องเป็นสี่() {
        
        FizzBuzz fz = new FizzBuzz();
      String result = fz.sendAndReturn(4);
      assertEquals("4", result);
    }
    @Test
    public void ต้องเป็นห้า() {
        
        FizzBuzz fz = new FizzBuzz();
      String result = fz.sendAndReturn(5);
      assertEquals("buzz", result);
    }
    @Test
    public void ต้องเป็นหก() {
        
        FizzBuzz fz = new FizzBuzz();
      String result = fz.sendAndReturn(6);
      assertEquals("fizz", result);
    }
    @Test
    public void ต้องเป็นเจ็ด() {
        
        FizzBuzz fz = new FizzBuzz();
      String result = fz.sendAndReturn(7);
      assertEquals("7", result);
    }
    @Test
    public void ต้องเป็นแปด() {
        
        FizzBuzz fz = new FizzBuzz();
      String result = fz.sendAndReturn(8);
      assertEquals("8", result);
    }
    @Test
    public void ต้องเป็นเก้า() {
        
        FizzBuzz fz = new FizzBuzz();
      String result = fz.sendAndReturn(9);
      assertEquals("fizz", result);
    }
    @Test
    public void ต้องเป็นสิบ() {
        
        FizzBuzz fz = new FizzBuzz();
      String result = fz.sendAndReturn(10);
      assertEquals("buzz", result);
    }
    @Test
    public void ต้องเป็น11() {
        
        FizzBuzz fz = new FizzBuzz();
      String result = fz.sendAndReturn(11);
      assertEquals("buzz", result);
    }

}
