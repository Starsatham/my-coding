import java.util.*;
public class palindrom {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter a string :");
        String a=s.nextLine().toLowerCase().replaceAll("\s","");
        int count=1;
        for(int i=0;i<a.length()-1;i++){
            for(int j=a.length()-1-i;j>0;j--){
                if(a.charAt(i)==a.charAt(j)){
                    count++; 
                    break;
           }
        }
    }if(count==a.length()){
        System.out.println(a+" is pali.."+count);
    }else
       System.out.println(a+" is not pali...");
    }
}
