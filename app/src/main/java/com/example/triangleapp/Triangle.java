package com.example.triangleapp;

public class Triangle {

    public String triangleType(int s1, int s2, int s3) {

        if (s1 == s2 && s2 != s3 && s1 != s3)
            return "Isosceles";
        else if (s1 == s3 && s2 != s3 && s2 != s1)
            return "Isosceles";
        else if (s2 == s3 && s3 != s1)
            return "Isosceles";
        else if (s1 == s2 && s2 == s3)
            return "Equilateral";
        else
            return "Scalene";

    }

}
