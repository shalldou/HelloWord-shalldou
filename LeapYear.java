package day03;
import java.util.Scanner;//import java.util.Scanner;//import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		//�ж�ƽ�껹������
		Scanner scan = new Scanner(System.in);
		System.out.println("���");
		int year = scan.nextInt();
		boolean flag = (year%4==0&&year%100!=0)||year%400==0;
		String str=flag?year+"":year+"";
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year = scan.nextInt();
		boolean flag = (year%4 == 0&& year%100 != 0)||year%400== 0;
		String   str = flag ?year+"������":year+"��ƽ��";
		System.out.println(str);
		
		
		
		
		
		
		
		
		
		/*Scanner scan = new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year = scan.nextInt();
		boolean flag = (year%4 == 0 && year%100 != 0)||year%400 == 0;
	String str = flag?year+"������":year+"��������";
	System.out.println(str);
	
	//boolean i = (year%4 == 0 && year%100 != 0)||year%400==0;
	//String m = i?year+"������":year+"��������";
*/
	}

}
