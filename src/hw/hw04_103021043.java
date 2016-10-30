package hw;
/*
 * Topic:讓使用者輸入一正整數n，計算1/(1*2)+1/(3*4)+1/(5*6)+…+1/[(2n-1)*(2n)]並輸出結果 
 * Date: 2016/10/24
 * Author: 103021043 何宙運
 */
import java.util.Scanner;
public class hw04_103021043 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        System.out.print("n：");
        int a = scn.nextInt();
        int n;
        double b=0,sum=0,c;
        for(n=1;n<=a;n++){
	        b=(((2*n)-1)*(2*n));
	        c=1/b;
	        sum=sum+c;
      }
	     System.out.print(sum);		
	   }
	}


