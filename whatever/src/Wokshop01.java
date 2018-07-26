
public class Wokshop01 {

    public static void main(String[] args) {
        int a, b, c =0;
        a = c++;  // a=0
        System.out.println(a);
       
        b = ++a; // b=1
        System.out.println(b);
        
       c++;
        
        
       b = ++c + a++; //3
        
        
        a = --b + c++;  // 3+3
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
      

    }

}
