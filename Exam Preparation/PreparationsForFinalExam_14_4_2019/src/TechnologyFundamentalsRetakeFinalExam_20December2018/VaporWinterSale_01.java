package TechnologyFundamentalsRetakeFinalExam_20December2018;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class VaporWinterSale_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputOfGames = sc.nextLine().split(", ");

        Map<String, Double> gameAndPrice = new LinkedHashMap<>();
        Map<String, String> gameAndDLC = new LinkedHashMap<>();

        for (int i = 0; i < inputOfGames.length; i++) {
            if (inputOfGames[i].contains("-")) {
                String[] gameInfo = inputOfGames[i].split("-");
                String gameName = gameInfo[0];
                double gamePrice = Double.parseDouble(gameInfo[1]);
                gameAndPrice.putIfAbsent(gameName, gamePrice);

            } else if (inputOfGames[i].contains(":")) {
                String[] gameInfo = inputOfGames[i].split(":");
                String gameName = gameInfo[0];
                String gameDLC = gameInfo[1];

                if (gameAndPrice.containsKey(gameName)) {
                    gameAndDLC.put(gameName, gameDLC);
                    double newDLCPrice = gameAndPrice.get(gameName) + gameAndPrice.get(gameName) * 0.2;
                    gameAndPrice.put(gameName, newDLCPrice);
                }
            }
        }
// Discounts 20%no DLC and 50% with DLC;
        for (Map.Entry<String, Double> game : gameAndPrice.entrySet()) {
            if (gameAndDLC.containsKey(game.getKey())) {
                gameAndPrice.put(game.getKey(), game.getValue() * 0.5);
            } else {
                gameAndPrice.put(game.getKey(), game.getValue() * 0.8);
            }
        }

        gameAndPrice.entrySet().stream().sorted((a, b) -> Double.compare(a.getValue(), b.getValue())).forEach(e -> {
            if (gameAndDLC.containsKey(e.getKey())) {
                System.out.println(String.format("%s - %s - %.2f", e.getKey(), gameAndDLC.get(e.getKey()), e.getValue()));
            }
        });
        gameAndPrice.entrySet().stream().sorted((a, b) -> Double.compare(b.getValue(), a.getValue())).forEach(e -> {
            if (!gameAndDLC.containsKey(e.getKey())) {
                System.out.println(String.format("%s - %.2f", e.getKey(), e.getValue()));
            }
        });
    }
}
