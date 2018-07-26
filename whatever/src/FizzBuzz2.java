
public class FizzBuzz2 {

    public String sendAndReturn(int number) {
       if (หารสามและห้าลงตัว(number)) {
           return "FizzBuzz";  
       }
        
        if(หารสามลงตัว(number)) {
           return "fizz";  
           
        }if (หารห้าลงตัว(number)) {
            return "Buzz";
        }
        return  number+"";
    }



    private boolean หารสามและห้าลงตัว(int number) {
        return number % 3 ==0  &&  number % 5 ==0;
    }

    

    private boolean หารสามลงตัว(int number) {
        return number % 3 == 0;
    }

    private boolean หารห้าลงตัว(int number) {
        return หารสามและห้าลงตัว(number);
    }
    
    
    

}
