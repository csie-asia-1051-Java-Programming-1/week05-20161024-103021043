package hw;
/*
 * Topic:�]�p�@�ӵ{���A���ϥΪ̿�J�@�ӥ����n�A�P�_�ÿ�Xn���h�֦���~�|�j��10000 
 * Date: 2016/10/24
 * Author: 103021043 ��z�B
 */
import java .util.Scanner;
public class hw03_103021043 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int sum=1;
System.out.println("�п�J�@�ӥ����n:");
int n=scn.nextInt();
for(int i=1;i<10000;i++){
	sum=n*sum;
	if(sum>10000){
		System.out.print("n��"+i+"����|�j��10000");
		i=10001;
		break;
		
	}
}
	}

}
