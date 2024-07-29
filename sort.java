import java.lang.reflect.Array;
import java.util.*;
import java.util.Arrays;
class sort{
 public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the array size ");
    int size=s.nextInt();
   String a=s.nextLine();// int a=s.nextInt();
    String[] arr=new String[size];//int[] arr=new int[a];
    System.out.println("enter the array values ");
    for(int i=0;i<size;i++){
        arr[i]=s.nextLine();//arr[i]=s.nextInt();
        System.out.println("Array value "+ i +" is : "+arr[i]+" ");
    }System.out.println();
    Arrays.sort(arr);
    System.out.println("After sorting array");
    for(int i=0;i<size;i++){
    System.out.print(arr[i]+" ");
    }
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
    