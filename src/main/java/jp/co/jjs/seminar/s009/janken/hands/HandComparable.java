package jp.co.jjs.seminar.s009.janken.hands;

import jp.co.jjs.seminar.s009.janken.*;

public interface HandComparable {

    JankenResult judge(HandComparable hand);
    
    JankenResult compareWithStone();
    
    JankenResult compareWithScissors();
    
    JankenResult compareWithPaper();
    
    String getText();
}
