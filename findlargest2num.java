import java.util.*;
public class findlargest2num {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ënter the erray size :");
        int a=s.nextInt();
        int [] arr=new int[a];
        System.out.println("enter array values :");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
            System.out.print(arr[i]+" ");
            }
            System.out.println();
        int firstlarge=Integer.MIN_VALUE;
        int secondlarge=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>firstlarge){
                secondlarge=firstlarge;
                firstlarge=arr[i];
            }else if(arr[i]>secondlarge&&arr[i]!=firstlarge){
                secondlarge=arr[i];
            }
            }
            if(secondlarge==Integer.MIN_VALUE){
            System.out.println("there is no 2nd largest number...");
            }else
            System.out.println("second large number "+secondlarge);
            
        }
    }
    
