package Task_03_Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(", ");
        Article article = new Article();
        article.setTitle(input[0]);
        article.setContent(input[1]);
        article.setAuthor(input[2]);

        int numbOfChanges = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < numbOfChanges; i++) {
            String[] changeInput = sc.nextLine().split(": ");
            String action = changeInput[0].toUpperCase();
            String newChange = changeInput[1];
            String test="";

            switch (action) {
                case "EDIT":
                    article.editContent(newChange);
                    break;

                case "CHANGEAUTHOR":
                    article.changeAuthor(newChange);
                    break;

                case "RENAME":
                    article.rename(newChange);
                    break;
            }

        }
        System.out.println(article.getToString());
    }
}
