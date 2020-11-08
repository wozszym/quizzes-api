package engine;

import org.springframework.boot.jta.atomikos.AtomikosProperties;

import java.util.List;

public class QuizStorageConfirmation {
    private Integer id;
    private String title;
    private String text;
    private List<String> options;

    public QuizStorageConfirmation(String title, String text, List<String> options, Integer id) {
        this.title = title;
        this.text = text;
        this.options = options;
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public Integer getId() {
        return id;
    }

    public List<String> getOptions() {
        return options;
    }

    public String getText() {
        return text;
    }

    public String getTitle() {
        return title;
    }
}
