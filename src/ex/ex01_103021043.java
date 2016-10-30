package ex;
/*
 * Topic: 讓使用者輸入一正整數n，用for迴圈計算n!後輸出。
 * Date: 2016/10/24
 * Author: 103021043 何宙運
 */
import java.util.Scanner;
public class ex01_103021043 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a=1,i,b;
		for (b=0;b>=0;b--){
		System.out.print("n:");
		int n=scn.nextInt();
		for (i=n;i>0;i--)
		{
			a=a*i;
			}
		System.out.println(n+"! 值="+a);	
      }
   }
}
