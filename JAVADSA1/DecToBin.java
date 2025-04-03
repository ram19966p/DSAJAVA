 class  DecToBin {


public static void binery(int n){


    // String bin = "";  

    // while (n > 0) {
    //     int rem = n % 2;  
    //     bin = rem + bin;  
    //     n = n / 2;  
    // }

   // System.out.println("Decimal to Binary Conversion: " + bin);

long bin =0;
int rem =0 ;
int pow = 0;
  while (n>0) {
  rem = n  % 2 ;
  
 bin = bin +( rem * (int) (Math.pow(10 ,pow)));
 System.out.println(" "+bin);
pow++ ;
 n = n/2 ;
 
}
System.out.println(" Decimal to binery convesion ye hai "+bin);
}

     public static void main(String[] arg) {
     System.out.println();
     binery(7);
    }
}