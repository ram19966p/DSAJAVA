import java.util.*;
public class BineryToDeci {

public static void conversion(int n , int k  ){
    int dec = 0  ;
    int pow = 0 ;
   for(int j = 0 ;  j < k ; j++){
       
        int i = n % 10 ;
       dec = (int) (dec + i *(Math.pow(2,j))) ; 
          n = n/10;
    }
     System.out.println(dec);
}

    public static void main(String[] args) {
        Scanner sc =  new Scanner( System.in);
     System.out.println("  Enter the number  binery number find out the Decimel number");
        int n = sc.nextInt() ;
        int length = String.valueOf(n).length();
        conversion(n , length);

    }
}
