package game_score.controller;

import java.util.Scanner;

import game_score.service.PlayerManager;

public class AppController {
	public void runApp() {
		Scanner scanner = new Scanner(System.in);
		PlayerManager playerManager = new PlayerManager();
		
		while(true) {
			System.out.println("■ゲームスコア管理アプリ■");
			System.out.println("MENU");
			System.out.println("1：" + "プレイヤースコア登録");
			System.out.println("2：" + "スコア一覧表示");
			System.out.println("3：" + "プレイヤー検索");
			System.out.println("4：" + "アプリ終了");
			System.out.println();
			
			int ope = scanner.nextInt();
			
			switch(ope) {
			case 1:
				System.out.println("プレイヤースコア登録");
				System.out.println("プレイヤー名を入力してください");
				String playerName = scanner.next();
				
				System.out.println("スコアを入力してください");
				int score = scanner.nextInt();
				
				playerManager.registPlayer(playerName, score);
				System.out.println("登録完了しました");
				System.out.println();
				break;
			case 2:
				playerManager.playerRanking();
				System.out.println();
				break;
			case 3:
				System.out.println("検索したいプレイヤー名を入力してください");
				String searchPlayerName = scanner.next();
				playerManager.searchPlayerByName(searchPlayerName);
				System.out.println();
				break;
			case 4:
				System.out.println("アプリを終了します。");
				return;
			default :
				System.out.println("不正な入力です。アプリを終了します。");
				break;
			}
		}
	}
}
