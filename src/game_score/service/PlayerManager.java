package game_score.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import game_score.model.Player;

public class PlayerManager {
	List<Player> players = new ArrayList<>();
	
	public void registPlayer(String playerName, int score) {
		Player player = new Player(playerName, score);
		players.add(player);
	}
	
	public void playerRanking() {
		Collections.sort(
	            players, 
	            new Comparator<Player>() {
	                @Override
	                public int compare(Player player1, Player player2) {
	                    return player1.getScore() - player2.getScore();
	                }
	            }
	        );
		
		for(Player player: players) {
			System.out.println(player);
		}
 	}
	
	public void searchPlayerByName(String playerName) {
		Stream<Player> stream = players.stream();
		List<Player> searchPlayer = stream.filter(player -> player.getPlayerName().contains(playerName))
											.collect(Collectors.toList());
		System.out.println("--検索結果--");
		for(Player player: searchPlayer) {
			System.out.println(player.getPlayerName());
		}
	}
}
