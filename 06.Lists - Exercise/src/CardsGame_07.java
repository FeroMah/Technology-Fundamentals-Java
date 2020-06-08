import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> handOne = Arrays.stream(sc.nextLine().split(" "))
                .map(String::toString)
                .collect(Collectors.toList());
        List<String> handTwo = Arrays.stream(sc.nextLine().split(" "))
                .map(String::toString)
                .collect(Collectors.toList());

        while (handOne.size() != 0 && handTwo.size() != 0) {
            int playerOneCard = Integer.parseInt(handOne.get(0));
            int playerTwoCard = Integer.parseInt(handTwo.get(0));
            if (playerOneCard > playerTwoCard) {
                handOne.add(handOne.get(0));
                handOne.remove(0);
                handOne.add(handTwo.get(0));
                handTwo.remove(0);

            } else if (playerOneCard < playerTwoCard) {
                handTwo.add(handTwo.get(0));
                handTwo.remove(0);
                handTwo.add(handOne.get(0));
                handOne.remove(0);

            } else if (handOne.get(0).equals(handTwo.get(0))) {
                handOne.remove(0);
                handTwo.remove(0);
            }
        }
        int sum = 0;
        if (handOne.size() == 0) {
            for (String card : handTwo) {
                int cardValue = Integer.parseInt(card);
                sum += cardValue;
            }
            System.out.println(String.format("Second player wins! Sum: %d", sum));

        } else {
            for (String card : handOne) {
                int cardValue = Integer.parseInt(card);
                sum += cardValue;
            }
            System.out.println(String.format("First player wins! Sum: %d", sum));
        }
    }
}
