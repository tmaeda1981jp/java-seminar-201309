package jp.co.jjs.seminar.s005.cachebook;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.*;
import org.junit.experimental.runners.*;
import org.junit.runner.*;

@RunWith(Enclosed.class)
public class CacheBookTest {

    public static class addのテスト {
        
        @Test
        public void Itemに登録された日付の月のデータとして登録されること() {
            CacheBook moneyBook = new CacheBook();
            Item item = new Item(1000, "test", "20130911");
            moneyBook.add(item);
            assertThat(moneyBook.book.get("201309").get(0), is(item));
        }
    }

    public static class getTotalOfのテスト {
        
        @Test
        public void 指定月の合計金額を返すこと() {
            CacheBook moneyBook = new CacheBook();
            moneyBook.add(new Item(1000, "", "20130701"));
            moneyBook.add(new Item(-500, "", "20130702"));
            moneyBook.add(new Item(1000, "", "20130801"));
            moneyBook.add(new Item(1000, "", "20130901"));
            moneyBook.add(new Item(-250, "", "20131001"));
            assertThat(moneyBook.getTotalOf("201307"), is(500));
            assertThat(moneyBook.getTotalOf("201308"), is(1000));
            assertThat(moneyBook.getTotalOf("201309"), is(1000));
            assertThat(moneyBook.getTotalOf("201310"), is(-250));
        }
    }
}
