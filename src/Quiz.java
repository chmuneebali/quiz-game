import java.util.ArrayList;
import java.util.List;

public class Quiz {
    String quizHeading = "";
    private List<Question> questions;

    public Quiz(String quizHeading) {
        this.quizHeading = quizHeading;
        this.questions = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public List<Question> getQuestions() {
        return questions;
    }
}
