import java.util.*;

public class PrimeRange {

    public  static  void prime(int n ){
                    
                for(  int j = 2 ; j <= n ; j++){
                    int  a = 0;
                    for( int k = 2 ; k < j; k++){

                   if( j % k  ==  0 ){
                        a++;
                    }
                }

                if( a==0){
                    System.out.println(j+ " Is a prime Number");
                }else{
                    System.out.println(j+ " Is a not Prime number");
                }
                   
                }
               
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number to  check range of Prime ");
        int n = obj.nextInt();
        prime(n);
    }
}
