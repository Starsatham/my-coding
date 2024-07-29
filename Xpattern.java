import java.util.*;
class Xpattern{
    public static void main(String args[]){
        int row=10;
       for(int i=1;i<=row;i++){
        for(int j=1;j<=row;j++){
            if(i==j||i+j==row)
                System.out.print(j);
            else
                System.out.print(" ");
        }
        System.out.println();
       }

    }
}