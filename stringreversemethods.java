import java.util.*;
class stringreversemothods{
    public static void main(String args[]){
       
       
       // FIRST METHOD
       String a1="hello every one";
       char[] s=a1.toCharArray();
       for(int i=s.length-1;i>=0;i--){
        System.out.print(s[i]);
       }
       System.out.println();

       // SECOND METHOD
       String a2="hello every one";
       for(int i=a2.length()-1;i>=0;i--){
       System.out.print(a2.charAt(i));
       }
       System.out.println();
      
       //THIRD METOHD
       String a3="hello every one";
       StringBuffer b=new StringBuffer(a3);
       System.out.println(b.reverse());

       //FOURTH METOHD
       String a4="hello every one";
       StringBuilder c=new StringBuilder(a4);
       System.out.print(c.reverse());
       System.out.println();
}
}