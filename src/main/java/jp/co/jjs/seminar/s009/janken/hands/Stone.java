package jp.co.jjs.seminar.s009.janken.hands;

import jp.co.jjs.seminar.s009.janken.*;

public class Stone implements HandComparable {

    @Override
    public JankenResult judge(HandComparable hand) {
        System.out.printf("%s vs %s\n", this.getText(), hand.getText());
        return hand.compareWithStone();
    }

    @Override
    public JankenResult compareWithStone() {
        return JankenResult.DRAW;
    }

    @Override
    public JankenResult compareWithScissors() {
        return JankenResult.WIN;
    }

    @Override
    public JankenResult compareWithPaper() {
        return JankenResult.LOOSE;
    }
    
    @Override
    public String getText() {
        return "グー";
    }
}
