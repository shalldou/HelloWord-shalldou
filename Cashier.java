package day03;
import java.util.Scanner;//import java.util.Scanner;
public class Cashier {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入单价：");
		double price = scan.nextDouble();
		System.out.println("请输入数量：");
		double amount = scan.nextDouble();
		System.out.println("请输入金额");
		double money = scan.nextDouble();
		double total = price*amount;
		if(total>=500){
			total *= 0.8;
		}
		if(money>=total){
			System.out.println("应收金额："+total+"，找零为："+(money-total));
		}else{System.out.println("ERROR");
			
		}
		
		
		
		
	/*Scanner scan = new Scanner(System.in);//Scanner scan = new Scanner(System.in)
	System.out.println("请输入单价：");
	double price = scan.nextDouble();//double price = scan.nextDouble();
	System.out.println("请输入数量：");
	int amount = scan.nextInt();//int amount = scan.nextInt();
	System.out.println("请输入金额：");
	double money = scan.nextDouble();//double money = scan.nextDouble();
	double total =price*amount;
	if(total>=500){//if(total>=500){
		total *= 0.8;//total*=0.8
		//}
	}
	if(money>total){
		double change = money-total;
		System.out.print("应收金额："+ total+",找零为："+change);
	}else{
		System.out.println("ERROR!你给的钱不够，还差："+(total-money));
	}
	
	
//System.out.printtln("应收金额："+total+"找零为:"+change);
	
	
*/
	}

}
