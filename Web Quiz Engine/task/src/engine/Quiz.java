package engine;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Quiz {

    @Id
    private Integer id;
    private String title;
    private String text;

    @ElementCollection( targetClass = String.class, fetch = FetchType.LAZY )
    private List<String> options = new ArrayList<>();

    @ElementCollection( targetClass = Integer.class, fetch = FetchType.LAZY )
    private List<Integer> answer = new ArrayList<>();

    // public Quiz(String title, String text, List<String> options, int answer) {
    public Quiz() {
        // this.title = title;
        // this.text = text;
        // this.options = options;

        this.id = 0;
        this.title = "";
        this.text = "";
        this.options = new ArrayList<>();
        this.answer = new ArrayList<>();
    }

    public void setId(Integer id) { this.id = id; }

    public Integer getId() { return id; }

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
