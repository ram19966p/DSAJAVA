 
 import java.util.*;
 
 class Fact {

   static int temp = 1 ;
   static int temp1 = 1 ;
   static int  k =1 ; 

   public static int fact(int i) {
    int fact = 1; 
   
    for (int n = 1; n <=i; n++) {  
        fact *= n;
        
    }
    
    return fact;  
}

   public static void  binomiyal(int  n , int r  ) {
     k  = fact(n);
   temp = fact(r) * fact(n - r) ;
   temp1  =  k/temp ;
  
     System.out.println(temp1);
    }

   






        static int factorial(int n) {
            if (n == 0 || n == 1) 
                return 1;
            return n * factorial(n - 1);
        }
        
        public static void main(String[] args) {
            int num ;
            int r   ;
            // System.out.println("Factorial of " + num + " is: " + factorial(num));
            Scanner obj  = new Scanner(System.in);
            num  = obj.nextInt();
            r = obj.nextInt();
            binomiyal(num , r );
        }
    }
    
