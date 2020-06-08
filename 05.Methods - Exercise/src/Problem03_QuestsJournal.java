import java.util.Scanner;

public class Problem03_QuestsJournal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputConsole = sc.nextLine();
        int inputQuestCount = getNumberOfStartingQuests(inputConsole);

        String[] inputQuests = getStartQuests(inputConsole, inputQuestCount);
        String newInput = sc.nextLine();
        String[] newLine = newInput.split(" - ");
        String command = newLine[0];
        String quest = newLine[1];

        while (!command.equals("Retire!")) {

            System.out.println();
        }
    }

    static int getNumberOfStartingQuests(String input) {
        int countQuests = 1;
        for (int i = 0; i < input.length(); i++) {
            String currentSymbol = String.valueOf(input.charAt(i));
            if (",".equals(currentSymbol)) {
                countQuests++;
            }
        }
        return countQuests;

    }

    static String[] getStartQuests(String inputString, int questCount) {
        String[] startQuests = new String[questCount];
        int indexQuest = 0;
        String quest = "";
        for (int i = 0; i < inputString.length(); i++) {
            String symbol = String.valueOf(inputString.charAt(i));
            if (!",".equals(symbol)) {
                quest += symbol;
            } else {
                startQuests[indexQuest++] = quest;
                quest = "";
            }
        }
        return startQuests;

    }
}
