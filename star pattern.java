import java.util.*;
class demo {
	public static void main(String [] args) {
		int row=5;
		for(int i=1;i<=row-1;i++){
			for(int j=5;j>=i;j--){
				System.out.print(" ");
			}
			for(int n=1;n<=i;n++){
				System.out.print("*");
			}
		System.out.println();
		 }
		 for(int k=1;k<=row;k++){
			for(int m=1;m<=k;m++){
				System.out.print(" ");
		}
		for(int g=row;g>=k;g--){
			System.out.print("*");
		}
		System.out.println();
		}
		
	}
}
