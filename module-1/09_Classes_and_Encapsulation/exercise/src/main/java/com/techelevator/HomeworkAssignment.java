package com.techelevator;

public class HomeworkAssignment {

    private int earnedMarks;
    private int possibleMarks;
    private String submitterName;


    public HomeworkAssignment(int possibleMarks, String submitterName) {
        this.possibleMarks = possibleMarks;
        this.submitterName = submitterName;
    }


    ///Get and set

    //-------------Get earned marks---------
    public int getEarnedMarks() {
        return earnedMarks;
    }
    public void setEarnedMarks(int earnedMarks) {
        this.earnedMarks = earnedMarks;
    }
//===============================================
//    ---Possible marks----
    public int getPossibleMarks() {
        return possibleMarks;
    }
//=========================================
// -------------submitterName ---------------------
    public String getSubmitterName() {
        return submitterName;
    }
   public String getLetterGrade() {

        double percentage = ((double)earnedMarks / possibleMarks) * 100;
        String letterGrade = "";

        if (percentage >= 90) {
            letterGrade = ("A");
        } else if (percentage >= 80 && percentage <= 89) {
            letterGrade = ("B");
        } else if (percentage >= 70 && percentage <= 79) {
            letterGrade = ("C");
        } else if (percentage >= 60 && percentage <= 69) {
            letterGrade = ("D");
        } else{
            letterGrade = "F";
        }
        return letterGrade;

    }
}