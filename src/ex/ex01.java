package ex;
import java.util.Scanner;
/*
 * Topic: 請寫一個函式 (不是遞迴) 進行十進制數字轉換成二進制數字，例如十進制的 13 會輸出二進制的 1101
 * Date: 2016/11/21
 * Author: 105021062 鄭雅韵
 */

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		fun1(n);
		

	}

	public static void fun1(int a) {
		// TODO Auto-generated method stub
		String num = " ";
		while (a != 0) {
			num = a % 2 + num;
			a = a / 2;

		}
		System.out.println(num);
	}

}
