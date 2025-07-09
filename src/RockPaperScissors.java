import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int i = 1;
        int playerScore = 0;
        int computerScore = 0;


        System.out.println("==============================================");
        System.out.println("🎮 Welcome to [ Rock 🪨, Paper 📄, Scissors ✂️ ] Game!");
        System.out.println("==============================================");
        System.out.println();

        while (i <= 5) {

            int computer = random.nextInt(3);
            System.out.println("🕹️ ROUND " + i + " — BEGIN!");

            System.out.print("👉 Choose: [ 0 ] Rock 🪨 | [ 1 ] Paper 📄 | [ 2 ] Scissors ✂️ → ");
            byte player = scanner.nextByte();
            System.out.println();


            if (player == 0) {
                System.out.println("🫵 You: Rock 🪨");
            } else if (player == 1) {
                System.out.println("🫵 You: Paper 📄");
            } else if (player == 2) {
                System.out.println("🫵 You: Scissors ✂️");
            } else {
                System.out.println("❌ Invalid input! Please choose 0, 1, or 2");
                System.out.println();
                continue;
            }

            System.out.println("  vs");

            if (computer == 0) {
                System.out.println("🤖 Computer: Rock 🪨");
            } else if (computer == 1) {
                System.out.println("🤖 Computer: Paper 📄");
            } else if (computer == 2) {
                System.out.println("🤖 Computer: Scissors ✂️");
            }


            if (player == computer) {
                System.out.println("🤝 It's a tie!");
            }
            else if (player == 1 && computer == 0 || player == 2 && computer == 1 || player == 0 && computer == 2) {
                System.out.println("🎉 You won this round!");
                playerScore++;
            } else {
                System.out.println("🤖 Computer won this round");
                computerScore++;
            }

            i++;
            System.out.println();
        }

        if (playerScore > computerScore) {
            System.out.println("🏆 Congratulations! You won the game!");
            System.out.println("🎯 Final Score: 🫵 Player "+playerScore+" - 🤖 Computer "+computerScore);
        }
        else if (computerScore > playerScore) {
            System.out.println("🤖 Game over! Computer wins.");
            System.out.println("🎯 Final Score: 🤖 Computer "+computerScore+" - 🫵 Player "+playerScore);
        }
        else {
            System.out.println("Game over! It's a draw 🤝");
            System.out.println("🎯 Final Score: 🫵 Player "+playerScore+" - 🤖 Computer "+computerScore);
        }

        System.out.println();
        System.out.println("Thanks for playing! 😊");
        System.out.println("🔗 Check out more projects on my profile...");
    }
}
