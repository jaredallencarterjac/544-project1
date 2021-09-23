package com.example.triangleapp;

import static org.junit.Assert.assertArrayEquals;


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

        float[] input1F = ta.parseInput(input1);
        float[] input2F = ta.parseInput(input2);

        assertArrayEquals(expected,input1F,0.0f);
        assertArrayEquals(expected,input2F,0.0f);
    }
    @Test
    public void parse3decimals(){
        String input1 = "3.3,4.4,5.5";
        String input2 ="3.3 4.4 5.5";

        float[] expected  = new float[3];
        expected[0] = 3.3F;
        expected[1] = 4.4F;
        expected[2] = 5.5F;

        float[] input1F = ta.parseInput(input1);
        float[] input2F = ta.parseInput(input2);

        assertArrayEquals(expected,input1F,0.0f);
        assertArrayEquals(expected,input2F,0.0f);
    }

    @Test
    public void parseExitCode(){
        String input1 = "0";
        float[] expected  = new float[]{0,0,0};
        float[] input1F = ta.parseInput(input1);
        assertArrayEquals(expected,input1F,0.0f);

    }
    @Test public void NumberOutOfRange(){
        String input1 = "-1.0,-1000.0,-101.0";
        String input2 ="101 1000 102";

        float[] expected  = new float[]{0,0,1};

        float[] input1F = ta.parseInput(input1);
        float[] input2F = ta.parseInput(input2);

        assertArrayEquals(expected,input1F,0.0f);
        assertArrayEquals(expected,input2F,0.0f);
    }
}
