
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File: ");
        String file = scanner.nextLine();

        System.out.println("Team: ");
        String team = scanner.nextLine();

        ArrayList<Games> games = new ArrayList<>();

        try ( Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String awayTeam = parts[1];
                int homeScore = Integer.valueOf(parts[2]);
                int awayScore = Integer.valueOf(parts[3]);

                games.add(new Games(homeTeam, awayTeam, homeScore, awayScore));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        int count = 0;
        int wins = 0;
        int losses = 0;

        for (Games game : games) {
            if (game.toString().contains(team)) {
                count++;
                if (game.winner().contains(team)) {
                    wins++;
                } else {
                    losses++;
                }
            }
            
        }
        System.out.println("Games: " + count);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
}
