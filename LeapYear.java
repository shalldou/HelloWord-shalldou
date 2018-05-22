package day03;
import java.util.Scanner;//import java.util.Scanner;//import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		//判断平年还是闰年
		Scanner scan = new Scanner(System.in);
		System.out.println("年份");
		int year = scan.nextInt();
		boolean flag = (year%4==0&&year%100!=0)||year%400==0;
		String str=flag?year+"":year+"";
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = scan.nextInt();
		boolean flag = (year%4 == 0&& year%100 != 0)||year%400== 0;
		String   str = flag ?year+"是闰年":year+"是平年";
		System.out.println(str);
		
		
		
		
		
		
		
		
		
		/*Scanner scan = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = scan.nextInt();
		boolean flag = (year%4 == 0 && year%100 != 0)||year%400 == 0;
	String str = flag?year+"是闰年":year+"不是闰年";
	System.out.println(str);
	
	//boolean i = (year%4 == 0 && year%100 != 0)||year%400==0;
	//String m = i?year+"是闰年":year+"不是闰年";
*/
	}

}
