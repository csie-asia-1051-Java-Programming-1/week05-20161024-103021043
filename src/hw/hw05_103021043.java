package hw;
/*
 * Topic:���@ n x n���x�}(1��n��21)�A��J n ��A�եH�{��ø�X���@��}�A��}���c�p�U�A�Ҧp n=5 �ɡG
 * Date: 2016/10/24
 * Author: 103021043 ��z�B
 */
import java.util.Scanner;
public class hw05_103021043 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("�п�J��}�j�pn:");
		int n=scn.nextInt();
		int k=1,m=2;
		for(int i=0;i<n;i++){
			if(i!=n-1){
				m=i+2;
		}else if(i==n-1){
			m=n;
			} 
	    int q=i+k;k=q;
		for(int j=0;j<n;j++){
		System.out.print(k+"\t");k+=m;
		if(j<(n-i-2)){m++;}
		else if(j>(n-i-2)){m--;}
	
		}System.out.println();k=q;
		}
	}

}
