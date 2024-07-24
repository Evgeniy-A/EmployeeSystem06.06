package search;

public class Document implements Searchable {

    private String content;

    public Document(String content) {
        this.content = content;
    }

    @Override
    public boolean search(String line) {
        return content.contains(line);
    }
}
