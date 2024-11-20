import java.util.Random;
import java.util.Scanner;

public class BhubanMathQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        System.out.println("Choose a Level :\n1 for Easy(10 questions)\n2 for Easy(20 questions)\n3 for Easy(30 questions)");
        // Scanner choice=new Scanner(System.in);
        int number = scanner.nextInt();
        int questions; // Number of questions in the quiz

        switch(number)
        {
            case 1:
            System.out.println("You have Choosen Easy Level");
            questions=10;
            break;
            case 2:
            System.out.println("You have Choosen Medium Level");
            questions=20;
            break;
            case 3:
            System.out.println("You have Choosen Hard Level");
            questions=30;
            break;
            default:
            System.out.println("Invalid Choice!!!\nDefault Level is Easy");
            questions=10;

        }
        
        
        System.out.println("Welcome to Bhuban's Math Quiz!!!");
        System.out.println("You will be given " + questions + " questions.");

        for (int i = 1; i <= questions; i++) {
            int num1 = random.nextInt(40) + 1;
            int num2 = random.nextInt(30) + 1;

            char[] operations = {'+', '-', '*', '/'};
            char operation = operations[random.nextInt(operations.length)];

            // Calculate the correct answer
            double correctAnswer = 0;
            boolean validOperation = true;

            switch (operation) {
                case '+':
                    correctAnswer = num1 + num2;
                    break;
                case '-':
                    correctAnswer = num1 - num2;
                    break;
                case '*':
                    correctAnswer = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        correctAnswer = (double) num1 / num2;
                    } else {
                        validOperation = false; // Skip invalid division
                    }
                    break;
            }

            if (!validOperation) {
                i--; // Retry the question if division by zero occurred
                continue;
            }

            // Display the question
            System.out.println("\nQuestion " + i + ":");
            System.out.println("Solve: " + num1 + " " + operation + " " + num2);

            // Get the user's answer
            System.out.print("Your answer: ");
            double userAnswer = scanner.nextDouble();

            // Check the user's answer
            if (Math.abs(userAnswer - correctAnswer) < 0.0001) { // Allowing minor precision errors
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct answer is " + correctAnswer);
            }
        }

        // Display the final score
        System.out.println("\nQuiz completed!");
        System.out.println("Your final score: " + score + " out of " + questions);
        scanner.close();
    }
}
