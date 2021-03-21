package stringcalc;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;
import static java.util.stream.Stream.of;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.hamcrest.core.Is.is;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hiral
 */

@RunWith(Parameterized.class)
public class NumberParserTest {
    
    private NumberParser numberParser;
    private String input;
    private List<Integer> expected;

    @Before
    public void before() {
        numberParser = new NumberParser();
    }

    public NumberParserTest(String input, List<Integer> expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void parseNumber() {
        assertEquals(expected, numberParser.fromStringToNumber(input));
    }

   @Parameterized.Parameters
    public static Iterable<Object[]>  testIterable() {
        return Arrays.asList(new Object[][] {
            {"1,2,3", Arrays.asList(1,2,3)},
            { "1\n2\n3", Arrays.asList(1, 2, 3) },
                { "//;\n1;2", Arrays.asList(1, 2) },
                { "//[***]\n1***2***3", Arrays.asList(1, 2, 3) },

        });
    }
}


