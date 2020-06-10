package Task_03_Articles;

public class Article {
    private String title;
    private String content;
    private String author;

    public void setContent(String content) {
        this.content = content;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void editContent(String newContent) {
        this.content = newContent;
    }

    public void changeAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public void rename(String newTitle) {
        this.title = newTitle;
    }

    public String getToString() {
        return String.format("%s - %s: %s", this.title, this.content, this.author);
    }
}
