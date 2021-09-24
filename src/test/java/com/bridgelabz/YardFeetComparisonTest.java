package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class YardFeetComparisonTest {
    @Test
    void givenYardAndNullShouldReturnNotEqual() {
        Yard yard1 = new Yard(0);
        Yard yard2 = null;
        Assertions.assertNotEquals(yard1, yard2);
    }

    @Test
    void givenYardAndYardFromSameReferenceWhenEqualShouldReturnTure() {
        Yard yard1 = new Yard(0);
        boolean result = yard1 == yard1;
        Assertions.assertTrue(result);
    }

    @Test
    void givenYardAndYardFromDiffReferenceWhenNotEqualShouldReturnFalse() {
        Yard yard1 = new Yard(0);
        Yard yard2 = new Yard(0);
        boolean result = yard1 == yard2;
        Assertions.assertFalse(result);
    }

    @Test
    void givenYardAndFeetFromDiffTypeShouldReturnFalse() {
        Yard yard = new Yard(0);
        Feet feet = new Feet(3.0);
        boolean result = yard.equals(feet);
        Assertions.assertFalse(result);
    }

    @Test
    void given0YardAnd0YardShouldReturnEqual() {
        Yard yard1 = new Yard(0);
        Yard yard2 = new Yard(0);
        Assertions.assertEquals(yard1, yard2);
    }

    @Test
    void given0YardAnd1YardShouldReturnNotEqual() {
        Yard yard1 = new Yard(0);
        Yard yard2 = new Yard(1);
        Assertions.assertNotEquals(yard1, yard2);
    }
}



