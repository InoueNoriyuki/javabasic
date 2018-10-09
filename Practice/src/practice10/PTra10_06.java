package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		Car[] car = new Car[3];

		Car car1 = new Car();

		Car car2 = new Car();

		Car car3 = new Car();

		car[0] = car1;
		car1.color = "blue";
		car1.gasoline = 200;

		car[1] = car2;
		car2.color = "green";
		car2.gasoline = 100;

		car[2] = car3;
		car3.color = "yerrow";
		car3.gasoline = 500;

		for (int i = 0; i < car.length; i++) {

			System.out.println("================" + car[i].color + "===================");

			final int distance = 300;

			int sum = 0;
			int n = 0;

			while (true) {
				int run = car[i].run();
				n++;

				if (run == -1) {
					System.out.println("目的地に到達できませんでした");
					break;
				}

				sum += run;
				System.out.println(sum);

				if (sum >= distance) {
					System.out.println("目的地まで" + n + "時間かかりました、残りのガソリンは" + car[i].gasoline + "リットルです");
					break;
				}
			}
		}

	}
}
