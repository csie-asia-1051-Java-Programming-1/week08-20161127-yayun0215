package ex;
import java.util.Scanner;
/*
 * Topic: 將前一題加強成可以做10以下的各種數字系統轉換
 * Date: 2016/11/21
 * Author: 105021062 鄭雅韵
 */

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int m=scn.nextInt();
		fun1(n,m);

	}
	public static void fun1(int q,int w){
		if (w==2){
			System.out.println(Integer.toBinaryString(q));
		}else if(w==3){
			System.out.println(Integer.toString(q,3));
		}else if(w==4){
			System.out.println(Integer.toString(q,4));
	}else if(w==5){
		System.out.println(Integer.toString(q,5));

}else if(w==6){
	System.out.println(Integer.toString(q,6));
}else if(w==7){
	System.out.println(Integer.toString(q,7));
}else if(w==8){
	System.out.println(Integer.toString(q,8));
}else if(w==9){
	System.out.println(Integer.toString(q,9));
}
	}
}

	
