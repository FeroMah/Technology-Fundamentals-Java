import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class task_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> inputMessage = Arrays.stream(sc.nextLine().split("\\s"))
                .map(String::toString).collect(Collectors.toList());

        String[] inputCommands = sc.nextLine().split("\\s+");
        String isItStop = inputCommands[0];

        while (!isItStop.equalsIgnoreCase("Stop")) {
            String command = inputCommands[0].toLowerCase();

            switch (command) {
                case "delete":
                    int index = Integer.parseInt(inputCommands[1]);
                    if (index + 1 < inputMessage.size() && index + 1 >= 0) {
                        inputMessage.remove(index + 1);
                    }
                    break;

                case "swap":
                    String word1 = inputCommands[1];
                    String word2 = inputCommands[2];
                    if (inputMessage.contains(word1) && inputMessage.contains(word2)) {
                        int temp1 = inputMessage.indexOf(word1);
                        int temp2 = inputMessage.indexOf(word2);
                        inputMessage.set(temp1, word2);
                        inputMessage.set(temp2, word1);
                    }

                    break;
                case "put":
                    String word = inputCommands[1];
                    int wordIndex = Integer.parseInt(inputCommands[2]);
                    if (wordIndex - 1 >= 0 && wordIndex - 1 <= inputMessage.size()) {
                        inputMessage.add(wordIndex - 1, word);
                    }
//                    else if ()

                    break;
                case "sort":
                    inputMessage.sort(Collections.reverseOrder()); // or use this:  Collections.sort(inputMessage,Collections.reverseOrder());
                    break;
                case "replace":
                    String wordReplace1 = inputCommands[1];
                    String wordReplace2 = inputCommands[2];
                    if (inputMessage.contains(wordReplace2)) {
                        int indexReplace = inputMessage.indexOf(wordReplace2);
                        inputMessage.set(indexReplace, wordReplace1);
                    }
                    break;
            }

            inputCommands = sc.nextLine().split("\\s+");
            isItStop = inputCommands[0].toLowerCase();
        }

        for (int i = 0; i < inputMessage.size(); i++) {
            System.out.print(String.format("%s ", inputMessage.get(i)));
        }
    }
}
