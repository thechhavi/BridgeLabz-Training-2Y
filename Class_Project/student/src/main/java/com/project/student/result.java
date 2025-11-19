package com.project.student;

public class result {

    public static String getResultStatus(int marks) {
        return marks >= 40 ? "PASS" : "FAIL";
    }

}