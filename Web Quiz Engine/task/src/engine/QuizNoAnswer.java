package engine;

import java.util.List;

public class QuizNoAnswer {

    private Integer id;
    private String title;
    private String text;
    private List<String> options;

    public QuizNoAnswer(Quiz quiz, Integer id) {
        this.id = id;
        this.title = quiz.getTitle();
        this.text = quiz.getText();
        this.options = quiz.getOptions();
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public List<String> getOptions() {
        return options;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
