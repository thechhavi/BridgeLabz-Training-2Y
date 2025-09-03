package strings;
import java.util.Scanner;

public class RockPaperScissor {

    // Method to get computer choice (0=Rock, 1=Paper, 2=Scissors)
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3); // Random number between 0-2
        if (choice == 0) return "Rock";
        else if (choice == 1) return "Paper";
        else return "Scissors";
    }

    // Method to determine winner
    public static String findWinner(String user, String computer) {
        if (user.equals(computer)) {
            return "Draw";
        } else if ((user.equals("Rock") && computer.equals("Scissors")) ||
                   (user.equals("Paper") && computer.equals("Rock")) ||
                   (user.equals("Scissors") && computer.equals("Paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }

    // Method to calculate win stats
    public static String[][] calculateStats(int userWins, int computerWins, int games) {
        String[][] stats = new String[2][3];

        double userPercent = ((double) userWins / games) * 100;
        double compPercent = ((double) computerWins / games) * 100;

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", userPercent) + "%";

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f", compPercent) + "%";

        return stats;
    }

    // Method to display results table
    public static void displayResults(String[][] results, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.println("Game\tUser\tComputer\tWinner");
        System.out.println("----------------------------------------");
        for (int i = 0; i < results.length; i++) {
            System.out.println((i + 1) + "\t" + results[i][0] + "\t" + results[i][1] + "\t\t" + results[i][2]);
        }

        System.out.println("\nWin Statistics:");
        System.out.println("Player\tWins\tWin %");
        System.out.println("-------------------------");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take number of games
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[][] results = new String[n][3];
        int userWins = 0, computerWins = 0;

        // Play n games
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter your choice (Rock/Paper/Scissors): ");
            String userChoice = sc.nextLine().trim();
            String computerChoice = getComputerChoice();

            String winner = findWinner(userChoice, computerChoice);
            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;

            results[i][0] = userChoice;
            results[i][1] = computerChoice;
            results[i][2] = winner;
        }

        // Calculate stats
        String[][] stats = calculateStats(userWins, computerWins, n);

        // Display everything
        displayResults(results, stats);

        sc.close();
    }
}
