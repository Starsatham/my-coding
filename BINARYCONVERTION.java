import java.util.*;
public class BINARYCONVERTION
{
    public static void main(String args[])
    {
        System.out.println("\t ");
        long  b1,b2;
        int i=0,rem=0;
        int[] sum=new int[20];
        Scanner s=new Scanner(System.in);
         System.out.println("enter A value: ");
         b1=s.nextLong();
         System.out.println("enter B value: ");
         b2=s.nextLong();
         while(b1!=0||b2!=0)
         {
            sum[i++]=(int)((b1%10+b2%10+rem)%2);
            rem=(int)((b1%10+b2%10+rem)/2);
            b1=b1/10;
            b2=b2/10;
         }
         if(rem!=0)
         {
            sum[i++]=rem;
         }
         i--;
         System.out.println("sum of 2 binary");
         while(i>=0){
            System.out.print(sum[i--]);
         }
         System.out.println("\n ");
         }
}
