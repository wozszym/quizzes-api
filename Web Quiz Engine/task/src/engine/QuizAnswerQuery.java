package engine;

import java.util.ArrayList;
import java.util.List;

public class QuizAnswerQuery {
    private List<Integer> answer;

    public  QuizAnswerQuery() {
        this.answer = new ArrayList<>();
    }

    public List<Integer> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Integer> answer) {
        this.answer = answer;
    }
}
