public class Patterm3 {
    public static void solid_Rhombus (int n){
        for( int i = 1 ; i<=n ; i++){
            for(int j = 1 ; j<=(n-i); j++){
                System.out.print(" ");
            }
             for(int j = 1 ; j<=n ; j++){
              System.out.print(" * ");
             }
             System.out.println();
        }
        

    }

       public static void hollow_Rectengler(int n ){
        for( int i = 1 ; i <= n ; i++){
            for( int  j = ( n-i);  j >= 1 ; j--){
                System.out.print(" ");
            }

            for( int j = 1 ; j<= n ; j++){
            if( i == 1 || i== n  || j == 1 || j== n){
                System.out.print(" * ");
            }else{
                System.out.print("   ");
            }

            }
            System.out.println();
        }
       }


        public static void dimond_pattern( int  n ){
            for(int i = 1 ; i <= n ; i++){
                for(int j = 1; j<=(n-i) ; j++){
                    System.out.print(" ");
                }
                for( int k = 1 ; k<=(2*i)-1;k++){
                    System.out.print("*");
                 

                }
                System.out.println();
            }
            for(int i = n ; i >= 1 ; i--){
                for(int j = 1 ; j<=(n-i) ; j++){
                    System.out.print(" ");
                }
                for( int k = 1 ; k<=(2*i)-1; k++){
                    System.out.print("*");
                  

                }
                System.out.println();
            }


        }
    public static void main(String[] args) {
        int n = 5 ;
        //solid_Rhombus(n);
        //hollow_Rectengler(n);
        dimond_pattern(n);
    }
}
