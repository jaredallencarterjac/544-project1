package com.example.triangleapp;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import org.junit.Before;
import org.junit.Test;

public class ParserTests {
    private TriangleApp ta;
    @Before
    public void setUp(){
        ta = new TriangleApp();
    }
    @Test
    public void parse3Integers(){
        String input1 = "3,4,5";
        String input2 ="3 4 5";

        float[] expected  = new float[3];
        expected[0] = 3.0F;
        expected[1] = 4.0F;
        expected[2] = 5.0F;

        boolean test1 = ta.parseInput(input1);
        System.out.println(ta.toString());
        assertArrayEquals(expected,ta.getParsedNumbers(),0.0f);
        assertTrue(test1);

        boolean test2 = ta.parseInput(input2);
        System.out.println(ta.toString());
        assertArrayEquals(expected,ta.getParsedNumbers(),0.0f);
        assertTrue(test2);
    }
    @Test
    public void parse3decimals(){
        String input1 = "3.3,4.4,5.5";
        String input2 ="3.3 4.4 5.5";

        float[] expected  = new float[3];
        expected[0] = 3.3F;
        expected[1] = 4.4F;
        expected[2] = 5.5F;

        boolean test1 = ta.parseInput(input1);
        System.out.println(ta.toString());
        assertArrayEquals(expected,ta.getParsedNumbers(),0.0f);
        assertTrue(test1);

        boolean test2 = ta.parseInput(input2);
        System.out.println(ta.toString());
        assertArrayEquals(expected,ta.getParsedNumbers(),0.0f);
        assertTrue(test2);
    }

    @Test
    public void parseExitCode(){

        String input1 = "0";
        float[] expectedArr  = new float[3];

        boolean actual = ta.parseInput(input1);
        assertArrayEquals(expectedArr,ta.getParsedNumbers(),0.0f);
        assertFalse(actual);
        assertTrue(ta.checkExit());

    }

    @Test public void NumberOutOfRange(){
        String input1 = "-1.0,-1000.0,-101.0";
        String input2 ="101 1000 102";
        String input3 ="2 0.75 1.0";

        float[] expected  = new float[]{0f,0f,0f};

        boolean test1 = ta.parseInput(input1);
        System.out.println(ta.toString());
        System.out.println(ta.getErrMessage());
        assertArrayEquals(expected,ta.getParsedNumbers(),0.0f);
        assertFalse(test1);

        boolean test2 = ta.parseInput(input2);
        System.out.println(ta.toString());
        System.out.println(ta.getErrMessage());
        assertArrayEquals(expected,ta.getParsedNumbers(),0.0f);
        assertFalse(test2);

        boolean test3 = ta.parseInput(input3);
        System.out.println(ta.toString());
        System.out.println(ta.getErrMessage());
        assertArrayEquals(expected,ta.getParsedNumbers(),0.0f);
        assertFalse(test3);
    }
    @Test
    public void lessThan3Inputs(){
        System.out.println("Less than 3 inputs:");
        String input1 = "1 2.0";
        String input2 = "2";
        float[] expected  = new float[3];

        boolean test1 = ta.parseInput(input1);
        System.out.println(ta.toString());
        System.out.println(ta.getErrMessage());
        assertArrayEquals(expected,ta.getParsedNumbers(),0.0f);
        assertFalse(test1);

        boolean test2 = ta.parseInput(input2);
        System.out.println(ta.toString());
        System.out.println(ta.getErrMessage());
        assertArrayEquals(expected,ta.getParsedNumbers(),0.0f);
        assertFalse(test2);

    }

    @Test
    public void moreThan3Inputs(){
        System.out.println("more than 3 inputs:");
        String input1 = "1 2 3 4";
        String input2 = "1.0,2.0,3.0,4.0,5.0";

        float[] expected  = new float[3];

        boolean test1 = ta.parseInput(input1);
        System.out.println(ta.toString());
        System.out.println(ta.getErrMessage());
        assertArrayEquals(expected,ta.getParsedNumbers(),0.0f);
        assertFalse(test1);

        boolean test2 = ta.parseInput(input2);
        System.out.println(ta.toString());
        System.out.println(ta.getErrMessage());
        assertArrayEquals(expected,ta.getParsedNumbers(),0.0f);
        assertFalse(test2);
    }

    @Test
    public void nonNumberInputs() {
        System.out.println("more than 3 inputs:");
        String input1 = "1,1,1...";
        String input2 = "hjewnjkdkjnjkq";

        float[] expected  = new float[3];

        boolean test1 = ta.parseInput(input1);
        System.out.println(ta.toString());
        System.out.println(ta.getErrMessage());
        assertArrayEquals(expected,ta.getParsedNumbers(),0.0f);
        assertFalse(test1);

        boolean test2 = ta.parseInput(input2);
        System.out.println(ta.toString());
        System.out.println(ta.getErrMessage());
        assertArrayEquals(expected,ta.getParsedNumbers(),0.0f);
        assertFalse(test2);
    }


}
