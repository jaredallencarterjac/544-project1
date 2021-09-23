package com.example.triangleapp;

public class Triangle {
    public boolean validTriangle(float[] sides) {
        if(sides[0]+sides[1] <= sides[2]) {
            return false;
        }
        else if(sides[0]+sides[2] <= sides[1]) {
            return false;
        }
        else if(sides[1]+sides[2] <= sides[0]) {
            return false;
        }

        return true;
    }

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
