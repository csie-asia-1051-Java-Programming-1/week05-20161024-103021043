package hw;
/*
 * Topic:設計一個程式，讓使用者輸入一個正整數n，判斷並輸出n的多少次方才會大於10000 
 * Date: 2016/10/24
 * Author: 103021043 何宙運
 */
import java .util.Scanner;
public class hw03_103021043 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int sum=1;
System.out.println("請輸入一個正整數n:");
int n=scn.nextInt();
for(int i=1;i<10000;i++){
	sum=n*sum;
	if(sum>10000){
		System.out.print("n的"+i+"次方會大於10000");
		i=10001;
		break;
		
	}
}
	}

}
