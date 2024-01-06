import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        // Create a quiz
        Quiz quiz = new Quiz("Java Basics");

        // Create questions
        Question question1 = new Question("What is the capital of France?",
                Arrays.asList(new Option("Berlin"), new Option("Paris"), new Option("Madrid")), 1);

        Question question2 = new Question("Which programming language is this quiz written in?",
                Arrays.asList(new Option("Java"), new Option("Python"), new Option("C++")), 0);

        // Add questions to the quiz
        quiz.addQuestion(question1);
        quiz.addQuestion(question2);

        // Create users
        User user1 = new User("Alice");
        User user2 = new User("Bob");

        // Users attempt the quiz
        user1.attemptQuiz(quiz, Arrays.asList(1, 0)); // Alice's responses for question1 and question2
        user2.attemptQuiz(quiz, Arrays.asList(1, 2)); // Bob's responses for question1 and question2

        // Display quiz results
        displayQuizResults(quiz, user1);
        displayQuizResults(quiz, user2);
    }

    private static void displayQuizResults(Quiz quiz, User user) {
        System.out.println("Quiz Results for " + user.getUsername() + " on " + quiz.getQuestions());

        Map<Quiz, List<Integer>> userResponses = user.getQuizResponses();
        List<Question> questions = quiz.getQuestions();

        for (int i = 0; i < questions.size(); i++) {
            Question question = questions.get(i);
            List<Option> options = question.getOptions();
            int userResponseIndex = userResponses.get(quiz).get(i);

            System.out.println("Question: " + question.getQuestionText());
            System.out.println("Options: " + options);

            System.out.println("User's Response: " + options.get(userResponseIndex).getOptionText());
            System.out.println("Correct Response: " + options.get(question.getCorrectOptionIndex()).getOptionText());

            boolean isCorrect = userResponseIndex == question.getCorrectOptionIndex();
            System.out.println("Result: " + (isCorrect ? "Correct" : "Incorrect"));
            System.out.println();
        }
    }
}
