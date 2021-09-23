package com.example.triangleapp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    private TriangleApp ta;
    @Before
    public void setUp(){
        ta = new TriangleApp();
    }
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void test_setInput(){
        ta.setInput("test");
        assertEquals("test",ta.input);
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
}