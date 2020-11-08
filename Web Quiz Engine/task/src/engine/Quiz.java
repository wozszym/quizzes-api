package engine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz {

    private String title;
    private String text;
    private List<String> options;
    private int answer;

    // public Quiz(String title, String text, List<String> options, int answer) {
    public Quiz() {
        // this.title = title;
        // this.text = text;
        // this.options = options;

        this.title = "The Java Logo";
        this.text = "What is depicted on the Java logo?";
        this.options = new ArrayList<>(Arrays.asList("Robot","Tea leaf","Cup of coffee","Bug"));
        this.answer = 2;
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

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
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
}
