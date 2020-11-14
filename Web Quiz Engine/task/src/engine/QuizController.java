package engine;

import io.micrometer.core.instrument.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.HashSet;
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
        var storageAnswer = quizStorage.insert(quiz);

        if (storageAnswer == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid test data");
        }

        return storageAnswer;
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


    boolean answersAreTheSame(List<Integer> firstArr, List<Integer> secondArr) {

        var secondSet = new HashSet<Integer>();
        for (var x : secondArr) secondSet.add(x);

        boolean res = true;

        for (var x : firstArr) {
            if (!secondSet.contains(x))
                res = false;
        }

        return res;
    }

    @RequestMapping(value = {"/api/quizzes/{idStr}/solve"}, method=RequestMethod.POST)
    public QuizResponse answerQuizPart2(@RequestBody QuizAnswerQuery answer,
                                        @PathVariable String idStr) {

       List<Integer> answerInt = answer.getAnswer();
       Integer idInt = Integer.parseInt(idStr);

        List<Integer> correctAnswer = quizStorage.getAnswer(idInt);

       if (correctAnswer == null) {
           throw new QuizNotFound();
       }

        if (answersAreTheSame(answerInt, correctAnswer)
                && answersAreTheSame(correctAnswer, answerInt)) { // ok
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
