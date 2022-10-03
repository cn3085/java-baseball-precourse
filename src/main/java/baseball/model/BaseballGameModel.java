package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.HashSet;
import java.util.Set;

public class BaseballGameModel {

    private Integer[] ballNumbers;
    private boolean notYetCollectAnswer = true;
    private boolean wantNewGame = true;

    public BaseballGameModel() {
        setNewGame();
    }

    public void setNewGame(){
        this.notYetCollectAnswer = true;
        this.wantNewGame = true;
        this.ballNumbers = pickNewBallNumbers();
    }

    private Integer[] pickNewBallNumbers() {
        Set<Integer> ballNumberSet = new HashSet<>();
        while (ballNumberSet.size() < 3) {
            ballNumberSet.add(Randoms.pickNumberInRange(1, 9));
        }
        return ballNumberSet.toArray(new Integer[3]);
    }

    public Integer[] getBallNumbers() {
        return ballNumbers;
    }

    public boolean getNotYetCollectAnswer(){
        return notYetCollectAnswer;
    }

    public boolean getWantNewGame(){
        return wantNewGame;
    }
}
