package UpdateScored;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Player> palyers = new ArrayList<>(List.of(
                new Player("Alice", 20),
                new Player("Bob", 30),
                new Player("Charlie", 25)
        ));
        players.replaceAll(player -> player.socre *= 2);


        players.forEach(player ->
                System.out.println(players)
        );
    }
}
