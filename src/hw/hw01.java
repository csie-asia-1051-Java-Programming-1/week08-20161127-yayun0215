package hw;
import java.util.Scanner;
/*
 * Topic: 請寫一個 遞迴函式)進行十進制數字轉換成二進制數字，例如十進制的 13 會輸出二進制的 1101
 * Date: 2016/11/21
 * Author: 105021062 鄭雅韵
 */
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(fun(n));

	}

	public static String fun(int a) {
		String num = " ";
		while (a != 0) {
			num = a % 2 + num;
			a = a / 2;

		}
		return num;
	}

}
