import java.util.ArrayList;
import java.util.List;

public class Question {
    private String questionText;
    private List<Option> options;
    private int correctOptionIndex;

    public Question(String questionText, List<Option> options, int correctOptionIndex) {
        this.questionText = questionText;
        this.options = new ArrayList<>(options);
        this.correctOptionIndex = correctOptionIndex;
    }

    public String getQuestionText() {
        return questionText;
    }

    public List<Option> getOptions() {
        return options;
    }

    public int getCorrectOptionIndex() {
        return correctOptionIndex;
    }
}
