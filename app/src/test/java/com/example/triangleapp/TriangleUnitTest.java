package com.example.triangleapp;

import org.junit.Test;

import static org.junit.Assert.*;
import static com.example.triangleapp.Triangle.*;

public class TriangleUnitTest {

    @Test
    public void triangleTypeEquilateral()
    {
        Triangle triangle = new Triangle();
        float[] f = {1F,1F,1F};
        assertEquals("Equilateral",triangle.triangleType(f));
        ;
    }

    @Test
    public void triangleTypeIsosceles()
    {
        Triangle triangle = new Triangle();
        float[] f = {2F,1F,1F};
        assertEquals("Isosceles",triangle.triangleType(f));
        ;
    }

    @Test
    public void triangleTypeScalene()
    {
        Triangle triangle = new Triangle();
        float[] f = {3F,2F,1F};
        assertEquals("Scalene",triangle.triangleType(f));
        ;
    }

    @Test
    public void validTriangle()
    {
        Triangle triangle = new Triangle();
        float[] f = {1F,1F,3F};
       assertFalse(triangle.validTriangle(f));
        ;
    }


}