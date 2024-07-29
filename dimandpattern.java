import java.util.*;
class dimandpattern{
    public static void main(String args[]){
        int row=5;
        for(int i=1;i<=row;i++){
            for(int j=5;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            for(int m=1;m<=i-1;m++){
                System.out.print("*");
            }
            System.out.println();
    }
    for(int i=1;i<=row;i++){
        for(int j=1;j<=i;j++){
            System.out.print(" ");
        }
        for(int k=row;k>=i;k--){
            System.out.print("*");
        }
        for(int m=row-1;m>=i;m--){
            System.out.print("*");
        }
        System.out.println();
}
}
}