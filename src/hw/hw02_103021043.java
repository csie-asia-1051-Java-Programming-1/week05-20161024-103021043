package hw;
/*
 * Topic:���ϥΪ̿�J�@�����n�A��X1+2+3+�K+m<=n���̤j���m=? 
 * Date: 2016/10/24
 * Author: 103021043 ��z�B
 */
import java.util.Scanner;
public class hw02_103021043 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        System.out.print("n�G");
        int a = scn.nextInt();
        int t=1;
        int i=1;
		while(a>t){
			i++;
			t=t+i;
			//System.out.println(i+","+t);    	
			}
		if(t==a){
			System.out.print("M�G"+i);	
		}
		else if(t!=a){
			System.out.print("M�G"+(i-1));	
		}
		
		}
	}
