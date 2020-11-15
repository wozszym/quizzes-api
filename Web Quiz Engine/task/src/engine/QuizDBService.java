package engine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuizDBService {

    // based on: https://examples.javacodegeeks.com/spring-boot-h2-database-example/

    // @Autowired annotation provides the automatic dependency injection.
    @Autowired
    QuizRepository repository;

    // Save quizes entity in the h2 database.
    public void save(final Quiz quiz) {
        repository.save(quiz);
    }

    // Get all quizes from the h2 database.
    @Transactional
    public List<Quiz> getAll() {
        final List<Quiz> quizes = new ArrayList<>();
        repository.findAll().forEach(quiz -> quizes.add(quiz));
        //repository.loadAll().forEach(quiz -> quizes.add(quiz));
        return quizes;
    }
}
