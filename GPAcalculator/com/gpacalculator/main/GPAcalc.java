package com.gpacalculator.main;

import java.util.Scanner;

import com.gpacalculator.models.Grade;

public class GPAcalc {
    public static void main(String[] args) {
        System.out.println("SIMPLE CGPA CALCULATION SYSTEM");
        
        Scanner i = new Scanner(System.in);
        
        System.out.print("Enter Course 1: ");
        String course1 = i.nextLine();
        
        System.out.print("Enter " + course1 + " unit: ");
        int gradeUnit1 = i.nextInt();
        
        System.out.print("Enter " + course1 + " score: ");
        double score1 = i.nextDouble();
        
        i.nextLine();
                     
        System.out.print("Enter Course 2: ");
        String course2 = i.nextLine();
        
        System.out.print("Enter " + course2 + " unit: ");
        int gradeUnit2 = i.nextInt();
                
        System.out.print("Enter " + course2 + " score: ");
        double score2 = i.nextDouble();
        
        i.nextLine();
        
        System.out.print("Enter Course 3: ");
        String course3 = i.nextLine();
        
        System.out.print("Enter " + course3 + " unit: ");
        int gradeUnit3 = i.nextInt();
        
        System.out.print("Enter " + course3 + " score: ");
        double score3 = i.nextDouble();
        
        i.nextLine();
        
        System.out.print("Enter Course 4: ");
        String course4 = i.nextLine();
        
        System.out.print("Enter " + course4 + " unit: ");
        int gradeUnit4 = i.nextInt();
        
        System.out.print("Enter " + course4 + " score: ");
        double score4 = i.nextDouble();
        
        i.nextLine();
        
        System.out.print("Enter Course 5: ");
        String course5 = i.nextLine();
        
        System.out.print("Enter " + course5 + " unit: ");
        int gradeUnit5 = i.nextInt();
        
        System.out.print("Enter " + course5 + " score: ");
        double score5 = i.nextDouble();
        
        i.close();
            
        Grade st = new Grade();        
        
        String grade1 = st.getGrade(score1);
        String grade2 = st.getGrade(score2);
        String grade3 = st.getGrade(score3);
        String grade4 = st.getGrade(score4);
        String grade5 = st.getGrade(score5);
        
        int point1 = st.getPoint(grade1);
        int point2 = st.getPoint(grade2);
        int point3 = st.getPoint(grade3);
        int point4 = st.getPoint(grade4);
        int point5 = st.getPoint(grade5);
              
        int totalGradeUnit = gradeUnit1 + gradeUnit2 + gradeUnit3 + gradeUnit4 + gradeUnit5;
        double TotalQualityPoint = (point1 * gradeUnit1) + (point2 * gradeUnit2) + (point3 * gradeUnit3) + (point4 * gradeUnit4) + (point5 * gradeUnit5);
        double Gpa = TotalQualityPoint /  totalGradeUnit;
        
        
        System.out.println("|------------|----------------|---------|--------|");
        System.out.println("|COURSE CODE |  COURSE UNIT   |  GRADE  | POINT  |");
        System.out.println("|------------|----------------|---------|--------|");
        System.out.println("|   " + course1+ "   |       " + gradeUnit1 + "        |    " + grade1 + "    |    " + point1 + "   |");
        System.out.println("|   " + course2+ "   |       " + gradeUnit2 + "        |    " + grade2 + "    |    " + point2 + "   |");
        System.out.println("|   " + course3+ "   |       " + gradeUnit3 + "        |    " + grade3 + "    |    " + point3 + "   |");
        System.out.println("|   " + course4+ "   |       " + gradeUnit4 + "        |    " + grade4 + "    |    " + point4 + "   |");
        System.out.println("|   " + course5+ "   |       " + gradeUnit5 + "        |    " + grade5 + "    |    " + point5 + "   |");
        System.out.println("|------------|----------------|---------|--------|");
        System.out.format(" Your Gpa is = %.2f", Gpa);
        System.out.println("\b to two decimal places.");
    }
}