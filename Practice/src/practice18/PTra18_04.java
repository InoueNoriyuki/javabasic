/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */


		ArrayList<Player> array = new ArrayList<>();

		try (Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"));) {
			while (scanner.hasNext()) {
				Player player = new Player();

				String line = scanner.nextLine();
				String[] pArray = line.split(",");
				player.setPosition(pArray[0]);
				player.setName(pArray[1]);
				player.setCountry(pArray[2]);
				player.setTeam(pArray[3]);

				array.add(player);
			}


		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
				Collections.shuffle(array);

				for(Player player:array) {
					if(player.getPosition().equals("GK")) {
						System.out.println(player);
						break;
					}
				}

				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}

}


