package string;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Exercise01Test {
    @Test
    public void test_splitSentence() {
        String a =
                "Classifying and Dividing: 50 Writing Topics: Are you ready to get organized? If so, you'll probably be applying the principle of classification perhaps to one of our 50 topics or to a brand new topic of your own." +
                        "" +
                        "Examining Causes and Effects: 50 Writing Topics: We can't tell you exactly what causes global warming, but maybe you can tell us. If not, these 50 other topic suggestions should start you thinking about why? and so what?" +
                        "" +
                        "Very hard! You known.";
        String[] res = {
                "Classifying and Dividing: 50 Writing Topics: Are you ready to get organized",
                "If so, you'll probably be applying the principle of classification perhaps to one of our 50 topics or to a brand new topic of your own",
                "Examining Causes and Effects: 50 Writing Topics: We can't tell you exactly what causes global warming, but maybe you can tell us",
                "If not, these 50 other topic suggestions should start you thinking about why",
                "and so what",
                "Very hard",
                "You known"
        };
        assertEquals(new Exercise01().splitSentence(a), Arrays.asList(res));
    }
}
