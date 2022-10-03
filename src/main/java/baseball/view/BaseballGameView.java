package baseball.view;

public interface BaseballGameView<IN, OUT> {

    IN inputPlayersTry();
    OUT responseJudge();
    OUT sayWelcome();
    OUT sayByeBye();
}
