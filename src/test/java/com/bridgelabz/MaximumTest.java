package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    public static void main(String[] args) {
        System.out.println("welcome to find maximum using genrics");
    }
    @Test
    public void givenIntegershouldGivesMaximumAtFirstPlace() {
        int result = Maximum.printGenric(9,2,8);
        Assert.assertEquals(9,result);
    }

    @Test
    public void givenIntegershouldGivesMaximumAtSecondPlace() {
        int result = Maximum.printGenric(2,9,8);
        Assert.assertEquals(9,result);
    }

    @Test
    public void givenIntegershouldGivesMaximumAtThirdPlace() {
        int result = Maximum.printGenric(2,8,9);
        Assert.assertEquals(9,result);
    }

    @Test
    public void givenFloatShouldGivesMaximumValueFirstPlace() {
        float result = Maximum.printGenric(3.5f,1.5f,1.1f);
        Assert.assertEquals(2.5f,result,0.0);
    }

    @Test
    public void givenFloatShouldGivesMaximumValueSecondPlace() {
        float result = Maximum.printGenric(2.5f,3.5f,1.1f);
        Assert.assertEquals(3.5f,result,0.0);
    }

    @Test
    public void givenFloatShouldGivesMaximumValueThirdPlace() {
        float result = Maximum.printGenric(2.5f,2.6f,3.5f);
        Assert.assertEquals(3.5f,result,0.0);
    }

    @Test
    public void givenStringShouldGivesMaximumValueFirstPlace() {
        Comparable result = Maximum.printGenrictest("banana","peach","apple");
        Assert.assertEquals("banana",result);
    }

    @Test
    public void givenStringShouldGivesMaximumValueSecondPlace() {
        Comparable result = Maximum.printGenrictest("apple","banana","peach");
        Assert.assertEquals("banana",result);
    }

    @Test
    public void givenStringShouldGivesMaximumValueThirdPlace() {
        String result = Maximum.printGenrictest("apple","peach","banana");
        Assert.assertEquals("banana",result);
    }
}