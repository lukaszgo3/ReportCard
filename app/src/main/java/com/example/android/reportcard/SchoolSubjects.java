package com.example.android.reportcard;

public class SchoolSubjects {

    //School grade (e.q. 4, 5, 2)
    private String SchoolGrade;

    //Name of subject (e.q. Math, Biology)
    private String SchoolSubject;

    //Date of the assessment
    private String SchoolDate;


    public SchoolSubjects(String mGrade, String mSubject, String mDate) {

        SchoolGrade = mGrade;
        SchoolSubject = mSubject;
        SchoolDate = mDate;
    }

    /**
     * Get the grade
     */
    public String getGrade() {
        return SchoolGrade;
    }

    /**
     * Get the name of Subject
     */
    public String getSubject() {
        return SchoolSubject;
    }

    /**
     * Get the date of assessment
     */
    public String getDate() {
        return SchoolDate;
    }
}