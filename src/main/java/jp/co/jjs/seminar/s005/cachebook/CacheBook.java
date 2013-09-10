package jp.co.jjs.seminar.s005.cachebook;

import java.util.*;

/**
 * お小遣い帳を表現するクラス
 * @author tmaeda1981jp
 */
public class CacheBook {

    // private HashMap<String, ArrayList<Item>> book = new HashMap<>();
    HashMap<String, ArrayList<Item>> book = new HashMap<>();
    
    /**
     * １件の収支情報をお小遣い帳に登録します。
     * @param item お小遣い帳に追加する収支情報
     */
    public void add(Item item) {
        // YYYYMMDDからYYYYMM（月まで）を切り取る
        // ex) 20130910 -> 201309
        String key = item.getDate().substring(0, 6);
        
        // YYYYMMで登録済みのリストを取得する
        ArrayList<Item> list = book.get(key);
        // もし未登録だったら新しいリストを作る
        if (null == list) {
            list = new ArrayList<>();
        }
        
        // リストに収支情報を追加する
        list.add(item);
        // YYYYMMのキーに紐づくリストを収支情報が追加されたものに上書きする
        book.put(key, list);
    }
    
    /**
     * 指定月の収支情報一覧を取得する。
     * @param yyyymm 指定月を表現する文字列(YYYYMM)
     * @return 指定月の収支情報一覧
     */
    public ArrayList<Item> getItems(String yyyymm) {
        return book.get(yyyymm);
    }
    
    /**
     * 指定月の収支合計を取得する。
     * @param yyyymm 指定月を表現する文字列(YYYYMM)
     * @return 指定月の収支合計
     */
    public int getTotalOf(String yyyymm) {
        ArrayList<Item> list = getItems(yyyymm);
        int total = 0;
        for (Item item: list) {
            total += item.getAmount();
        }
        return total;
    }
}
