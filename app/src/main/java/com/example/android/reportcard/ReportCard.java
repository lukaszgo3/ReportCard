package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ReportCard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ArrayList for School Subjects
        ArrayList<SchoolSubjects> schoolSubject = new ArrayList<SchoolSubjects>();
        schoolSubject.add(new SchoolSubjects("5", getString(R.string.math), "28.03.2017"));
        schoolSubject.add(new SchoolSubjects("2", getString(R.string.biology), "29.03.2017"));
        schoolSubject.add(new SchoolSubjects("4", getString(R.string.math), "02.04.2017"));
        schoolSubject.add(new SchoolSubjects("3", getString(R.string.math), "06.04.2017"));
        schoolSubject.add(new SchoolSubjects("5", getString(R.string.chemistry), "09.04.2017"));
        schoolSubject.add(new SchoolSubjects("3", getString(R.string.biology), "16.04.2017"));
        schoolSubject.add(new SchoolSubjects("3", getString(R.string.chemistry), "22.04.2017"));
        schoolSubject.add(new SchoolSubjects("2", getString(R.string.math), "28.04.2017"));
        schoolSubject.add(new SchoolSubjects("2", getString(R.string.biology), "02.05.2017"));
        schoolSubject.add(new SchoolSubjects("4", getString(R.string.chemistry), "02.05.2017"));
        schoolSubject.add(new SchoolSubjects("3", getString(R.string.biology), "16.04.2017"));
        schoolSubject.add(new SchoolSubjects("3", getString(R.string.chemistry), "22.04.2017"));
        schoolSubject.add(new SchoolSubjects("2", getString(R.string.math), "28.04.2017"));
        schoolSubject.add(new SchoolSubjects("2", getString(R.string.biology), "02.05.2017"));
        schoolSubject.add(new SchoolSubjects("4", getString(R.string.chemistry), "02.05.2017"));

        SchoolSubjectAdapter subjectAdapter = new SchoolSubjectAdapter(this, schoolSubject);
        ListView subjectView = (ListView) findViewById(R.id.subjectListID);
        subjectView.setAdapter(subjectAdapter);
    }
}
