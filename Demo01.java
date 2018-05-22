package day03;
import java.util.Scanner;
public class Demo01 {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	System.out.println("请依次输入两个整数：a,b(以空格隔开）");
	int a = scan.nextInt(); 
	int b = scan.nextInt();
	int max= a>b?a:b;
	if(a>b){
		System.out.println("最大值为"+a);
	}
	System.out.println("最大值为"+b);
	
		

	}

}
