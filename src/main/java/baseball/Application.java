package baseball;

import baseball.control.BaseballGame;
import baseball.control.Game;

public class Application {
    public static void main(String[] args) { 
        Game baseballGame = new BaseballGame();

        while (baseballGame.wantPlayingGame()) {
            baseballGame.play();
        }
        baseballGame.quit();
    }
}
