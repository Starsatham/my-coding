import java.util.*;
public class VowelAndCapsFind{
    public static void main(String[] args) {
        String vow="AEIOUaeiou";
        Scanner s=new Scanner(System.in);
        System.out.println("enter a string ");
        char[] c=s.nextLine().toCharArray();
         int count=0;
         
        for(char d:c){
            if (vow.indexOf(d)!=-1){
                count++;
                System.out.println(d+" is vowel ");
                
            }else
               System.out.println(d+" is not a vowel ");

        }
        System.out.println("total vowel count is "+count);

        char[] a=s.nextLine().toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i]>='A' && a[i]<='Z'){
                System.out.println(a[i]+" is capital latter ");
            }else
               System.out.println(a[i]+" is small latter");
        }
    }

}
