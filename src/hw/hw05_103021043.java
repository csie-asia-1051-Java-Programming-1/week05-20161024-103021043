package hw;
/*
 * Topic:有一 n x n的矩陣(1＜n＜21)，輸入 n 後，試以程式繪出此一方陣，方陣結構如下，例如 n=5 時：
 * Date: 2016/10/24
 * Author: 103021043 何宙運
 */
import java.util.Scanner;
public class hw05_103021043 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入方陣大小n:");
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
