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
        assertEquals("test",ta.getInput());
    }

}