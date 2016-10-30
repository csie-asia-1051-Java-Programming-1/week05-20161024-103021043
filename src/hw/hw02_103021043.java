package hw;
/*
 * Topic:讓使用者輸入一正整數n，輸出1+2+3+…+m<=n的最大整數m=? 
 * Date: 2016/10/24
 * Author: 103021043 何宙運
 */
import java.util.Scanner;
public class hw02_103021043 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        System.out.print("n：");
        int a = scn.nextInt();
        int t=1;
        int i=1;
		while(a>t){
			i++;
			t=t+i;
			//System.out.println(i+","+t);    	
			}
		if(t==a){
			System.out.print("M："+i);	
		}
		else if(t!=a){
			System.out.print("M："+(i-1));	
		}
		
		}
	}
