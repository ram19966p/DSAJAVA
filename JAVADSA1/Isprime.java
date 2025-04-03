import java.util.Scanner; 

class Solution {



    public static  void Solution(int  n ){

        for( int i =0 ; i < n ; i ++){
            if(n<=1){
           System.out.println(" 0");
            }
            int div = 2 ;
             while (div < n ) {
                if( n %2 == 0){
                    System.out.println(" Is number is  prime "+n);
                }
                div++;
             }
        }
      
       
    }
 public static void main( String args[]){
  boolean isPrime = true ;
    Scanner sc = new Scanner(System.in);
    System.out.println(" Enter  The any number  to find  Prime or  NOt ");
      int  n = sc.nextInt();
       Solution(n);
      

}

}
