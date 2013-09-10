package jp.co.jjs.seminar.s009.janken.hands;

import jp.co.jjs.seminar.s009.janken.*;

public class Scissors implements HandComparable {

    @Override
    public JankenResult judge(HandComparable hand) {
        System.out.printf("%s vs %s\n", this.getText(), hand.getText());
        return hand.compareWithScissors();
    }

    @Override
    public JankenResult compareWithStone() {
        return JankenResult.LOOSE;
    }

    @Override
    public JankenResult compareWithScissors() {
        return JankenResult.DRAW;
    }

    @Override
    public JankenResult compareWithPaper() {
        return JankenResult.WIN;
    }
    
    @Override
    public String getText() {
        return "チョキ";
    }
}
