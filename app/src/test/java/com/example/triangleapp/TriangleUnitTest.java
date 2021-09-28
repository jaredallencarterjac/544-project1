package com.example.triangleapp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static com.example.triangleapp.Triangle.*;

public class TriangleUnitTest {
    private Triangle tri;
    @Before
    public void setUp(){ tri = new Triangle(); }

    @Test
    public void triangleTypeEquilateral()
    {
        float[] f = {1F,1F,1F};
        assertEquals("Equilateral",tri.triangleType(f));
        ;
    }

    @Test
    public void triangleTypeIsosceles()
    {
        float[] f = {2F,1F,1F};
        assertEquals("Isosceles",tri.triangleType(f));
        ;
    }

    @Test
    public void triangleTypeScalene()
    {
        float[] f = {3F,2F,1F};
        assertEquals("Scalene",tri.triangleType(f));
        ;
    }

    @Test
    public void validTriangle()
    {
        float[] f = {1F,1F,3F};
       assertFalse(tri.validTriangle(f));
        ;
    }

    @Test
    public void sumLessThanOrEqualToThird() {
        System.out.println("Sum less than or equal to third");
        float[] input1 = {2F, 2F, 5F};
        float[] input2 = {1F, 1F, 2F};
        float[] input3 = {1.0F, 1.0F, 2.0F};
        float[] input4 = {10.1F, 10.2F, 20.3F};

        assertFalse(tri.validTriangle(input1));
        assertFalse(tri.validTriangle(input2));
        assertFalse(tri.validTriangle(input3));
        assertFalse(tri.validTriangle(input4));
    }

    @Test
    public void sumGreaterThanThird() {
        System.out.println("Sum greater than third");
        float[] input1 = {3F, 4F, 5F};
        float[] input2 = {3.0F, 4.0F, 5.0F};
        float[] input3 = {10.1F, 10.3F, 20.3F};

        assertTrue(tri.validTriangle(input1));
        assertTrue(tri.validTriangle(input2));
        assertTrue(tri.validTriangle(input3));
    }


}