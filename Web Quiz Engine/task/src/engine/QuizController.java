package engine;

import io.micrometer.core.instrument.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class QuizController {

    private QuizStorage quizStorage;

    @Autowired
    public QuizController(QuizStorage quizStorage) {
        this.quizStorage = quizStorage;
    }

    @GetMapping("/api/quiz")
    public Quiz getQuiz() {
        return new Quiz();
    }

    /*
    @PostMapping("/api/quiz/{answer}")
    public QuizResponse answerQuiz(@PathVariable Integer answer) {
        if (answer == 2) { // ok
            return new QuizResponse(true, "Congratulations, you're right! - 1");
        }
        else { // wrong answer
            return new QuizResponse(false, "Wrong answer! Please, try again.");
        }
    }
     */
    @RequestMapping({"/api/quiz/{answer}","/api/quiz"})
    public QuizResponse answerQuiz(@RequestParam(value = "answer", defaultValue = "0") String answer) {

        if (StringUtils.isEmpty(answer)) {
            return new QuizResponse(false, "Wrong answer! Please, try again. 000");
        }

        Integer answerInt = Integer.parseInt(answer);

        if (answerInt == 2) { // ok
            return new QuizResponse(true, "Congratulations, you're right!");
        }
        else { // wrong answer
            return new QuizResponse(false, "Wrong answer! Please, try again.");
        }
    }

    /******************************************************************/
    /******************************************************************/
    /******************************************************************/
                    // new code for state 2/6:
    /******************************************************************/
    /******************************************************************/
    /******************************************************************/

    @PostMapping(value = "/api/quizzes", consumes = "application/json")
    public QuizStorageConfirmation postQuiz(@RequestBody Quiz quiz) {
        var storageAnsewer = quizStorage.insert(quiz);

        return storageAnsewer;
    }

    @RequestMapping(value="/api/quizzes/{idStr}", method=RequestMethod.GET)
    public QuizNoAnswer getQuizById(@PathVariable String idStr) {
        Integer id = Integer.parseInt(idStr);
        QuizNoAnswer response = quizStorage.get(id);

        if (response == null) {
            throw new QuizNotFound();
        }
        return quizStorage.get(id);
    }

    @RequestMapping(value="/api/quizzes", method=RequestMethod.GET)
    public List<QuizNoAnswer> getAllQuizes() {
        return quizStorage.getAll();
    }

    @RequestMapping(value = {"/api/quizzes/{idStr}/solve"}, method=RequestMethod.POST)
    public QuizResponse answerQuizPart2(@RequestParam(value = "answer", defaultValue = "0") String answer,
                                        @PathVariable String idStr) {

       Integer answerInt = Integer.parseInt(answer);
       Integer idInt = Integer.parseInt(idStr);

       Integer correctAnswer = quizStorage.getAnswer(idInt);

       if (correctAnswer == null) {
           throw new QuizNotFound();
       }

        if (answerInt == correctAnswer) { // ok
            return new QuizResponse(true, "Congratulations, you're right!");
        }
        else { // wrong answer
            return new QuizResponse(false, "Wrong answer! Please, try again.");
        }
    }

    /******************************************************************/
    /******************************************************************/
    /******************************************************************/
                // new code for state 3/6:
    /******************************************************************/
    /******************************************************************/
    /******************************************************************/

}
