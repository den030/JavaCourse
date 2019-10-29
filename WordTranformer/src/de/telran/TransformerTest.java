package de.telran;

import org.junit.Test;

import java.util.function.Function;
import java.util.function.Predicate;

import static org.junit.Assert.assertEquals;

public class TransformerTest {

    @Test
    public void testLength3UpperCase(){
        String input = "aaa bB ccdE";
        String expected = "AAA bB ccdE";

        String actual = Trasformer.transform(input);

        assertEquals("wrong result sentence", expected, actual);
    }

    @Test
    public void testLength3UpperCaseSingleWord(){
        String input = "aaa";
        String expected = "AAA";

        String actual = Trasformer.transform(input);

        assertEquals("wrong result sentence", expected, actual);
    }

    @Test
    public void testLength4LowerCase(){
        String input = "aaa bB ccdE";
        String expected = "aaa bB ccde";

        Predicate<String> p = s -> s.length() == 4;
        Function<String, String> f = s -> s.toLowerCase();

        String actual = Trasformer.transform(input, p,f);

        assertEquals("wrong result sentence", expected, actual);
    }

    @Test
    public void testLength3UpperCaseNew(){
        String input = "aaa bB ccdE";
        String expected = "AAA bB ccdE";

        Predicate<String> p = s -> s.length() == 3;
        Function<String, String> f = s -> s.toUpperCase();

        String actual = Trasformer.transform(input, p,f);

        assertEquals("wrong result sentence", expected, actual);
    }
}
