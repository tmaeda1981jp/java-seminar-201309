package jp.co.jjs.seminar.s005.cachebook;

/**
 * 一件の収支情報を表現するクラス
 * @author tmaeda1981jp
 */
public class Item {

    /** 金額。支出はマイナスで表現する。 */
    private final int amount;
    /** 収支の内容 */
    private final String description;
    /** その収支が発生した日にちの文字列表現(YYYYMM) */
    private final String date;
    
    public Item(int amount, String description, String date) {
        this.amount = amount;
        this.description = description;
        this.date = date;
    }
    
    /**
     * 収支金額を取得します。
     * @return 収支金額
     */
    public int getAmount() {
        return amount;
    }
    
    /**
     * 収支内容を取得します。
     * @return 収支内容
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * 収支が発生した日にちを取得します。
     * @return 収支が発生した日にち
     */
    public String getDate() {
        return date;
    }
    
    @Override
    public String toString() {
        return String.format("%s %d %s", description, amount, date);
    }   
}
