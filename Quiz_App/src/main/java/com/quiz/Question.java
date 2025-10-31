package com.quiz;

 // Represents a single quiz question, including its text, options,and the correct answer.
public class Question {

    private String questionText;
    private String[] options;
    private String correctAnswer; // e.g., "A", "B", "C"


//     Constructs a new Question.
//     @param questionText The text of the question.
//     @param options An array of options, e.g., {"A. Option 1", "B. Option 2"}
//     @param correctAnswer The letter of the correct answer, e.g., "A"

    public Question(String questionText, String[] options, String correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }


     // Displays the question and its options to the console.

    public void displayQuestion() {
        System.out.println(this.questionText);
        // Use an enhanced for-loop to display options
        for (String option : this.options) {
            System.out.println(option);
        }
    }


//      Checks if the user's provided answer is correct.
//      @param userAnswer The answer provided by the user.
//      @return true if the answer is correct, false otherwise.

    public boolean checkAnswer(String userAnswer) {
        // .equals() is used to compare string content
        return this.correctAnswer.equals(userAnswer);
    }

     // Public getter to show the correct answer if the user was wrong.

    public String getCorrectAnswer() {
        return this.correctAnswer;
    }
}