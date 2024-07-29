import java.util.*;
import java.io.*;
import java.math.*;
import java.text.*;
class pointvaluesandpercentagecal{
    	public static void main(String [] args) {
		double branding,travel,food,logistics,sum = 0.00;
		DecimalFormat d  = new DecimalFormat("0.00");
		Scanner sc=new Scanner(System.in);
		branding = sc.nextDouble();
		travel = sc.nextDouble();
		food = sc.nextDouble();
		logistics = sc.nextDouble();
		sum = branding+travel+food+logistics;
        System.out.printf(" total "+"%.2f\n",sum);
		System.out.println("Total expenses : Rs." +d.format(sum));
		System.out.println("Branding expenses percentage : " +d.format((branding/sum)*100) +"%");
		System.out.println("Travel expenses percentage : "+d.format((travel/sum)*100) +"%");
		System.out.println("Food expenses percentage : "+d.format((food/sum)*100) +"%");
		System.out.println("Logistics expenses percentage : "+d.format((logistics/sum)*100) +"%");
	}
}
