package Task_05_Articles_v20;

public class Article {
    String title;
    String content;
    String author;

    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return String.format("%s - %s: %s",
                this.title, this.content, this.author);
    }
}
