package lv.timesaving.ticketchecker;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void limitStringLength_okForNull() throws Exception {
        assertTrue(StringUtils.limitStringLength(null, 5) == null);
    }

    @Test
    public void limitStringLength_okForZeroLength() throws Exception {
        assertTrue(StringUtils.limitStringLength("", 5).equals(""));
    }

    @Test
    public void limitStringLength_okForBigger() throws Exception {
        assertTrue(StringUtils.limitStringLength("1234567890", 5).equals("12345"));
    }

    @Test
    public void limitStringLength_okForEqual() throws Exception {
        assertTrue(StringUtils.limitStringLength("12345", 5).equals("12345"));
    }

    @Test
    public void limitStringLength_okForSmaller() throws Exception {
        assertTrue(StringUtils.limitStringLength("1234567890", 15).equals("1234567890"));
    }

}