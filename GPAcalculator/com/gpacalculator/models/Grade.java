package com.gpacalculator.models;

public class Grade {
    public String getGrade(double score) {
        String grade = "";
        if (score >= 70 && score <= 100) {
            grade = "A";
        } else if (score >= 60 && score < 70) {
            grade = "B";
        } else if (score >= 50 && score < 60) {
            grade = "C";
        } else if (score >= 45 && score < 50) {
            grade = "D";
        } else if (score >= 40 && score < 45) {
            grade = "E";
        } else if (score >= 0 && score < 40) {
            grade = "F";
        } else {
            return "Invalid Score";
        }

        return grade;
    }

    public int getPoint(String grade) {
        int gradeUnit = 0;
        switch(grade) {
            case "A":
                gradeUnit = 5;
                break;
            case "B":
                gradeUnit = 4;
                break;
            case "C":
                gradeUnit = 3;
                break;
            case "D":
                gradeUnit = 2;
                break;
            case "E":
                gradeUnit = 1;
                break;
            default:
                gradeUnit = 0;
                break;
        }
        return gradeUnit;
    }
}
