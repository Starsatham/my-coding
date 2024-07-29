import java.lang.reflect.Array;
import java.util.*;
class simple{
 public static void main(String[] args) {
 
    String vow="AEIOUaeiou";
            //System.out.println(q);
        Scanner s= new Scanner(System.in);
        System.out.println("enter a String :");
      // String a=s.nextLine();
        char[] c=s.nextLine().toCharArray();
       // for(int i=0;i<b.length;i++)
       for(char d:c) 
       {
        if(vow.indexOf(d)!=-1) //if(b[i]>=65 && b[i]<=90)
        {
            System.out.println(d + " is vowels...");
         //   System.out.println(b[i]+" it is a Capital latter ");
        }
       // else if(b[i]>='a' && b[i]<='z')
       // {

          //  System.out.println(b[i]+" it is a Samll latter ");
       // }
        else
        {
            System.out.println(d+ " is not a vowel...");
           //     System.out.println(b[i]+" is NOt a Letter");
        }
        }  
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
    // System.out.println("enter a string :");
    // char b[]=s.nextLine().toCharArray();
    // for(int i=b.length-1;i>=0;i--){
    //     System.out.print(b[i]);
    // }
    // System.out.println();
    // System.out.println("enter new string ");
    // String a=s.nextLine();
    // StringBuilder sb=new StringBuilder(a);
    // sb.reverse();
    // System.out.println(sb);

    
    
    
    
    // System.out.println("enter the values ");
    // int a=s.nextInt();
    // ArrayList<Integer> arr=new ArrayList<>();
    // for(int i=0;i<a;i++){
    //     int b=s.nextInt();
    //     arr.add(b);
    // }System.out.println("before sort "+arr);
    // Collections.sort(arr); 
    // System.out.println("after sort "+arr);
    // ArrayList<Integer> du=new ArrayList<>();
    // System.out.println(" before eliminate duplicate "+arr);
    // for(int check:arr){
    //     if (!du.contains(check))
    //         du.add(check);
    //     else
    //          System.out.println("not found duplicate");
    // }
    // System.out.println("after eliminate duplicate"+du);



    
    // String s="satham hussain aa satham";
    // String arr[]=s.split("s");
    // System.out.println(arr.length); 
    // for(int i=0;i<arr.length;i++){
    //   System.out.println(arr[i]);//s-split-s 
    // }
   // char c[]=s.toLowerCase().toCharArray();
    // System.out.println(s);
    //int count=1;
    // for(int i=0;i<arr.length;i++)
    // {
    //     int count=1;
    //     for(int j=i+1;j<arr.length;j++)
    //     {
    //         //System.out.println(arr[j]);
    //       if(arr[i].equals(arr[j]))
    //          {
    //              count++;
    //              arr[j]="++";//"ds-0----"
    //          }
    //      }
    //     //  System.out.println(count);
    //      if(arr[i]!="++")
    //      {
    //          System.out.println(arr[i]+" - "+count);
    //          // conut++;
    //      }    
    // }
//      Scanner s=new Scanner(System.in);
//     ArrayList<Integer> arr=new ArrayList<>();
//     // int k;
//     for(int i=0;i<5;i++)
//     {
//         int k=s.nextInt();
//         arr.add(k);
//     }
//     System.out.println(arr);
//      ArrayList<Integer> dup=new ArrayList<>();
//     for(int item:arr)
//     {
//         if(!dup.contains(item))
//         {
//             dup.add(item);
//         }

//     }
//     System.out.println(dup);

// //    System.out.println("enter finding key value:");
  
   
 }
}
    