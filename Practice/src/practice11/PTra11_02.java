package practice11;
/*
 * PTra11_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra11_02 {
	public static void main(String[] args) {

		// ★ ReadFileClassのクラスメソッドreadBookDataFile()を使い、本情報を取得します
		FileReaderClass.readBookDataFile();


		System.out.println("探したい本のタイトル（又はその一部）を入力してください");
		Book book = new Book("スッキリわかるJava入門","中山清喬／国本大悟",2600,657, "インプレス");




		// ★ ユーザが入力した文字列が、本情報のタイトル一部に含まれていた場合は、その本情報を出力してください
		System.out.println(book.dispBookInfo());
	}
}
