package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cts1 on 18/8/17.
 */
public abstract class Game {
    private List<Player> players;

    private Game(){
        players = new ArrayList<>();
    }


    public abstract Player whoWon();

    public static class GameBuilder{
        private Game game;

        public GameBuilder(Game game){
            this.game = game;
        }

        public GameBuilder addPlayer(Player player){
            this.game.players.add(player);
            return this;
        }
        public Game build(){
            return this.game;
        }
    }
}
