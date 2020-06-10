package Task_05_Articles_v20;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        List<Article> data = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            String[] consoleInput = sc.nextLine().split(", ");

            String title = consoleInput[0];
            String content = consoleInput[1];
            String author = consoleInput[2];

            Article article = new Article(title, content, author);

            data.add(article);
        }
        String sortBy = sc.nextLine().toLowerCase();

        switch (sortBy) {
            case "title":
                data.stream().sorted(Comparator.comparing(Article::getTitle))
                        .forEach(System.out::println);
                break;
            case "content":
                data.stream().sorted(Comparator.comparing(Article::getContent))
                        .forEach(System.out::println);
                break;
            case "author":
                data.stream().sorted(Comparator.comparing(Article::getAuthor))
                        .forEach(System.out::println);
                break;
        }
    }
}
