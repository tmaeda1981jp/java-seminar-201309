package jp.co.jjs.seminar.s009.janken;

import jp.co.jjs.seminar.s009.janken.tactics.*;

public class Main {

    public static void main(String[] args) {
        Player murata = new Player("村田さん");
        murata.setTactics(new RandomTactics());
        
        Player yamada = new Player("山田さん");
        yamada.setTactics(new RandomTactics());
        
        JankenResult result;
        for (int i=0; i<10; i++) {
            result = murata.showHand().judge(yamada.showHand());
            if (result.equals(JankenResult.WIN)) {
                System.out.println(murata.getName() + " WIN!");
            }
            else if (result.equals(JankenResult.LOOSE)) {
                System.out.println(yamada.getName() + " WIN!");
            }
            else {
                System.out.println("DRAW !");
            }
        }
    }
}
