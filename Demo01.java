package day03;
import java.util.Scanner;
public class Demo01 {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	System.out.println("��������������������a,b(�Կո������");
	int a = scan.nextInt(); 
	int b = scan.nextInt();
	int max= a>b?a:b;
	if(a>b){
		System.out.println("���ֵΪ"+a);
	}
	System.out.println("���ֵΪ"+b);
	
		

	}

}
