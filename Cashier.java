package day03;
import java.util.Scanner;//import java.util.Scanner;
public class Cashier {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�����뵥�ۣ�");
		double price = scan.nextDouble();
		System.out.println("������������");
		double amount = scan.nextDouble();
		System.out.println("��������");
		double money = scan.nextDouble();
		double total = price*amount;
		if(total>=500){
			total *= 0.8;
		}
		if(money>=total){
			System.out.println("Ӧ�ս�"+total+"������Ϊ��"+(money-total));
		}else{System.out.println("ERROR");
			
		}
		
		
		
		
	/*Scanner scan = new Scanner(System.in);//Scanner scan = new Scanner(System.in)
	System.out.println("�����뵥�ۣ�");
	double price = scan.nextDouble();//double price = scan.nextDouble();
	System.out.println("������������");
	int amount = scan.nextInt();//int amount = scan.nextInt();
	System.out.println("�������");
	double money = scan.nextDouble();//double money = scan.nextDouble();
	double total =price*amount;
	if(total>=500){//if(total>=500){
		total *= 0.8;//total*=0.8
		//}
	}
	if(money>total){
		double change = money-total;
		System.out.print("Ӧ�ս�"+ total+",����Ϊ��"+change);
	}else{
		System.out.println("ERROR!�����Ǯ���������"+(total-money));
	}
	
	
//System.out.printtln("Ӧ�ս�"+total+"����Ϊ:"+change);
	
	
*/
	}

}
