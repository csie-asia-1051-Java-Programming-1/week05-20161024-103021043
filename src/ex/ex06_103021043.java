package ex;
/*
 * Topic: 某個陣列中含有所有學生的學號，但並沒有按照大小次序排列。請寫一程式依學號大小排列並將結果輸出。
 * Date: 2016/10/24
 * Author: 103021043 何宙運
 */

public class ex06_103021043 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={39,79,43,51,123,10,44};
		int t;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
	
		for(int k=0;k<a.length;k++){
			System.out.println(a[k]);
		}
	
	}

}
