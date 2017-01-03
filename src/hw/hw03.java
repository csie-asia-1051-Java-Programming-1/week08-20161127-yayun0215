package hw;
import java.util.Scanner;
/*
 * Topic: 請寫一個遞迴程式，輸入一個 int 型態的資料，並回傳該資料在二進制下有多少個位元是 1，例如: 輸入 13 得到結果為 3
 * Date: 2016/11/21
 * Author: 105021062 鄭雅韵
 */
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		System.out.println(fun(n,1));

	}
	public static int fun(int q,int w) {
		if (q < Math.pow(2,w)) {
			return w-1;
		} else {
			w++;
			return fun(q,w);
		}

}
}
