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
}
