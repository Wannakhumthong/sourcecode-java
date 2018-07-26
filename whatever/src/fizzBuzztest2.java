import static org.junit.Assert.*;

import org.junit.Test;

public class fizzBuzztest2 {

   
    @Test
    public void เลขหนึ่งต้องได้ค่าเป็น1() {
       
      FizzBuzz2 fz = new FizzBuzz2();
      String result = fz.sendAndReturn(1);
      assertEquals("1", result);
    }
    @Test
    public void เลขหนึ่งต้องได้ค่าเป็น2() {
       
      FizzBuzz2 fz = new FizzBuzz2();
      String result = fz.sendAndReturn(2);
      assertEquals("2", result);
    }
    @Test
    public void เลขหนึ่งต้องได้ค่าเป็น3() {
       
      FizzBuzz2 fz = new FizzBuzz2();
      String result = fz.sendAndReturn(3);
      assertEquals("fizz", result);
    }
    @Test
    public void เลข4ต้องได้ค่าเป็น4() {
       
      FizzBuzz2 fz = new FizzBuzz2();
      String result = fz.sendAndReturn(4);
      assertEquals("4", result);
    }
    @Test
    public void เลข4ต้องได้ค่าเป็น5() {
       
      FizzBuzz2 fz = new FizzBuzz2();
      String result = fz.sendAndReturn(5);
      assertEquals("Buzz", result);
    }
    @Test
    public void เลข4ต้องได้ค่าเป็น6() {
       
      FizzBuzz2 fz = new FizzBuzz2();
      String result = fz.sendAndReturn(6);
      assertEquals("fizz", result);
    }
    @Test
    public void เลข4ต้องได้ค่าเป็น7() {
       
      FizzBuzz2 fz = new FizzBuzz2();
      String result = fz.sendAndReturn(7);
      assertEquals("7", result);
    }
    @Test
    public void เลข4ต้องได้ค่าเป็น8() {
       
      FizzBuzz2 fz = new FizzBuzz2();
      String result = fz.sendAndReturn(8);
      assertEquals("8", result);
    }
    @Test
    public void เลข4ต้องได้ค่าเป็น9() {
       
      FizzBuzz2 fz = new FizzBuzz2();
      String result = fz.sendAndReturn(9);
      assertEquals("fizz", result);
    }
    @Test
    public void เลข4ต้องได้ค่าเป็น10() {
       
      FizzBuzz2 fz = new FizzBuzz2();
      String result = fz.sendAndReturn(10);
      assertEquals("Buzz", result);
    }
    @Test
    public void เลข4ต้องได้ค่าเป็น15() {
       
      FizzBuzz2 fz = new FizzBuzz2();
      String result = fz.sendAndReturn(15);
      assertEquals("FizzBuzz", result);
    }
}
