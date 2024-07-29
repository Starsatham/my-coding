import java.util.*;
import java.math.*;
class ArraylistAndduplicate{
public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     System.out.println("enter a number :");
     
     System.out.println("Enter The Size of The Set");
     int a=s.nextInt();
    ArrayList<Integer> arr=new ArrayList<>();
    // int k;
    for(int i=0;i<a;i++)
    {
        int k=s.nextInt();
        arr.add(k);
    }
    ArrayList<Integer> dup=new ArrayList<>();
    for(int item:arr)
    {
        if(!dup.contains(item))
        {
            dup.add(item);
        }
        
    }
    // BigInteger bi=new BigInteger("1");
    // for(int i=1;i<=5;i++)
    // {
    //    bi=bi.multiply(BigInteger.valueOf(i));
    // }
    // System.out.println(bi);
    // Set<Integer> set=new HashSet<Integer>(arr);
    // System.out.println(set);
    // set.add(1);
    // set.add(2);
    // System.out.println(arr);
    // System.out.println(dup);
    // arr.clear();
    // Set<Integer> set=new HashSet<>();
    //  for(int i=0;i<a;i++)
    //  {
    //     set.add(s.nextInt());
    //  }
    //     set.clear();
    //     System.out.println(set);

   //  Set<Character> tset=new HashSet<>();
   //  tset.add('1');
   //  tset.add('f');
   //  tset.add('5');
   //  tset.add('2');
   //  tset.add('a');
   //  tset.add('a');
    //  tset.removeAll(tset);
    // tset.clear();
//    System.out.println(tset);
    // HashMap<String,Integer> hm=new HashMap<>();
    // for(int i=0;i<a;i++)
    // {
    //     String n=s.nextLine();
    //     int m=s.nextInt();
    //     hm.put(n, m);
    // }
    // hm.put("Jameer", 10);
    // hm.put("James", 11);
    // hm.put("Jackie", 15);
    // System.out.println(hm);
    // System.out.println(hm.values());
    // for(String str:hm.keySet())
    // {
    //     System.out.println(str+" - "+hm.get(str));
    // }
    //    System.out.println("enter finding key value:");
 }
}
    