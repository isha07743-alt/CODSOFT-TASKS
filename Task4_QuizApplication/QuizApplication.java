import java.util.Scanner;

public class QuizApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] questions = {
            "1. Which language is used to create Android applications?",
            "2. Which keyword is used to create a class in Java?",
            "3. Which method is the starting point of a Java program?",
            "4. Which symbol is used to end a statement in Java?",
            "5. Which data type is used to store whole numbers?"
        };

        String[][] options = {
            {"1. Java", "2. HTML", "3. CSS", "4. SQL"},
            {"1. function", "2. class", "3. define", "4. object"},
            {"1. start()", "2. run()", "3. main()", "4. execute()"},
            {"1. .", "2. :", "3. ;", "4. ,"},
            {"1. double", "2. String", "3. int", "4. boolean"}
        };

        int[] answers = {1, 2, 3, 3, 3};

        int score = 0;

        System.out.println("================================");
        System.out.println("       QUIZ APPLICATION");
        System.out.println("================================");

        for (int i = 0; i < questions.length; i++) {

            System.out.println("\n" + questions[i]);

            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Enter your answer (1-4): ");
            int userAnswer = sc.nextInt();

            if (userAnswer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
            }
        }

        System.out.println("\n================================");
        System.out.println("           QUIZ RESULT");
        System.out.println("================================");
        System.out.println("Your Score: " + score + "/" + questions.length);

        if (score == questions.length) {
            System.out.println("Excellent! All answers are correct.");
        } else if (score >= 3) {
            System.out.println("Good job!");
        } else {
            System.out.println("Keep practicing!");
        }

        sc.close();
    }
}