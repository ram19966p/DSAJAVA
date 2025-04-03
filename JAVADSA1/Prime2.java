
import java.util.Scanner ;
public class Prime2 {
    public static void  main(String arg[]){
      Scanner sc = new Scanner(System.in);
      System.out.println(" Enter  The any number  to find  Prime or  NOt ");
        int  n = sc.nextInt();
        for(int i=2;i<=n;i++){
            int a=0;
            int temp=i;
           for(int j=2;j<temp;j++){
              if(temp%j==0){
                 a++;
              }
           }
           if(a==0){
             System.out.println(i +"is prime");
           }
        
        }}}