package ex;
/*
 * Topic: 讓使用者輸入一正整數n，用while迴圈計算n!後輸出。
 * Date: 2016/10/24
 * Author: 103021043 何宙運
 */
import java.util.Scanner;
public class ex02_103021043 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n=0;
		int result=1;
		boolean flag=true;
		System.out.print("n:");
		while (flag){
			result=1;
			n=scn.nextInt();
			int i=n;
			while(i>0){
				result=result*i;
				i--;
				}
			System.out.print(n+"！ 值="+result);
			}
		}
	}
