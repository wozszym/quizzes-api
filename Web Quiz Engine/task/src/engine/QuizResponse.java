package engine;

public class QuizResponse {
    private final Boolean success;
    private final String feedback;

    public QuizResponse(Boolean success, String feedback) {
        this.success = success;
        this.feedback = feedback;
    }

    public Boolean getSuccess() {
        return success;
    }

    public String getFeedback() {
        return feedback;
    }
}
