import java.lang.reflect.Array;
import java.util.*;
class fibAndTriangle{
 public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("enter a number");
    int a=s.nextInt();
    int firstno=0;
    int secondno=1;
    System.out.print(firstno);
    System.out.print(secondno);
    for(int i=1;i<=a;i++){
        int thirdni=firstno+secondno;
        firstno=secondno;
        secondno=thirdni;
        System.out.print(thirdni);
        
    }
    System.out.println("\n");
     
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print(" ");
              }for(int k=1;k<=i;k++){
                   System.out.print(i);
                  }for(int n=1;n<=i-1;n++){
                       System.out.print(i);
                  }
                  System.out.println();
        }
 }
}