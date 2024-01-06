import java.util.HashMap;
import java.util.Map;
import java.util.List;
public class User {
    private String username;
    private Map<Quiz, List<Integer>> quizResponses;

    public User(String username) {
        this.username = username;
        this.quizResponses = new HashMap<>();
    }

    public String getUsername() {
        return username;
    }

    public void attemptQuiz(Quiz quiz, List<Integer> userResponses) {
        quizResponses.put(quiz, userResponses);
    }

    public Map<Quiz, List<Integer>> getQuizResponses() {
        return quizResponses;
    }
}
