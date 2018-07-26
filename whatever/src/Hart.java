
public class Hart {

    public static void main(String[] args) {
//       for(int i = 0; i < 8; i++) {
//           System.out.println();
//           for(int j = 0; j < 10; j++) {
//               System.out.print("*");
               
 //          }
           
 //      }
        
      //1
        
        System.out.println(" **  ** ");
      //2
       
     //   for(int i=0; i<9; i++) {
//            if (i== start/2) {
//                System.out.println(" ");
//            }else {
                System.out.println("****  ****");
                
         //   }
            
      //  }
      //3-7
        int start = 9;
        for (int round = 0;round<5; round++ ) {
            for (int a =0; a<round; a++) {
                System.out.print(" ");
                
            }
            for (int i =0; i<start; i++) {
                System.out.print("*");
            }
            System.out.println();
            start = start-2;
        }
        
        
        
        
        
        
        
        
        
//        
//        for(int i = 0; i < 9; i++) {
//         System.out.print("*");
//        }
//        System.out.println();
//        //4
//        System.out.print(" ");
//        for(int i = 0; i < 7; i++) {
//            System.out.print("*");
//           }
//        
//        //5
//        System.out.println();
//        System.out.print(" ");System.out.print(" ");
//        for(int i = 0; i < 5; i++) {
//            System.out.print("*");
//           }
//        
        
        
        
        
        
    }
    

}
