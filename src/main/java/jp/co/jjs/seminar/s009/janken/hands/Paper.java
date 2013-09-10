package jp.co.jjs.seminar.s009.janken.hands;

import jp.co.jjs.seminar.s009.janken.*;

public class Paper implements HandComparable {

    @Override
    public JankenResult judge(HandComparable hand) {
        System.out.printf("%s vs %s\n", this.getText(), hand.getText());
        return hand.compareWithPaper();
    }

    @Override
    public JankenResult compareWithStone() {
        return JankenResult.WIN;
    }

    @Override
    public JankenResult compareWithScissors() {
        return JankenResult.LOOSE;
    }

    @Override
    public JankenResult compareWithPaper() {
        return JankenResult.DRAW;
    }
    
    @Override
    public String getText() {
        return "パー";
    }
}
