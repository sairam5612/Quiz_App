package com.quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


 // Main application class to run the console quiz.
 // This class loads questions, runs the quiz loop, and shows the results

 class App {

    private List<Question> questions;
    private int score;
    private Scanner scanner;

    public App() {
        this.questions = new ArrayList<>();
        this.score = 0;
        this.scanner = new Scanner(System.in);
        loadQuestions();
    }


     // Populates the 'questions' list with data.

    private void loadQuestions() {
        // Using a List of questions with options
        String[] q1Options = {"A. 4", "B. 2", "C. 5"};
        questions.add(new Question("What is 2+2?", q1Options, "A"));

        String[] q2Options = {"A. java.util", "B. java.lang", "C. java.io"};
        questions.add(new Question("Which package is automatically imported in every Java class?", q2Options, "B"));

        String[] q3Options = {"A. To prevent inheritance", "B. To declare a constant", "C. Both A and B"};
        questions.add(new Question("What is the 'final' keyword used for with a class?", q3Options, "A"));

        String[] q4Options = {"A. A list", "B. An array", "C. A map"};
        questions.add(new Question("What collection stores key-value pairs?", q4Options, "C"));

        String[] q5Options = {"A. .sort()", "B. .orderBy()", "C. .shuffle()"};
        questions.add(new Question("How do you randomize elements in a List?", q5Options, "C"));

        // Shuffle the questions so they appear in a random order
        Collections.shuffle(questions);
    }


     // Starts the quiz, loops through questions, and scores the user.

    public void startQuiz() {
        System.out.println("Welcome to the Java Quiz!");
        System.out.println("There are " + questions.size() + " questions. Let's start!");
        System.out.println("=========================================");

        // Using a Java loop to iterate through the questions
        for (Question q : questions) {
            q.displayQuestion();
            System.out.print("Your answer (A, B, or C): ");

            // Accept user's answer
            String userAnswer = scanner.nextLine().trim().toUpperCase();

            // Check the answer and score the user
            if (q.checkAnswer(userAnswer)) {
                System.out.println(">>> Correct!");
                score++;
            } else {
                System.out.println(">>> Wrong. The correct answer was: " + q.getCorrectAnswer());
            }
            System.out.println("---------------------------------");
        }
    }


    // Displays the final score to the user.

    public void showResults() {
        System.out.println("\nQuiz Finished!");
        System.out.println("Your final score is: " + score + " out of " + questions.size());

        double percentage = ((double) score / questions.size()) * 100;
        System.out.printf("Your percentage: %.2f%%\n", percentage);
    }


    // Main method to run the application.

    public static void main(String[] args) {
        App quiz = new App();
        quiz.startQuiz();
        quiz.showResults();
        quiz.scanner.close(); // Close the scanner to prevent resource leaks
    }
}