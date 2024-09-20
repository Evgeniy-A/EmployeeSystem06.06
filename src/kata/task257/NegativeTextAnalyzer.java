package kata.task257;

public class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {


    @Override
    protected String[] getKeywords() {
        String[] keywords = {":(", "=(", ":|"};
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }

    @Override
    public Label processText(String text) {
        for (String keyword : getKeywords()) {
            if (text.contains(keyword)) {
                return getLabel();
            }
        }
        return Label.OK;
    }
}