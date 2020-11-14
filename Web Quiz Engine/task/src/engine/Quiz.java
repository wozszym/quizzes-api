package engine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz {

    private String title;
    private String text;
    private List<String> options;
    private List<Integer> answer;

    // public Quiz(String title, String text, List<String> options, int answer) {
    public Quiz() {
        // this.title = title;
        // this.text = text;
        // this.options = options;

        this.title = "";
        this.text = "";
        this.options = new ArrayList<>();
        this.answer = new ArrayList<>();
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

    public List<Integer> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Integer> answer) {
        this.answer = answer;
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

    public boolean isValid() {
        return !title.isEmpty() && !text.isEmpty() && options.size() >= 2;
    }
}
