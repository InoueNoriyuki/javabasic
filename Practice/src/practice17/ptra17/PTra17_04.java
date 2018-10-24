/*
 * PTra17_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice17.ptra17;

public class PTra17_04 {
	public static void main(String[] args) {



		/*
		 * ★ strに入っている文字列を1文字ずつゆっくり表示させるプログラムを完成させてください
		 * ※ Thread.sleep を使用すること
		 */

		char[] str =  new char[0];
		char[] = "スッキリわかるjava";
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				/* エラーが発生した場合はここにくる */

	}
		}
	}
}
