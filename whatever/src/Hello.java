
public class Hello {

    public static void main(String[] args) {
//        int i = 1;
//       Integer i2 = new Integer (i);
//       i2 = Integer.valueOf(i);
//       int i3 = i2 ;
//       System.out.println(i2.MIN_VALUE);
//       System.out.println(i2.MAX_VALUE);
//       System.out.println(i3);
       
        
        Hello hello = new Hello();
        hello.say(100);
    }
    
    //Constant
    private  static  final int NUMBER_TWO = 2;
    //class  /variable
    public static int indext = 1;       
    
    // instance variable
    private  int number = 3;
    
    
    private void say(int  number) {
        int indext = 0;  //local variable
        System.out.println(indext);//0
        System.out.println(Hello.indext);//1
        System.out.println(number);//100
        System.out.println(this.number);//3
        System.out.println(NUMBER_TWO); //2
     
        
    }

   

}
