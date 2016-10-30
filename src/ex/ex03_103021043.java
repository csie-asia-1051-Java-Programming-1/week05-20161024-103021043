package ex;
/*
 * Topic: 讓使用者輸入一正整數 n，並輸出 2^1+2^2+2^3+...+2^n 的值。
 * Date: 2016/10/24
 * Author: 103021043 何宙運
 */
import java.util.Scanner;
public class ex03_103021043 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner scn=new Scanner(System.in);
          System.out.print("n：");
          int a = scn.nextInt();
          int n,b=0,sum=0;
          for(n=1;n<=a;n++){
	            b=(int)Math.pow(2,n);
	              sum=sum+b;
           }
           System.out.print("2^1+2^2+2^3+...+2^n="+sum);
	}
}
