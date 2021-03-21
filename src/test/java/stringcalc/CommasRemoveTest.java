package stringcalc;


import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import org.junit.Test;
import static stringcalc.CommasRemove.*;
import static org.junit.Assert.assertThat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class CommasRemoveTest {


@Test
    public void return_3() {
        assertThat(concatNumbers(asList(-1,-2)), equalTo("-1, -2"));
    }
}
