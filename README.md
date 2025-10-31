# 🚀 Java Console Quiz App

This is a console-based quiz application built with Java. It was created as part of the Elevate Labs Java Developer Internship (Task 8).

## Objective
The goal is to create a console-based quiz application that presents questions, accepts user answers, and calculates a final score.

## 🛠️ Tools & Key Concepts
* **Language:** Java
* **Tools:** Java Console, Scanner
* **Key Concepts:**
    * **Collections:** `List` and `ArrayList` are used to store the `Question` objects.
    * **Control Flow:** A `for-each` loop iterates through the questions. `if/else` logic is used to check answers.
    * **OOP:** A custom `Question` class is used to model the data for each question.
    * **User Input:** `Scanner` is used to handle multiple user inputs from the console.
    * **Randomization:** `Collections.shuffle()` is used to present the questions in a random order every time.

## Features
* **Dynamic Question Loading:** Questions are stored in a `List` of `Question` objects.
* **Question Shuffling:** The quiz shuffles the questions at the start for a unique experience each time.
* **Interactive Scoring:** The app accepts user input (A, B, C) and provides immediate feedback (Correct/Wrong).
* **Final Results:** At the end, the user's total score and final percentage are displayed.

## 🖥️ How to Run

1.  **Project Structure:**
    This project uses a standard Java package structure:
    * `src/main/java/com/quiz/App.java` (Main class)
    * `src/main/java/com/quiz/Question.java` (Data class)

2.  **Compile the code:**
    Navigate to the `src` directory and run:
    ```sh
    # On Windows
    javac main\java\com\quiz\*.java

    # On macOS/Linux
    javac main/java/com/quiz/*.java
    ```

3.  **Run the application:**
    From the `src` directory, run the `App` class using its fully qualified name:
    ```sh
    java com.quiz.App
    ```
