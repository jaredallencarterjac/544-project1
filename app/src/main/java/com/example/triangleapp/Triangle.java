package com.example.triangleapp;

public class Triangle {

    /**
     * Checks to ensure the sides of the triangle inputted by the user form a valid triangle
     * @param sides float array containing the sides of the triangle
     * @return boolean stating with the sides form a valid triangle or not
     */
    public boolean validTriangle(float[] sides) {
        if(sides[0]+sides[1] <= sides[2]) {
            return false;
        }
        else if(sides[0]+sides[2] <= sides[1]) {
            return false;
        }
        else if (sides[1]+sides[2] <= sides[0]) {
            return false;
        }

        return true;
    }

    /**
     * Checks the sides of the triangle to determine its type
     * @param sides float array containing the sides of the triangle
     * @return a String stating whether the triangle is Equilateral, Isosceles, or Scalene
     */
    public String triangleType(float[] sides) {
        if(sides[0] == sides[1] && sides[1] == sides[2]) {
            return "Equilateral";
        }
        else if(sides[0] == sides[1] || sides[0] == sides[2] || sides[1] == sides[2]) {
            return "Isosceles";
        }

        return "Scalene";
    }
}
