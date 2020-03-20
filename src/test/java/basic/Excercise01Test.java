package basic;

import org.junit.Assert;
import org.junit.Test;

public class Excercise01Test {

    @Test
    public void test_findGCD() {
        Assert.assertEquals(new Exercise01().findGCD(12, 24), 12);
        Assert.assertEquals(new Exercise01().findGCD(30, 12), 6);
        Assert.assertEquals(new Exercise01().findGCD(0, 24), 24);
        Assert.assertEquals(new Exercise01().findGCD(0, 0), -1);
    }

    @Test
    public void test_findLCM(){
        Assert.assertEquals(new Exercise01().findLCM(12, 24), 24);
        Assert.assertEquals(new Exercise01().findLCM(32, 24), 96);
        Assert.assertEquals(new Exercise01().findLCM(0, 24), 0);
        Assert.assertEquals(new Exercise01().findLCM(0, 0), 0);
    }
}
