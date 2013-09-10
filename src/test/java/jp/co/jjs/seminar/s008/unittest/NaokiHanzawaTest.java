package jp.co.jjs.seminar.s008.unittest;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.*;

public class NaokiHanzawaTest {

    private NaokiHanzawa hanzawa;
    @Before
    public void setup() {
        hanzawa = new NaokiHanzawa();
    }
    
    @Test
    public void 倍返しだに値を渡すと2倍の値を返すこと() {
        int num = hanzawa.倍返しだ(10);
        assertThat(num, is(20));
    }
    
    @Test
    public void 十倍返しだに値を渡すと10倍の値を返すこと() {
        int num = hanzawa.十倍返しだ(10);
        assertThat(num, is(100));
    }

}
