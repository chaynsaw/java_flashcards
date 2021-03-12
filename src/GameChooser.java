import java.util.Collection;
import java.util.HashSet;

class GameChooser {
    private Collection<Game> games = new HashSet<>();

    public void printAllGames() {
        games.forEach(game -> {
            System.out.println(game.getTitle());
        });
    }

    public void addGame(Game game) {
        games.add(game);
    }

}