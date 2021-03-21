/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringcalc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/**
 *
 * @author Admin
 */
public class CommasRemove {
 
    static String concatNumbers(List<Integer> negativeNumbers) {
        return Arrays.stream(negativeNumbers.toArray()).map(String::valueOf).collect(Collectors.joining(", "));
    }
}