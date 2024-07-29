import java.util.*;
class arrayprogram {
   
    public static void main(String args[])
    {   
      int count=1;
      Scanner p=new Scanner(System.in);
      System.out.println("enter a string: ");
      String ss=p.nextLine();
    //  for(int i=0;i<ss.length()-1;i++)
     for(int i=0,j=ss.length()-1;i<ss.length()-1&&j>=0;i++,j--)
      {
     //   for(int j=ss.length()-i-1;j>=0;j--)
      
            if(ss.charAt(i)==ss.charAt(j))
            {
             count++;
          //   break;
            }
          }
        System.out.println(count);
        if(count==ss.length())
        {
        System.out.print(ss+" is palindrome..");}
        else{
        System.out.print(ss+"is not palindrom..");
        }
      // int a=p.nextInt();
   //   int arr2[]=new int[a];
      // char arr[]=new char[a];
      // for(int i=0;i<a;i++)
      // { 
      //   arr2[i]=p.nextInt();
      //   // arr[i]=p.next().charAt(0);
      //   // System.out.println(arr[i]);
      // }
      // Arrays.sort(arr2);
  
      //
      //


      // int m=arr2.length/2;
      // if(m%2==0)
      // System.out.print(arr2[m-1]);

      //  else
      //  System.out.print(arr2[m]);

        //  arr2[i]=p.nextInt();
        // arr[i]=p.next().charAt(0);
        // System.out.println(arr[i]);
      

      // System.out.println(arr[1]);
      // char c=p.next().charAt(0);

      // System.out.println(c);
      // String arr[]=new String[a];
      // int arr2[]=new int[a];
      // char arr3[]=new char[a];
      // double arr23[]=new double[a];
      
      // for(int i=0;i<a;i++)
      // {
      //   // arr[i]=p.nextLine();

      //   // arr2[i]=p.nextInt();
      //   arr3[i]=p.next().charAt(0);
      //   System.out.println(arr3);

      // }
         // String ch="apple,ball,Zoo,queen";
          //char[] arr=ch.toCharArray();
         
      //  for(int i=0;i<=arr.length-1;i++){
            
            //if(arr[i]%2!=0)
            // if(arr[i]>9&&arr[i]<100)
            //  if(arr[i]%10==0)
 
            //System.out.printf("%.2f\n",Math.sqrt(arr[i]));
            //System.out.printf("%.2f\n",Math.pow(arr[i],2));1
       
            //double sum=0;
         // int count=0;
            // double prod=1;
           // System.out.print("[");
            //for(int i=0;i<=arr.length-1;i++){
              //  if(arr[i]>=10&&arr[i]<=99){
              //  if(arr[i]>=0){
              //      sum=sum+arr[i];
              //   }
              // System.out.println(i+1+" "+arr[i]+" "+(int)arr[i]);
             // if(!Character.isSpaceChar(arr[i]))
               //  System.out.print(arr[i]);
          
            //    char a=arr[i].charAt(0);
            // a=Character.toUpperCase(a);
            // String b=arr[i].substring(1);
            // System.out.println(a+b);
 
            // char a=arr[i].charAt(0);
            // int len=arr[i].length();
            // char b=arr[i].charAt(len-1);
            // String s=arr[i].substring(1,len-1);
            // System.out.println(b+s+a);
          
          
            // for(int i=arr.length-1;i>=0;i--){
            //   System.out.print(arr[i]+" ");
            // }
            
            //   System.out.println();
            //   if(arr[i]%10==5){
            //     count++;
            //   }
            //   else{
            //     //prod=prod*arr[i];
            //     //count++;
            //   }
            // }
            // System.out.print(count);
            // if(arr[i]>=0){
            //    System.out.print(arr[i]+", ");
            // }
            // }
            // System.out.println("]");
            // System.out.printf("%.2f\n",sum);
        }
      }
   
  