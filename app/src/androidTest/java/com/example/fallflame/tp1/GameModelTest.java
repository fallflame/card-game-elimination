package com.example.fallflame.tp1;

import android.test.InstrumentationTestCase;
import com.example.fallflame.tp1.model.AIPlayer;
import com.example.fallflame.tp1.model.Game;
import com.example.fallflame.tp1.model.Player;

/**
 * Created by FallFlame on 15/2/7.
 */
public class GameModelTest extends InstrumentationTestCase {

    public void testGame() {
        AIPlayer player1 = new AIPlayer();
        AIPlayer player2 = new AIPlayer();
        Game game = new Game();

        game.setPlayers(new Player[]{player1, player2});

        do{
            game.nextChoose();
        }while(!game.isGameOver());

    }

}
