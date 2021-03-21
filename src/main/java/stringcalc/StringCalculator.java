/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringcalc;

import java.util.ArrayList;
import java.util.List;
import static stringcalc.CommasRemove.concatNumbers;

/**
 *
 * @author Admin
 */
public class StringCalculator {
    private final NumberParser numberParser = new NumberParser();

    int add(String numbers) {
        if (numbers.isEmpty()) return 0;
        return adding(numbers);
    }

    private int adding(String numbers) {
        List<Integer> numbersSplit = numberParser.fromStringToNumber(numbers);
        checkForNegativeNumbers(numbersSplit);
        return numbersSplit.stream().filter(n -> n <= 1000).reduce(0, (a, b) -> a + b);
    }

    private void checkForNegativeNumbers(List<Integer> numbersSplit) {
        ArrayList<Integer> negativeNumbers = new ArrayList<>();
        for (Integer integer : numbersSplit) {
            if (integer < 0) negativeNumbers.add(integer);
        }
        if (negativeNumbers.size() > 0) throw new NegativesNumbersException("negatives not allowed: " +  concatNumbers(negativeNumbers));

    }

    class NegativesNumbersException extends IllegalArgumentException {
        NegativesNumbersException(String message) {
            super(message);
        }
    }

}

