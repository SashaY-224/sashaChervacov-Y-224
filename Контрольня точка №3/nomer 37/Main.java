import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество игроков: ");
        int numPlayers = scanner.nextInt();
        System.out.print("Введите номер игрока, с которого начинается игра: ");
        int startPlayer = scanner.nextInt();
        List<Integer> players = new ArrayList<>();
        for (int i = 1; i <= numPlayers; i++) {
            players.add(i);
        }
        List<Integer> eliminatedPlayers = new ArrayList<>();
        int currentIndex = startPlayer - 1;
        while (players.size() > 1) {
            currentIndex = (currentIndex + 2) % players.size();
            eliminatedPlayers.add(players.remove(currentIndex));
        }
        eliminatedPlayers.add(players.get(0));
        System.out.println("Список выбывших игроков:");
        for (int i = 0; i < eliminatedPlayers.size(); i++) {
            int eliminatedPlayer = eliminatedPlayers.get(i);
            System.out.printf("%s => %d is counted out and goes into the result %s%n", players, eliminatedPlayer, eliminatedPlayers.subList(0, i + 1));
            players.remove((Object) eliminatedPlayer);
        }
    }
}