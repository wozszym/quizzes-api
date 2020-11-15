package engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class QuizStorage {

    // @Autowired annotation provides the automatic dependency injection.
    @Autowired
    QuizDBService quizDBService;

    private Map<Integer, Quiz> quizMap = new HashMap<>();
    private Integer nextId = 0;

    @PostConstruct
    private void _init() {
        List<Quiz> fromDb = quizDBService.getAll();

        for (Quiz q : fromDb) {
            quizMap.put(q.getId(), q);
        }

        nextId = fromDb.size();
    }

    public QuizStorageConfirmation insert(Quiz quiz) {

        if (quiz.isValid()) {
            quiz.setId(nextId); // new line
            quizMap.put(nextId, quiz);
            quizDBService.save(quiz); // save to DB

            return new QuizStorageConfirmation(quiz.getTitle(), quiz.getText(), quiz.getOptions(), nextId++);
        }

        return null;
    }

    public QuizNoAnswer get(Integer id) {
        if (quizMap.containsKey(id)) {
            return new QuizNoAnswer(quizMap.get(id), id);
        }
        else {
            return null;
        }
    }

    public List<QuizNoAnswer> getAll() {
        var result = new ArrayList<QuizNoAnswer>();

        for (int id = 0; id < nextId; id++) {
            result.add(new QuizNoAnswer(quizMap.get(id), id));
        }

        return result;
    }

    public List<Integer> getAnswer(Integer id) {
        if (quizMap.containsKey(id)) {
            return quizMap.get(id).getAnswer();
        }
        else {
            return null;
        }
    }
}

