package string;

import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise07Test {
    @Test
    public void test_transToRootString() {
        assertEquals(new Exercise07().transToRootString("abc4e6fd"),"abcccceeeeeefd");
        assertEquals(new Exercise07().transToRootString("ab13c"),"abbbbbbbbbbbbbc");
        assertEquals(new Exercise07().transToRootString("ab13c2"),"abbbbbbbbbbbbbcc");
    }
}

