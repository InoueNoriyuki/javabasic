package practice02;
/*
 * PTra02_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra02_06 {
	public static void main(String[] args) {
		int x =10;
		int y =50;

		System.out.println(x);
		System.out.println(y);
		// ★ 変数 x, y の値をリテラルの数字を使わずに入れ替えてください
		// ※プログラムは何行書いても良いです
		int z = x;
		x = y;
		y = z;


		// ここから下は修正しないでください
			// 「x:50」が出力される
		// 「y:10」が出力される
		System.out.println(x);
		System.out.println(y);
	}
}
