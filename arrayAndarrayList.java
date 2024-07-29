import java.util.*;
class arrayAndarrayList{
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("enter a array value :");
    int a=s.nextInt();
    int[] ar=new int[a];
    System.out.println("enter values");
    for(int i=0;i<a;i++){
        ar[i]=s.nextInt();
        System.out.print(" "+ar[i]);
    }
    System.out.println(" is before sort");
    Arrays.sort(ar);
    for(int i=0;i<a;i++){
        
        System.out.print(ar[i]+" ");
    }
    System.out.println(" is after sort ");
    for(int i=a-1;i>=0;i--){
        System.out.print(ar[i]+" ");
    }
    System.out.println(" it is decending order...");
    for(int i=0;i<a;i++){
        for(int j=i+1;j<a;j++){
            if(ar[i]==ar[j]){
                ar[j]=-0;
            }
        }
    }
    for(int i=0;i<a;i++){
        if(ar[i]!=-0){
           System.out.print(ar[i]+ " ");
        }
    }
    System.out.println("remove duplicates ");

   //public static void swap(StringBuilder sb,int i,int j)
   //{
//      char temp=sb.charAt(i);
//      sb.setCharAt(i, sb.charAt(j));
//      sb.setCharAt(j, temp);
//    }

//     public static void permutations(StringBuilder sb,int left,int right)
//     {
//         if(left==right)
//         {
//             System.out.println(sb.toString());
//             return;
//         }
//         for(int i=left;i<=right;i++)
//         {
//             swap(sb,left,i);
//             permutations(sb, left+1, right);
//             // System.out.println(sb.toString());
//             swap(sb,left,i);
//             // System.out.println(sb.toString());

//         }
//     }
//     public static void main(String ar[])
//     {

    // Scanner p=new Scanner(System.in);
    // String a=p.nextLine();
    // System.out.println();
    // StringBuilder sb=new StringBuilder(a);
    // permutations(sb,0,a.length()-1);


    //     ArrayList<Integer> al=new ArrayList<>(); 
    //     System.out.println("enter a array size :");
    //     Scanner s=new Scanner(System.in);
    //     int a=s.nextInt();
    //     int arr[]=new int[a];
    //     for(int i=0;i<a;i++){
         
    //          arr[i]=s.nextInt();
    //         //  arr.add(arr2[i]);
    //          //   arr[i]=s.nextInt();
    //          //System.out.print(arr[i]+" "); 
            
    //         }
    //         Arrays.sort(arr);
    //     // System.out.println();
    //    //  Arrays.sort(arr);
    //     for(int j=0;j<a;j++)
    //     {   
    //        al.add(arr[j]);  
    //     }
    //     // System.out.println();
    //     System.out.println(al);
    }
}