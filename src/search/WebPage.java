package search;

public class WebPage implements Searchable{

    private String url;
    private String text;

    public WebPage(String url, String text) {
        this.url = url;
        this.text = text;
    }
    @Override
    public boolean search(String line) {
        return text.contains(line);
    }
}
