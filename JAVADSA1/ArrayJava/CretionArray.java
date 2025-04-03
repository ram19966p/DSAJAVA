package ArrayJava;

import java.util.Scanner;

public class CretionArray {

public  static void update(int marks[], int none){
    none   = 10 ;
    for( int i = 0 ;  i<marks.length; i++){
        marks[i] = marks[i]+1;
    }

}

    public static void main(String[] args) {
         int  mark[] = new int[100];
    int marks[] = { 1 , 2 , 3, 5};
     String  Frouit[]= { "apple", "mango","orange"};

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number Physics ");
    mark[0] = sc.nextInt();
    System.out.println("Enter the number chem ");
    mark[1] = sc.nextInt();
    System.out.println("Enter the number matn");
    mark[2] = sc.nextInt();
    System.out.println(" Physic maks: "+ mark[0]);
    System.out.println(" che maks: "+ mark[1]);
    System.out.println(" math maks: "+ mark[2]);
    mark[2] = mark[2]+1;
    System.out.println(" math maks: "+ mark[2]);
    int none = 5;
   
   // update(marks,none);
    System.out.println(none);
    for( int i =0 ; i<=marks.length; i++){
        System.out.println(marks[i]);
    }
    


    }
    
}
